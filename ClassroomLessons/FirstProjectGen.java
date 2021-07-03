package ClassroomLessons;

// Biblioteca para utilizar o Scaneer
import java.util.Scanner;

public class FirstProjectGen {
	public static void main(String[] args) {
		//%d -> inteiros $s -> string $f - float
		float notaUm, notaDois, notaTres, media;
		double raiz, expoente;
		
		
		System.out.print("Digite a primeira nota: ");
		Scanner readLine = new Scanner(System.in);

		notaUm = readLine.nextFloat();

		System.out.print("Digite a segunda nota: ");
		notaDois = readLine.nextFloat();

		System.out.print("Digite a terceira nota: ");
		notaTres = readLine.nextFloat();

		media = (notaUm + notaDois + notaTres) / 3;
		
		raiz = Math.sqrt(notaDois);
		expoente = Math.pow(notaDois, 2);
		
		
		
		System.out.printf("Sua média foi de: " + "%.2f", media);

	}
}
