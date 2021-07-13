package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//demonstra o lançamento de um exceção quando ocorre uma divisão por zero

public class Excecao2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		boolean continueLoop = true;
		
		
		do {
			try {
				System.out.println("Entre com o numerador: ");
				int numerador = leia.nextInt();
				System.out.println("Entre com o Denominador: ");
				int denominador = leia.nextInt();
				
				int resultado = quociente(numerador, denominador);
				System.out.printf("Resuldado: %d / %d = %d", numerador, denominador, resultado);
				continueLoop = false;
				
			} catch (InputMismatchException inputMismatchException) { //Verifica um erro de tipos de dados diverente
				System.err.printf("\nException: %s\n", inputMismatchException);
				leia.nextLine();
				System.out.println("Você deve entrar com um valor do tipo inteiro, tente novamente");
			} catch (ArithmeticException arithmeticException) { //verifica divisao por zero
				System.err.printf("\nException: %s\n", arithmeticException);
				System.out.println("Zero é um denominador inválido. Digite novamente");
				
				continueLoop = false;
			}
			
		} while (continueLoop);
	}
	
	public static int quociente(int numerador, int denominador) throws ArithmeticException {
		
		return numerador / denominador;
	}
}
