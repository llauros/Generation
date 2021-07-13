package programacaoOrientadaObjetos;

public class Cliente {
	private String nome;
	private int idade;
	private String documento;
	private String email;
	private String endereco;

	/*
	 * CONSTRUTORES
	 */

	public Cliente(String nome, int idade, String documento) {
		this.nome = nome;
		this.idade = idade;
		this.documento = documento;
	}

	public Cliente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	/*
	 * METODOS / FUNÇÕES
	 */
	public void mostrarCliente() {
		System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nDocumento: " + documento);
	}

	/*
	 * GET e SET
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
