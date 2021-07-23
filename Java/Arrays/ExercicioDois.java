/*
 * Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.
 */

package Java.Arrays;

import java.util.Scanner;

public class ExercicioDois {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numeros[] = new int[6];
		int somaNumerosPares = 0, quantidadeImpares = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.printf("Entre com o %d valor: ", (i + 1));
			numeros[i] = leia.nextInt();
			
			if (numeros[i] % 2 == 0)
				somaNumerosPares += numeros[i];
			else
				quantidadeImpares++;
		}
		
		System.out.println("------------------------------------------------------");
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0)
				System.out.printf("Par: %d ", numeros[i]);
			else
				System.out.printf("Impar: %d ", numeros[i]);
		}
		System.out.printf("\nSoma numeros pares: %d%n", somaNumerosPares);
		System.out.printf("Quantidade numeros impares: %d", quantidadeImpares);
	}
}
