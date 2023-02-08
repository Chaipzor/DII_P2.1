package dam2.dii.p21.servicios;

import java.util.ArrayList;

import dam2.dii.p21.dao.UsuarioDAO;
import dam2.dii.p21.model.Usuario;

public class UsuarioService {

	
	//Devuelve -1 si no existe el email o "i" en caso de que exista.
	public int comprobarEmail(String email) {
		int comprobacion = -1;
		for(int i = 0; i<UsuarioDAO.getListaUsuarios().size();i++) {
			if(email.equalsIgnoreCase(UsuarioDAO.getListaUsuarios().get(i).getEmail())) {
				comprobacion = i;
			}
		}
		return comprobacion;
	}
	
	public int comprobarPass(int comprobacionEmail,String pass) {
		if(pass.equals(UsuarioDAO.getListaUsuarios().get(comprobacionEmail).getPass())) {
			return 1;
		}
		return 0;
	}
	
	public int comprobarDatos(String email, String pass) {
		int comprobacion;
		int comprobacionEmail = comprobarEmail(email);
		if(comprobacionEmail != -1) {
			int comprobacionPass = comprobarPass(comprobacionEmail,pass);
			return comprobacionPass;
		} else {
			return -1;
		}
	}
	
	public boolean comprobacionDoblePass(String pass, String pass2) {
		if(pass.equals(pass2)) {
			return true;
		}
		return false;
	}
	
}
