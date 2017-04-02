package sistema.modelos;

import java.util.ArrayList;

import sistema.papeis.Diretor;
import sistema.papeis.Jogador;
import sistema.papeis.Massagista;
import sistema.papeis.Tecnico;

public class Time {
	
	private String nome;
	private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	private Tecnico tecnico;
	private Diretor diretor;
	private Massagista massagista;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}
	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	public Tecnico getTecnico() {
		return tecnico;
	}
	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	public Diretor getDiretor() {
		return diretor;
	}
	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}
	public Massagista getMassagista() {
		return massagista;
	}
	public void setMassagista(Massagista massagista) {
		this.massagista = massagista;
	}
}
