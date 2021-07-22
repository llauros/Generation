package Herenca;

public class Fornecedor extends Pessoa{
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(String nome, int idade, String cpf, double valorCredito, double valorDivida) {
		super(nome, idade, cpf);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public void imprimirInfo() {
		System.out.printf("\nNome do operario: %s Idade: %d\nValor credito: %.2f Valor divida: %.2f", getNome(), getIdade(), valorCredito, valorDivida);
	}
	
	public void obterSaldo() {
		double diferencaCredito = valorCredito - valorDivida;
		System.out.printf("O saldo referente ao fornecedor é igual a: %f", diferencaCredito);
	}
}
