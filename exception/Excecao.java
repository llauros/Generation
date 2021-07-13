package exception;

public class Excecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = null, novaFrase = null;
		
		// Estrutura de exceção para tratar de erros
		try {
			novaFrase = frase.toUpperCase();
		} catch (NullPointerException e) { //captura da possivel exceçãp
			// tratamento da exceção
			System.out.println("A frase inicial está nula, para soluicionar tal problema, foi atribuido um valor default");
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		
		System.out.println("Frase antiga: " + frase);
		System.out.println("Frase nova: " + novaFrase);
	}

}
