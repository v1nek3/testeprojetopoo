package sistema.modelos;

import java.util.ArrayList;

public class Usuario {
	private int id_usuario;
	private String senha;
	private ArrayList<Papel> papeis = new ArrayList<Papel>();
	
	public int getId() {
		return id_usuario;
	}
	public void setId(int id) {
		this.id_usuario = id;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public ArrayList<Papel> getPapeis() {
		return papeis;
	}
	public void setPapeis(ArrayList<Papel> papeis) {
		this.papeis = papeis;
	}
}
