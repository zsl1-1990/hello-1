package com.qa.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieDemno extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie cookie2 = new Cookie("name", "lisi");
		response.addCookie(cookie2);
		
//		Enumeration<String> names = request.getHeaderNames();
//		while(names.hasMoreElements()){
//			String header = request.getHeader(names.nextElement());
//			System.out.println(names+":"+header);
//		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
