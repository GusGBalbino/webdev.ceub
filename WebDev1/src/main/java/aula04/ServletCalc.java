package aula04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletCalc
 */
@WebServlet("/ServletCalc")
public class ServletCalc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCalc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String svalorA = request.getParameter("valorA");
		String svalorB = request.getParameter("valorB");
		String soperacao = request.getParameter("operacao");
		
		double dvalorA = Double.parseDouble(svalorA);
		double dvalorB = Double.parseDouble(svalorB);
		double result = 0;
		
		if(soperacao.equals("+")) {
			result = dvalorA + dvalorB;
		}else if(soperacao.equals("-")) {
			result = dvalorA - dvalorB;
		}else if(soperacao.equals("*")) {
			result = dvalorA * dvalorB;
		}else if(soperacao.equals("/")) {
			result = dvalorA / dvalorB;
		}
		
		out.print("Resultado:<br>"+result);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
