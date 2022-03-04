/*
 * Informar todos os números de 1000 a 1999 
 * que quando divididos por 11 obtemos resto = 5. (FOR)
 */
package LacosDeRepetição;

public class Atividade1 {

	public static void main(String[] args) {
		int a;
		
		for(a = 1000; a < 1999; a++) {
			if(a%11==5) {
				System.out.println(a);
			}
				}

	}

}
