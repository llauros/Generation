package herancaPolimorfismo;

public class Cavalo extends Animal {
	private double peso;
	private double velocidade;
	
	public Cavalo (String nome, int idade, double peso, double velocidade) {
		super(nome, idade);
		this.peso = peso;
		this.velocidade = velocidade;
		
		
	}

	
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
}
