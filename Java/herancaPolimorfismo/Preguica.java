package herancaPolimorfismo;

public class Preguica extends Animal {
	private String especie;
	private String habitat;
	
	public Preguica (String nome, int idade, String especie, String habitat) {
		super(nome, idade);
		this.especie = especie;
		this.habitat = habitat;
	}
	
	

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	
}
