package com.milestone.app.individualcommunity;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.milestone.app.Execute;
import com.milestone.app.Result;

public class InboardOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Result result = new Result();

		result.setRedirect(true);
		result.setPath(req.getContextPath() + "/app/board/indiBoard.jsp");
		return result;
	}

}
