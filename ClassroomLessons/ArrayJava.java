package ClassroomLessons;

import java.util.*;

public class ArrayJava {

	public static void main(String[] args) {
		//Crie um programa que leia as m�dias dos alunos e calcue a m�dia do aluno
		
		Scanner sc = new Scanner(System.in);
		int quantidadeMedias;
		float [] media;
		float somaMedia = 0, mediaGeral;
		
		System.out.print("Entre com a quantidade de M�dias: ");
		quantidadeMedias = sc.nextInt();
		
		media = new float[quantidadeMedias];
		
		for (int x = 0; x < media.length ; x++) {
			System.out.print("Entre com a sua m�dia: ");
			media[x] = sc.nextFloat();
			
			somaMedia += media[x]; 
		}
		
		mediaGeral = somaMedia / media.length;
		
		System.out.printf("%nM�dia geral: %2.2f", mediaGeral);
		
		
		
	}

}
