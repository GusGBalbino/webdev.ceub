package aula02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletQualSeuNome
 */
@WebServlet("/ServletQualSeuNome")
public class ServletQualSeuNome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletQualSeuNome() {
        super();
        // TODO Auto-generated constructor stub
    }

   	/**
   	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   	 */
       @Override
       protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		PrintWriter saida = response.getWriter();
   		saida.write("<HTML><BODY>Ol�!");
   		saida.write(" Qual o seu nome?");
   		saida.write("</BODY></HTML>");
   		saida.close();
   	}

   	/**
   	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   	 */
       @Override
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		PrintWriter saida = response.getWriter();
   		saida.write("<HTML><BODY>Ol�!");
   		saida.write("Meu nome � Gustavo Gomes Balbino");
   		saida.write("</BODY></HTML>");
   		saida.close();
   	}

   }