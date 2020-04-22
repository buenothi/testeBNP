package br.testeBNP.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.testeBNP.Dominio.Movimento_Manual;
import br.testeBNP.Service.Movimento_ManualService;

@WebServlet("/MovimentoManualServlet")
public class MovimentoManualServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private Movimento_Manual movimentoManual = new Movimento_Manual();
	private Movimento_ManualService movManualService = new Movimento_ManualService();
       
    public MovimentoManualServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
;
		this.movimentoManual.setAnoMovimento(Integer.parseInt(request.getParameter("ano")));
		this.movimentoManual.setMesMovimento(Integer.parseInt(request.getParameter("mes")));
		this.movimentoManual.setCodigoProduto(Integer.parseInt(request.getParameter("produto")));
		this.movimentoManual.setCodigoCOSIF(Long.parseLong(request.getParameter("COSIF")));
		this.movimentoManual.setValorMovimento(Double.parseDouble(request.getParameter("valor")));
		this.movimentoManual.setDescricaoMovimento(request.getParameter("descricao"));
		
		movManualService.createOrUpdate(this.movimentoManual);
		
		response.sendRedirect("index.jsp");
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
