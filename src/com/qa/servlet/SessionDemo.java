package com.qa.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("此处进行了代码修改");
		response.setContentType("text/html; charset=UTF-8");
		HttpSession session = request.getSession();
		System.out.println("请接收我的代码修改请求！！！！");
		session.setAttribute("name", "zhangsan");
		session.setAttribute("product", "CowCar");
		PrintWriter w = response.getWriter();
		w.write("<marquee>欢迎"+session.getAttribute("name")+"光临本站"+"</marquee>");
		w.write("<h1>"+session.getAttribute("name")+","+session.getAttribute("product")+"</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
