package Poliformismo;

public class AtividadeCavalo {
	
	public static void main(String[] args) {
		
		Cavalo cav = new Cavalo();
		
		cav.setNome("Pocoto");
		cav.setIdade(18);
		
		System.out.println("CAVALO\n");
		cav.emitirSom();
		System.out.println("O cavalo se chama: "+cav.getNome());
		System.out.println("Idade "+cav.getIdade()+" anos.");
		cav.correr();

	}

}
