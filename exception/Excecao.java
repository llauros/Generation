package exception;

public class Excecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = null, novaFrase = null;
		
		// Estrutura de exce��o para tratar de erros
		try {
			novaFrase = frase.toUpperCase();
		} catch (NullPointerException e) { //captura da possivel exce��p
			// tratamento da exce��o
			System.out.println("A frase inicial est� nula, para soluicionar tal problema, foi atribuido um valor default");
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		
		System.out.println("Frase antiga: " + frase);
		System.out.println("Frase nova: " + novaFrase);
	}

}
