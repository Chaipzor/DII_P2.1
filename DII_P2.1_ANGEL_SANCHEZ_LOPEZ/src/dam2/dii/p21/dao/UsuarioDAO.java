package dam2.dii.p21.dao;

import java.util.ArrayList;

import dam2.dii.p21.model.Usuario;

public class UsuarioDAO {
	
	private static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>() {{
		add(new Usuario("Angel","Sanchez Lopez","chaip@gmail.com",666555444,"1234"));
		add(new Usuario("Michael","Jackson","MJ@gmail.com",111111111,"1234"));
		add(new Usuario("Paco","Hernandez","PH@gmail.com",999999999,"1234"));
	}};
	
	public static ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public static void setListaUsuarios(Usuario usuario) {
		listaUsuarios.add(usuario);
	}
	
}
