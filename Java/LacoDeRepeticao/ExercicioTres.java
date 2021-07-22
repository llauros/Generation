/*
 * Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por
três (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário
digita 5, deveremos observar na tela a seguinte sequência: 5 15 45 135.
 */

package LacoDeRepeticao;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Entre com um valor");
		valor = sc.hashCode();
		
		while(valor <= 100) {
			valor = valor * 3;
			System.out.println(valor);
		}
		
		sc.close();
	}

}
