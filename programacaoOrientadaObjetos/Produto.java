package programacaoOrientadaObjetos;

import java.text.NumberFormat;

public class Produto {
	private String nome;
	private String marca;
	private double preco;
	private int quantidadeEstoque;
	private double saldoDaLoja = 1000.00;

	public Produto(String nome, String marca, double preco, int quantidadeEstoque) {
		this.setNome(nome);
		this.setMarca(marca);
		this.preco = preco;
		this.setQuantidadeEstoque(10);
	}

	public void comprar(int quantidadeItem) {
		if (quantidadeItem > quantidadeEstoque || quantidadeItem == 0) {
			System.out.println("Ou não temos tudo isso ou você comprou 0 produtos");
		} else {
			quantidadeEstoque -= quantidadeItem;
			saldoDaLoja = saldoDaLoja + quantidadeItem * preco;
			System.out.println("Paraben pela compra");
		}
	}

	public void devolucao(int quantidadeItem) {
		if (quantidadeItem > quantidadeEstoque || quantidadeItem == 0) {
			System.out.println("Ou não temos tudo isso ou você devolveu 0 produtos");
		} else {
			quantidadeEstoque += quantidadeItem;
			saldoDaLoja = saldoDaLoja - quantidadeItem * preco;
			System.out.println("Sentimos muito");
		}
	}

	public void mostrarProduto() {
		System.out.printf("Nome: %s Preco: %d ");
	}
	

	/*
	 * GET SET
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public double getPreco() {
		return preco;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
