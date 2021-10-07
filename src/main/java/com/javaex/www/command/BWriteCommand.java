package com.javaex.www.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaex.www.dao.BDao;

public class BWriteCommand implements BCommand {
	public BWriteCommand() {
		
	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse respone) {
		// TODO Auto-generated method stub
		
		String bname = request.getParameter("bname");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		
		BDao dao = new BDao();
		dao.write(bname, btitle, bcontent);
	}
}
