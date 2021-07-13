package sobrecargaDeMetodos;

public class TestaFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario = new Funcionario("José", 0.0);
		
		
		funcionario.mostrarInfo();
		//Usando metodo com int
		funcionario.aumentarSalario(100);
		
		//Usando metodo com Double
		funcionario.aumentarSalario(150.80);
		System.out.println("-----------------");
		funcionario.mostrarInfo();
		
	}

}
