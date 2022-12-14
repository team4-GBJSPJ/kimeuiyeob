package com.milestone.app.individual;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.milestone.app.Execute;
import com.milestone.app.Result;
import com.milestone.app.individual.dao.IndividualDAO;
import com.milestone.app.individual.vo.IndividualDTO;

public class RankingOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		Result result = new Result();
		IndividualDTO individualDTO = new IndividualDTO();
		IndividualDAO individualDAO = new IndividualDAO();
		
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		 req.setAttribute("ranking", individualDAO.selectRanking());
		 
		 
		 int individualMemberNumber = (Integer)req.getSession().getAttribute("individualMemberNumber");
		 
		 System.out.println("select ranking 들어옴!");
		 System.out.println(individualMemberNumber);

		result.setPath("/app/donation/donationRanking.jsp");
		
		return result;
	}

}
