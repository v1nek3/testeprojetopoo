package sistema.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Usuario;
import sistema.security.SecurityConfig;

@ManagedBean(name="mbUsuario")
@SessionScoped
public class UsuarioBean {
	private SecurityConfig userSecurity;
	private Usuario novoUsuario = new Usuario();
	
	public Usuario getNovoUsuario() {
		return novoUsuario;
	}
	public void setNovoUsuario(Usuario novoUsuario) {
		this.novoUsuario = novoUsuario;
	}
	
	public String salvarUsuario() throws Exception{
		userSecurity.addUser(novoUsuario);
		novoUsuario = new Usuario();
		return "login";
	}
}
