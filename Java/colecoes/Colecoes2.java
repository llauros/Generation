package colecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecoes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		Scanner leia = new Scanner(System.in);

		ArrayList<String> estoque = new ArrayList();

		do {
			System.out.println(
					"1) Deseja asicionar itens ao estoque\n2) Deseja remover um item\n3) Atualizar produto\n4) Mostrar todos os produtos");
			System.out.println("-----------------------");
			System.out.println("\n\tDigite sua opção: ");

			op = leia.nextInt();

			switch (op) {
				case 1:
					leia.nextLine();
					System.out.println("Digite o produto que deseja adicionar");
					String produto = leia.nextLine();	
					estoque.add(produto);
					break;
				case 2:
					leia.nextLine();
					System.out.println("----------------");
					System.out.println(estoque);
					
					System.out.println("Digite o produto que deseja remover");
					String produtoARemover = leia.nextLine();	
					
					if(estoque.contains(produtoARemover)) {
						estoque.remove(produtoARemover);
					} else {
						System.out.println("Esse produto não existe no estoque");
					}
					break;
					
				case 3:
					leia.nextLine();
					System.out.println("----------------");
					
					System.out.println(estoque);
					System.out.println("Digite o produto que deseja atualizar");
					String produtoAAtualizar = leia.nextLine();
					

					
					System.out.printf("Digite o produto que deseja substituir por %s: ", produtoAAtualizar);
					String produtoAParaAdicionar = leia.nextLine();
					
					if(estoque.contains(produtoAAtualizar)) {
						
						estoque.remove(produtoAAtualizar);
						
						estoque.add(estoque.indexOf(produtoAAtualizar), produtoAParaAdicionar);
					} else {
						System.out.println("Esse produto não existe no estoque");
					}
					
					System.out.println(estoque);
					break;
				case 4:
					leia.nextLine();
					System.out.println("----------------");
					System.out.println("Os produtos dos estoque são: ");
					System.out.println(estoque);
					break;
					default:
						System.out.println("\nPrograma Finalizado");
					
			}
		} while (op != 0);

	}

}
