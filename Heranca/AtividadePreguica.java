package Herança;

public class AtividadePreguica extends Preguica{

	public static void main(String[] args) {

			Preguica zZ = new Preguica();
			
			zZ.setNome("Soneca");
			zZ.setIdade(30);
			zZ.setSom(true);
			zZ.setSubArvores(true);
			
		
			
			System.out.println("PREGUIÇA\n");
			System.out.println("O nome da preguiça é: "+zZ.getNome());
			System.out.println("Idade: "+zZ.getIdade()+" anos.");
			System.out.println("Ela emite som: "+zZ.isSom());
			System.out.println("Ela sobe em árvores: "+zZ.isSubArvores());
			
		}

	}


