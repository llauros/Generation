package programacaoOrientadaObjetos;

import java.text.NumberFormat;

public class Funcionario {
	// criação dos atributos
	private String nome;
	private double salario;

	public Funcionario(String n,double s)//construtor
	{
		this.setNome(n); // inicialização do atributo nome
		this.setSalario(s); // inicialização do atributo salario
	}
	// definição dos métodos

	public void aumentarSalario(double percentual)// 10 5000
	{
		salario *= 1 + percentual / 100; // salario = salario * (1+percentual/100)
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();// pega a moeda do pais que está configurado o SO
		nf.setMinimumFractionDigits(2);// ele formata a quantidade de casas depois da vírgula
		String formatoMoeda = nf.format(salario);// formata a saída do meu valor monetário
		return formatoMoeda;// vou retornar o salario já formatado
	}

	public void imprimir() {
		System.out.println(nome + "\t\t" + "Salário: " + this.formatarMoeda());
	}

}
