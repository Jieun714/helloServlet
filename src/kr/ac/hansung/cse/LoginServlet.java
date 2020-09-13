package kr.ac.hansung.cse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//read form data
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//Process 절차가 필요 ->DB에 접근해서 사용 할 때 or 비즈니스 로직을 사용 할 때
		
		//Build HTML code 
		//동적 페이지 생성. 사용자마다 username과 password가 다르기 때문.
		PrintWriter out =response.getWriter();
		
		String htmlResponse ="<html>";
		htmlResponse += "<h2> Your username is "+ username + "<br/>";
		htmlResponse += "<h2> Your password is "+ password + "<br/>";
		htmlResponse += "</html>";
		
		out.println(htmlResponse);
	}

}
