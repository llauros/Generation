package ClassroomLessons;

import java.util.*;

public class ArrayJava {

	public static void main(String[] args) {
		//Crie um programa que leia as médias dos alunos e calcue a média do aluno
		
		Scanner sc = new Scanner(System.in);
		int quantidadeMedias;
		float [] media;
		float somaMedia = 0, mediaGeral;
		
		System.out.print("Entre com a quantidade de Médias: ");
		quantidadeMedias = sc.nextInt();
		
		media = new float[quantidadeMedias];
		
		for (int x = 0; x < media.length ; x++) {
			System.out.print("Entre com a sua média: ");
			media[x] = sc.nextFloat();
			
			somaMedia += media[x]; 
		}
		
		mediaGeral = somaMedia / media.length;
		
		System.out.printf("%nMédia geral: %2.2f", mediaGeral);
		
		
		
	}

}
