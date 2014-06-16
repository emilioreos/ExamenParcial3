package reos.Examen.Parcial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculadora
 */
public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Calculadora() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String x=request.getParameter("x");
		String y=request.getParameter("y");
		String operacion=request.getParameter("operacion");
		double res=0;
		int w=0;
		if(operacion.equalsIgnoreCase("mas"))
			w=1;
		if(operacion.equalsIgnoreCase("por"))
			w=2;
		if(operacion.equalsIgnoreCase("menos"))
			w=3;
		if(operacion.equalsIgnoreCase("divicion"))
			w=4;
		
		switch(w){
		case 1: res=Double.parseDouble(x)+Double.parseDouble(y);
					break;
		case 2:res=Double.parseDouble(x)*Double.parseDouble(y);
		break;
		case 3:res=Double.parseDouble(x)-Double.parseDouble(y);
		break;
		case 4:res=Double.parseDouble(x)/Double.parseDouble(y);
		break;
		}
		
		PrintWriter writer=response.getWriter();
		writer.print(""
				+ "<html>"
				+ "<head>"
				+ "<title>Resultado</title>"
				+ "</head>"
				+ "<body>"
				+ x+" "+operacion+" "+y+"="+res
				+ "</body>"
				+ "</html>");
	}

}
