package Herança;

public class AtividadeCavalo {

	public static void main(String[] args) {
		
		Cavalo cav = new Cavalo();
		
		cav.setNome("Pocotó");
		cav.setIdade(18);
		cav.setSom(true);
		cav.setCorrer(true);
		
		System.out.println("CAVALO\n");
		System.out.println("O nome do cavalo é: "+cav.getNome());
		System.out.println("Idade "+cav.getIdade()+" anos.");
		System.out.println("Ele emite som? " +cav.isCorrer());
		System.out.println("Ele corre? " +cav.isCorrer());

	}

}
