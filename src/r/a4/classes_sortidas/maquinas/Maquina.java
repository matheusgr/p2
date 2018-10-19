package r.a4.classes_sortidas.maquinas;

public class Maquina {

	
	private String nome;
	private String status;
	private String ocupante;
	
	public Maquina(String nome) {
		this(nome, "DOWN");
	}
	
	public Maquina(String nome, String status) {
		this.nome = nome;
		this.status = status;
		this.ocupante = null;
	}

	public void up() {
		this.status = "UP";
	}
	
	public void down() {
		this.status = "DOWN";
	}

	public String getNome() {
		return this.nome;
	}

	public void ocupa(String matricula) {
		this.ocupante = matricula;
	}
	
	public void libera() {
		this.ocupante = null;
	}

	@Override
	public String toString() {
		return "Maquina [nome=" + nome + ", status=" + status + "]";
	}

	public String getStatus() {
		return this.status;
	}

	public String getOcupante() {
		return this.ocupante;
	}

	public boolean isOcupada() {
		return this.ocupante != null;
	}

	
	
}