package Heran�a;

public class AtividadeCavalo {

	public static void main(String[] args) {
		
		Cavalo cav = new Cavalo();
		
		cav.setNome("Pocot�");
		cav.setIdade(18);
		cav.setSom(true);
		cav.setCorrer(true);
		
		System.out.println("CAVALO\n");
		System.out.println("O nome do cavalo �: "+cav.getNome());
		System.out.println("Idade "+cav.getIdade()+" anos.");
		System.out.println("Ele emite som? " +cav.isCorrer());
		System.out.println("Ele corre? " +cav.isCorrer());

	}

}
