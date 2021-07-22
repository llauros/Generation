package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colecoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> minhaLista = new ArrayList<Integer>();

		minhaLista.add(9);
		minhaLista.add(8);
		minhaLista.add(4);
		minhaLista.add(3);
		minhaLista.add(5);
		minhaLista.add(2);
		minhaLista.add(7);
		minhaLista.add(6);
		minhaLista.add(1);

		System.out.println(minhaLista);

		minhaLista.remove(8); // remove por indice

		int primeiroElemento = minhaLista.get(0); // retorna o valor da posi��o passado por parametro

		System.out.println(minhaLista);

		for (int i = 0; i < minhaLista.size(); i++) {
			System.out.printf("Valor guardado na posi��o: %d � %d\n", i, minhaLista.get(i));
		}

		for (Integer itemLista : minhaLista) {
			System.out.println(itemLista);
		}

		Collections.sort(minhaLista); // Metodo de ordena��o
		System.out.println("Lista ordenada");
		System.out.println(minhaLista);

		Set<Integer> meuSet = new HashSet<Integer>();

		meuSet.add(2);
		meuSet.add(1);
		meuSet.add(4);
		meuSet.add(3);
		meuSet.add(1);
		meuSet.add(9);

		// Criando nova interface chamada iteradorMeuSet
		Iterator<Integer> iteradorMeuSet = meuSet.iterator();

		while (iteradorMeuSet.hasNext()) { // While s� dar� falso quando o hsNext() retornarfalso
			System.out.println(iteradorMeuSet.next()); //Imprimir cada posi��o atrav�s do metodo next
		}
	}

}
