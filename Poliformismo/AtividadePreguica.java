package Poliformismo;

public class AtividadePreguica{
	
	public static void main(String[] args) {

		Preguica zZ = new Preguica();
		
		zZ.setNome("Soneca");
		zZ.setIdade(30);	
		
		System.out.println("PREGUICA\n");
		zZ.emitirSom();
		System.out.println("A Precuica se chama: "+zZ.getNome());
		System.out.println("Idade: "+zZ.getIdade()+" anos.");
		zZ.correr();
		
	}

}
