package com.javaex.www.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BCommand { // 표준. 콘센트,c타입 처럼 형식을 통일하게 해주기 위해서 사용 (execute) = 형식 통일
	void execute(HttpServletRequest request, HttpServletResponse respone);
}
