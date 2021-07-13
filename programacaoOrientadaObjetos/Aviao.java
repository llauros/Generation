package programacaoOrientadaObjetos;

public class Aviao {
	private String marca;
	private String modelo;
	private boolean comercial;
	private int capacidadeDeTransporte;
	private int ano;
	private boolean emCurso;
	private double velocidade;

	public Aviao(String marca, String modelo, boolean comercial, int capacidadeDeTransporte, int ano, boolean emCurso, double velocidade) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setComercial(comercial);
		this.setCapacidadeDeTransporte(800);
		this.setAno(ano);
		this.setEmCurso(false);
		this.setVelocidade(0.00);
	}

	public Aviao(String marca, String modelo, int ano) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
	}

	public void mostrarAviao() {
		System.out.printf("-----------------\nMarca: %s Modelo: %s\nCapacidade de lotação: %d " + "Ano: %d", marca,
				modelo, capacidadeDeTransporte, ano);
	}

	public void entrarEmCurso() {
		emCurso = true;
		velocidade = 200.0;
	}

	public void pousar() {
		emCurso = false;
		velocidade = 0.00;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isComercial() {
		return comercial;
	}

	public void setComercial(boolean comercial) {
		this.comercial = comercial;
	}

	public int getCapacidadeDeTransporte() {
		return capacidadeDeTransporte;
	}

	public void setCapacidadeDeTransporte(int capacidadeDeTransporte) {
		this.capacidadeDeTransporte = capacidadeDeTransporte;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isEmCurso() {
		return emCurso;
	}

	public void setEmCurso(boolean emCurso) {
		this.emCurso = emCurso;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

}
