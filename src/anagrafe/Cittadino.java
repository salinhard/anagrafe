package anagrafe;

public class Cittadino {
	
	private String nome;
	
	
	
	private String cognome;
	private String nato_a;
	private String nato_il;
	
	
	public Cittadino() {
		
		nome = "";
		cognome = "";
		nato_a = "";
		nato_il= "";
	}
	
	// GETTER E SETTER

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getNato_a() {
		return nato_a;
	}


	public void setNato_a(String nato_a) {
		this.nato_a = nato_a;
	}


	public String getNato_il() {
		return nato_il;
	}


	public void setNato_il(String nato_il) {
		this.nato_il = nato_il;
	}


}
