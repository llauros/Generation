/*
 * Obtenha um n�mero digitado pelo usu�rio e repita a opera��o de multiplicar ele por
tr�s (imprimindo o novo valor) at� que ele seja maior do que 100. Ex.: se o usu�rio
digita 5, deveremos observar na tela a seguinte sequ�ncia: 5 15 45 135.
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
