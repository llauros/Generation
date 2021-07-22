package sobrecargaDeMetodos;

public class Funcionario {
	String nome;
	double salario;
	
	public Funcionario(String nomeDoFuncionario, double salarioDoFuncionario){
		nome = nomeDoFuncionario;
		salario = salarioDoFuncionario;
	}
	
	
	public void mostrarInfo() {
		System.out.println("Nome: " + nome + "\nSalario: " + salario);
	}
	
	
	//Dois metodos com o mesmo nome
	//Metodos com o mesmo nome mas de diferentes tipod e diferentes parametros
	
	public int aumentarSalario(int valorInt) {
		this.salario += valorInt; 
		return valorInt * valorInt;
	}
	
	public double aumentarSalario(double valorDouble) {
		this.salario += valorDouble; 
		return valorDouble * valorDouble;
	}
}
