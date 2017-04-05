package sistema.modelos;

import java.util.Date;

public class Jogo {
	private Date data;
	private Time timeA;
	private Time timeB;
	private Local local;
	private Usuario arbitro;
	private Relatorio relatorio;
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Time getTimeA() {
		return timeA;
	}
	public void setTimeA(Time timeA) {
		this.timeA = timeA;
	}
	public Time getTimeB() {
		return timeB;
	}
	public void setTimeB(Time timeB) {
		this.timeB = timeB;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public Usuario getArbitro() {
		return arbitro;
	}
	public void setArbitro(Usuario arbitro) {
		this.arbitro = arbitro;
	}
	public Relatorio getRelatorio() {
		return relatorio;
	}
	public void setRelatorio(Relatorio relatorio) {
		this.relatorio = relatorio;
	}
	
	
}
