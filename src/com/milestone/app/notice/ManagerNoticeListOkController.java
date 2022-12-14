package com.milestone.app.notice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.milestone.app.Execute;
import com.milestone.app.Result;
import com.milestone.app.notice.dao.NoticeDAO;
import com.milestone.app.notice.vo.NoticeVO;

public class ManagerNoticeListOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			Result result = new Result();

			NoticeVO noticeVO = new NoticeVO();
			NoticeDAO noticeDAO = new NoticeDAO();
			
			System.out.println("노티스들어옴!");

			req.setCharacterEncoding("UTF-8");
			resp.setCharacterEncoding("UTF-8");
	 		
			req.setAttribute("notice", noticeDAO.selectNoticeManager());
			System.out.println(noticeDAO.selectNoticeManager());
			
			result.setPath("/app/manager/milestoneManagerNoticeManagement.jsp");
			return result;
		}

}
