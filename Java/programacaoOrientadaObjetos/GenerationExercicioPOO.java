package programacaoOrientadaObjetos;

import java.util.Scanner;

public class GenerationExercicioPOO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Funcionario[] listaFuncionarios = new Funcionario[4];

		listaFuncionarios[0] = new Funcionario("Rafael", 5000);
		listaFuncionarios[1] = new Funcionario("Jooh", 7000);
		listaFuncionarios[2] = new Funcionario("Jakers", 6000);
		listaFuncionarios[3] = new Funcionario("Samuel Santos", 20000);

		for (Funcionario funcionario: listaFuncionarios) {
			funcionario.imprimir();
		}

		System.out.println("LU�S--LU�S--LU�S--LU�S--LU�S--LU�S--LU�S--");
		for (Funcionario funcionario : listaFuncionarios) {
			funcionario.aumentarSalario(10);
			funcionario.imprimir();
		}

		sc.close();
	}

}
