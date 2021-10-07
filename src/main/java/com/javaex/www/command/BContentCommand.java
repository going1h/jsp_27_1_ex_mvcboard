package com.javaex.www.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaex.www.dao.BDao;
import com.javaex.www.dto.BDto;

	public class BContentCommand implements BCommand {
	
		public BContentCommand() {
			// TODO Auto-generated constructor stub
		}
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse respone) {
		// TODO Auto-generated method stub
		String bid = request.getParameter("bid");
		BDao dao = new BDao();
		BDto dto =dao.contentView(bid);
		
		System.out.println(bid);
		request.setAttribute("content_view", dto);
	}
}
