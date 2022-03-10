package Collection;

import java.util.ArrayList;
import java.util.List;

public class Atividade3 {

	public static void main(String[] args) {
		List<String> produtos = new ArrayList<>();
		
		produtos.add("Arroz");
		produtos.add("Feijão");
		produtos.add("Açúcar");
		produtos.add("Leite");
		
		System.out.println(produtos.toString());
		produtos.remove(2);
		System.out.println(produtos.toString());
		System.out.println("Acabou os proutos do estoque: " +produtos.isEmpty());
		System.out.println("Tem leite no estoque? "+produtos.contains("Leite"));
		System.out.println("Quantas variedades de produto tenho no meu estoque? "+produtos.size()); //O açúcar foi removido anteriormente
		System.out.println("");
	}

}
