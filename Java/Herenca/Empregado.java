package Herenca;

public class Empregado extends Pessoa {
	private int codigoSetor;
	private String funcao;
	private double salario;
	private double imposto;

	public Empregado(String nome, int idade, String cpf, String funcao, double salario) {
		super(nome, idade, cpf);
		this.funcao = funcao;
		this.salario = salario;
		
		this.imposto = 10.0;
	}
	
	public void imprimirInfo() {
		System.out.printf("\nNome do empregado: %s Idade: %d\nFunção: %s Salario: %.2f", getNome(), getIdade(), getFuncao(), salario);
	}
	
	public void calcularSalario() {
		double salarioTotal = salario - (salario * (imposto/100) );
		System.out.printf("O salario total a ser recebido pelo funciinario %s é igual a %.2f", getNome(), salarioTotal);
	}
	/*
	 * 
	 */

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	
}
