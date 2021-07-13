package programacaoOrientadaObjetos;

import java.text.NumberFormat;

public class Funcionario {
	// cria��o dos atributos
	private String nome;
	private double salario;

	public Funcionario(String n,double s)//construtor
	{
		this.setNome(n); // inicializa��o do atributo nome
		this.setSalario(s); // inicializa��o do atributo salario
	}
	// defini��o dos m�todos

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
		NumberFormat nf = NumberFormat.getCurrencyInstance();// pega a moeda do pais que est� configurado o SO
		nf.setMinimumFractionDigits(2);// ele formata a quantidade de casas depois da v�rgula
		String formatoMoeda = nf.format(salario);// formata a sa�da do meu valor monet�rio
		return formatoMoeda;// vou retornar o salario j� formatado
	}

	public void imprimir() {
		System.out.println(nome + "\t\t" + "Sal�rio: " + this.formatarMoeda());
	}

}
