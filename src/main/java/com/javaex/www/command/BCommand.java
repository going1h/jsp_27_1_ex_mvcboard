package com.javaex.www.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BCommand { // ǥ��. �ܼ�Ʈ,cŸ�� ó�� ������ �����ϰ� ���ֱ� ���ؼ� ��� (execute) = ���� ����
	void execute(HttpServletRequest request, HttpServletResponse respone);
}
