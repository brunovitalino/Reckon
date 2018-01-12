package br.com.k3sistemas.Reckon.entity;

public class UsuarioPOJO {
	private String usuario;
	private String senha;
	private Boolean usuarioValido;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Boolean getUsuarioValido() {
		return usuarioValido;
	}
	public void setUsuarioValido(Boolean usuarioValido) {
		this.usuarioValido = usuarioValido;
	}
}
