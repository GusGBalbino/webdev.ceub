package aula04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTela1Cadastro
 */
@WebServlet("/ServletTela1Cadastro")
public class ServletTela1Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTela1Cadastro() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter resposta = response.getWriter();
		
		resposta.write("<html>");
		resposta.write("<head>");
		resposta.write("<title>Dados Profissionais</title>");
		resposta.write("</head>");
		resposta.write("<body>");
		resposta.write("<Preencha seus dados profissionais:>");
		resposta.write("<form action=\"ServletTela2Cadastro\">");
		resposta.write("<Empresa:<input type=\"text\"name\"empresa\"> <BR>");
		resposta.write("Endereço profissional: <BR>");
		resposta.write("<html>");
		resposta.write("<Rua:<input type=\"text\"name=\"ruaEmpresa\">");
		resposta.write("<Cidade:<input type=\"text\"name=\"cidadeEmpresa\">");
		resposta.write("<Estado:<input type=\"text\"name=\"estadoEmpresa\"> <BR>");
		resposta.write("<CEP:<input type=\"text\"name=\"cepEmpresa\"> <BR>");
		resposta.write("<Complemento:<input type=\"text\"name=\"compEmpresa\"> <BR>");
		resposta.write("<input type=\"submit\" value=\"Confirmar\"><BR>");
		resposta.write("</form>");
		
	}

}
