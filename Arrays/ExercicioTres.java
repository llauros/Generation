/*
 * Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */

package Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int linha = 3, coluna = 3;
		double matriz[][] = new double[linha][coluna];
		
		for (int x = 0; x < linha; x++) {
			for (int y = 0; y < coluna; y++) {
				System.out.printf("Entre com o %d° valor: ", x + y + 1);
				matriz[x][y] = leia.nextDouble();
				
			}
		}
		
		for (int x = 0; x < linha; x++) {
			for (int y = 0; y < coluna; y++) {
				if (matriz[x][y] > 10)
					System.out.printf(" 10 < %d ", (int) matriz[x][y]);
			}
		}
	}

}
