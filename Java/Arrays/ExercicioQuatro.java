/*
 * Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um
	menu de op��es:
	(1) somar as duas matrizes
	(2) subtrair a primeira matriz da segunda
	(3) adicionar uma constante as duas matrizes
	(4) imprimir as matrizes
	Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o o valor
	da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na
	pr�pria matriz.
 */
package Arrays;

import java.util.Scanner;

public class ExercicioQuatro {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int matrizA[][] = new int[2][2];
		int matrizB[][] = new int[2][2];
		int matrizRes[][] = new int[2][2];
		int opcaoComNum = 0;
		int valor;
		String opcoes = "";

		System.out.println("\tMatriz 2 x 2 - Generation :)");

		do {

			for (int x = 0; x < 2; x++) {
				for (int y = 0; y < 2; y++) {
					System.out.printf("Entre com o %d valor: ", (x + y + 1));
					matrizA[x][y] = leia.nextInt();
				}
			}

			System.out.println("\n\tValores para segunda matriz...");

			for (int x = 0; x < 2; x++) {
				for (int y = 0; y < 2; y++) {
					System.out.printf("Entre com o %d valor: ", (x + y + 1));
					matrizB[x][y] = leia.nextInt();
				}
			}

			// Op��es para o usu�rio
			
			do {
			System.out.print("-----------------------------------------\n\t");
			System.out.println("O que deseja fazer com as matrizes? :)");
			System.out.print(
					"1) Somar\n2) subtrair\n3) Adicionar uma constante as duas\n4) Imprimir\n5) Refazer :(\nOp��o: ");

			/*
			 * 
			 * ESCOLHA DO USU�RIO
			 * 
			 */

				opcaoComNum = leia.nextInt();

				if ( !(opcaoComNum >= 1 && opcaoComNum <= 5) )
					System.out.println("Parece que digitou incorretamente...\n\n");
				
			} while (!(opcaoComNum >= 1 && opcaoComNum <= 5));

			// Opera��es Somar e subtrair

			switch (opcaoComNum) {
			case 1: // SOMANDO AS DUAS MATRIZES

				for (int x = 0; x < 2; x++) {
					for (int y = 0; y < 2; y++) {
						matrizRes[x][y] = matrizA[x][y] + matrizB[x][y];
					}
				}

				System.out.println("\t-------------------------\n\tMatrizes Somadas");
				for (int x = 0; x < 2; x++) {
					for (int y = 0; y < 2; y++) {
						System.out.print("\t" + matrizRes[x][y]);
					}
					System.out.println("");
				}

				break;

			case 2: // SUBTRAINDO AS DUAS MATRIZES
				for (int x = 0; x < 2; x++) {
					for (int y = 0; y < 2; y++) {
						matrizRes[x][y] = matrizA[x][y] - matrizB[x][y];
					}
				}

				System.out.println("\t-------------------------\n\tMatrizes Subtraidas");
				for (int x = 0; x < 2; x++) {
					for (int y = 0; y < 2; y++) {
						System.out.print("\t" + matrizRes[x][y]);
					}
					System.out.println("");
				}
				break;
			case 3: // ADICIONANDO UMA CONSTANTE
				System.out.print("Qual valor inicial gostaria de adicionar na nas matrizes? ");
				valor = leia.nextInt();

				System.out.println("\t-------------------------");
				for (int x = 0; x < 2; x++) {
					for (int y = 0; y < 2; y++) {
						matrizA[x][y] += valor;
						System.out.print("\t" + matrizA[x][y]);
					}
					System.out.println("");
				}

				System.out.println("\t-------------------------");
				for (int x = 0; x < 2; x++) {
					for (int y = 0; y < 2; y++) {
						matrizB[x][y] += valor;
						System.out.print("\t" + matrizB[x][y]);
					}
					System.out.println("");
				}

				break;
			case 4: // IMPRIMINDO MATRIZES
				System.out.println("\t-------------------------");
				for (int x = 0; x < 2; x++) {
					for (int y = 0; y < 2; y++) {
						System.out.print("\t" + matrizA[x][y]);
					}
					System.out.println("");
				}

				System.out.println("\t-------------------------");
				for (int x = 0; x < 2; x++) {
					for (int y = 0; y < 2; y++) {
						System.out.print("\t" + matrizB[x][y]);
					}
					System.out.println("");
				}

				break;
			}

		} while (opcaoComNum == 5);

		System.out.println("\nObrigado por utilizar nosso servi�os :)");

		leia.close();
	}
}