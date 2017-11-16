package br.com.k3sistemas.Reckon.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.k3sistemas.Reckon.entity.Usuario;

@Path("/loginService")
public class LoginService {
	
	@POST
	@Path("/validarUsuario")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Usuario validarUsuario(Usuario usuario) {
		usuario.setUsuarioValido(false);
		if (usuario.getUsuario().equals("admin") && usuario.getSenha().equals("admin"))
			usuario.setUsuarioValido(true);
		return usuario;
	}
}
