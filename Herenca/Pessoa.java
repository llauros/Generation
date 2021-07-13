package Herenca;

public class Pessoa {
	private String nome;
	private String endereco;
	private String cpf;
	private int telefone;
	private int idade;
	
	public Pessoa (String nome, int idade, String cpf) {
		super();//Todos os atributos que vou inicializar é da superClasse
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	public void validarCpf() {
		if (getCpf().length() != 11) {
			System.out.println("CPF invalido");
		} else {
			System.out.println("CPF valido");
		}
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
