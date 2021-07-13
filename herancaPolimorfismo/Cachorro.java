package herancaPolimorfismo;

public class Cachorro extends Animal{
	private String raca;
	private String nomeDono;
	
	public Cachorro(String nome, int idade, String raca, String nomeDono) {
		super(nome, idade);
		this.raca = raca;
		this.nomeDono = nomeDono;
	}

	//Metodos
	
	
	public void emitirSom() {
		System.out.println("Estou emitindo um som:\nAuau Auau !!");
	}
	
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}
	
	
}
