package com.javaex.www.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaex.www.dao.BDao;
import com.javaex.www.dto.BDto;

public class BListCommand implements BCommand {

	public BListCommand() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse respone) {
		// TODO Auto-generated method stub
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		request.setAttribute("list", dtos);
	}
}
