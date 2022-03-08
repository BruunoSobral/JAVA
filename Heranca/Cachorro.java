package Herança;

public class Cachorro extends Animal {
	
	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		
		dog.setNome("Snoopy");
		dog.setIdade(15);
		dog.setSom(true);
		dog.setCorrer(true);
		
		System.out.println("CACHORRO");
		System.out.println("O nome do meu cachorro é: "+dog.getNome());
		System.out.println("Ele tem "+dog.getIdade()+" anos.");
		System.out.println("Ele faz muito barulho? "+dog.isSom());
		System.out.println("Ele corre muito? "+dog.isCorrer());
	}
	

}
