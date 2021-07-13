package logicaProgramacao;

import java.util.*;

public class ArrayMatrizJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrayUm[] = {1, 2, 3, 4, 5};
		float[] nota = new float[5];
		
		// for-each
		String[] cars = {"Volvo", "Ford", "Mazda Furai"};
		
		for (String item : cars) {
			System.out.println(item);
		}
		
		/*int numero [][];
		int linha, coluna, valor;
		float somaDiagonal = 0f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com uma quantidade para linha: ");
		linha = sc.nextInt();
		
		System.out.print("Entre com uma quantidade para colunas: ");
		coluna = sc.nextInt();
		
		numero = new int[linha][coluna];
		
		for(int x = 0; x < linha; x++) {
			for(int y = 0; y < coluna; y++) {
				System.out.print("Entre com um número: ");
				numero[x][y] = sc.nextInt();
				
				somaDiagonal = x == y ? somaDiagonal += numero[x][y] : somaDiagonal;
			}
		}
		
		System.out.println("\t------------------------------");
		
		for(int x = 0; x < linha; x++) {
			for(int y = 0; y < coluna; y++) {
				if (numero[x][y] % 2 == 0) {
					System.out.print("\t");
					System.out.print(numero[x][y] + " par");
				} else {
					System.out.print("\t");
					System.out.print(numero[x][y] + " impar");
				}
			}
			System.out.println("");
		}
		
		System.out.println("\t------------------------------");
		
		System.out.printf("\tSoma da diagonal: %.2f", somaDiagonal);*/
	}

}
