package dam2.dii.p21.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dam2.dii.p21.servicios.UsuarioService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
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
		String texto;
		String referencia = "/jsp/index.jsp";
		boolean repetir = false;
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		int comprobacion = new UsuarioService().comprobarDatos(email,pass);
		//Usuario no existe.
		if(comprobacion == -1) {
			texto = "El email no está dado de alta.";
			referencia = "/jsp/registro.jsp";
		} else if(comprobacion == 0) {
			texto = "Contraseña incorrecta. Vuelva a intentarlo.";
			repetir = true;
			referencia = "/jsp/login.jsp";
		} else {
			texto = "Hola " + email;
			request.getSession().setAttribute("email",email);
		}
		
		request.setAttribute("repetir", repetir);
		request.setAttribute("texto", texto);
		request.getRequestDispatcher(referencia).forward(request, response);
	}

}
