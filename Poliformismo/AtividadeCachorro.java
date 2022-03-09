package Poliformismo;

public class AtividadeCachorro {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		
		dog.setNome("Pluto");
		dog.setIdade(12);
		
		System.out.println("CACHORRO");
		dog.emitirSom();
		System.out.println("O cachorro se chama: "+dog.getNome());
		System.out.println("Idade "+dog.getIdade()+" anos.");
		dog.correr();
		

	}

}
