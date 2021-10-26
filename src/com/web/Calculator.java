package com.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dao.Sungjukdao;
import com.web.vo.Sungjukvo;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Sungjukvo vo = new Sungjukvo();

	private Sungjukdao dao = new Sungjukdao();

	public Calculator() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		vo.setName(request.getParameter("name").trim());
		vo.setId(request.getParameter("id").trim());
		vo.setKorea(request.getParameter("korea").trim());
		vo.setEnglish(request.getParameter("english").trim());
		vo.setMath(request.getParameter("math").trim());

		int result = dao.register(vo);

		String name = request.getParameter("name");
		String id = request.getParameter("id");

		String koreascore = request.getParameter("korea");
		int korea = Integer.parseInt(koreascore);
		String englishscore = request.getParameter("english");
		int english = Integer.parseInt(englishscore);
		String mathscore = request.getParameter("math");
		int math = Integer.parseInt(mathscore);

		int totalscore = korea + english + math;
		double average = totalscore / 3;
		String grade = " ";

		if (average >= 90) {
			grade = "A";
		} else if (average >= 80) {
			grade = "B";
		} else if (average >= 70) {
			grade = "C";
		} else if (average >= 60) {
			grade = "D";
		} else if (average >= 50) {
			grade = "F";
		}

		request.setAttribute("name", name);
		request.setAttribute("id", id);
		request.setAttribute("korea", korea);
		request.setAttribute("english", english);
		request.setAttribute("math", math);
		request.setAttribute("total", totalscore);
		request.setAttribute("average", average);
		request.setAttribute("grade", grade);

		RequestDispatcher dispatcher = request.getRequestDispatcher("Result.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
