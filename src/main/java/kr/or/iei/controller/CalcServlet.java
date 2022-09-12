package kr.or.iei.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet(name = "Calc", urlPatterns = { "/calc.do" })
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.인코딩
		request.setCharacterEncoding("utf-8");
		//2.값추출
		int su1 = Integer.parseInt(request.getParameter("su1"));
		int su2 = Integer.parseInt(request.getParameter("su2"));
		String oper = request.getParameter("oper");
		int result=0;
		
		if(oper.equals("+")) {
			result = su1+su2;
		} else if(oper.equals("-")){
			result = su1-su2;
		} else if(oper.equals("*")) {
			result = su1*su2;
		} else if(oper.equals("/")) {
			result = su1/su2;
		} else if(oper.equals("%")) {
			result = su1%su2;
		}
		
		response.setContentType("text/html;charSet=utf-8");
		PrintWriter out = response.getWriter();;
		
		
		out.println("<!DOCTYPE html>");
		out.println("<html><head><title>연산 결과</title></head>");
		out.println("<body>");
		out.println("<h1>연산 결과</h1>");
		out.println("<hr>");
		out.println("<h2>"+su1+oper+su2+" = "+result+"</h2>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
