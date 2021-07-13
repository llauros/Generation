package Herenca;

public class Operario extends Pessoa{
	private double valorProducao;
	private double comissao;
	
	public Operario(String nome, int idade, String cpf, double valorProducao, double comissao) {
		super(nome, idade, cpf);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public void imprimirInfo() {
		System.out.printf("\nNome do operario: %s Idade: %d\nValor producao: %.2f Salario: %.2f", getNome(), getIdade(), valorProducao, comissao);
	}
	
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
}
