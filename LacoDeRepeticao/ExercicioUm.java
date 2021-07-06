/*
  	A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
	coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
	a) média do salário da população;
	b) média do número de filhos;
	c) maior salário;
	d) percentual de pessoas com salário até R$1000,00.
 */

package LacoDeRepeticao;

import java.util.Scanner;

public class ExercicioUm {
	public static void main(String[] args) {
		int numeroDeFilhos, quantidadeDeHabitantes = 0, quantidadeHabitantesSalarioMinimo = 0;
		double salario, somaTotalSalarios = 0, maiorSalario = 0, mediaSalarial = 0;
		double numeroTotalDeFilhos = 0, mediaNumeroDeFilhosPorH, percentHabitantesSalarioMinimo;
		String novoHabitante;
		Scanner entrada = new Scanner(System.in);

		System.out.println("\t\tCadastro novo habitante - Generation :)");

		for (int x = 1; x <= 20; x++) {

			// Entrada e Calculo de dados
			System.out.print("Informe o salário: ");
			salario = entrada.nextDouble();
			somaTotalSalarios += salario;

			// Verificando o maior Salario
			maiorSalario = salario > maiorSalario ? salario : maiorSalario;

			System.out.print("Informe o numero de filhos: ");
			numeroDeFilhos = entrada.nextInt();
			numeroTotalDeFilhos += numeroDeFilhos;

			// Contando a quantidade de Habitantes
			quantidadeDeHabitantes++;
			quantidadeHabitantesSalarioMinimo = salario <= 1000.00 ? ++quantidadeHabitantesSalarioMinimo
					: quantidadeHabitantesSalarioMinimo;

			System.out.println(quantidadeDeHabitantes + " - " + quantidadeHabitantesSalarioMinimo);
			System.out.println("Deseja cadastrar novo funcionário? Sim/Não");
			novoHabitante = entrada.next();
			if (novoHabitante.equals("Nao") || novoHabitante.equals("nao") || novoHabitante.equals("n"))
				break;
		}

		mediaNumeroDeFilhosPorH = numeroTotalDeFilhos / quantidadeDeHabitantes;
		mediaSalarial = somaTotalSalarios / quantidadeDeHabitantes;
		percentHabitantesSalarioMinimo = quantidadeHabitantesSalarioMinimo * quantidadeDeHabitantes / 100;

		System.out.print("\n\t ----------------- ");
		System.out.printf("\nMedia salarial: %.2f", mediaSalarial);
		System.out.printf("\nMedia de numeros de filhos: %.2f", mediaNumeroDeFilhosPorH);
		System.out.printf("\nMaior salário: %.2f", maiorSalario);
		System.out.printf("\n%f de pessoas recebem salário minimo", percentHabitantesSalarioMinimo);
		System.out.print("\n\t ----------------- ");

		System.out.println("Fim");
	}
}
// percentHabitantesSalarioMinimo Está sendo calculado incorretamente