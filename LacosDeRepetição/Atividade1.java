/*
 * Informar todos os n�meros de 1000 a 1999 
 * que quando divididos por 11 obtemos resto = 5. (FOR)
 */
package LacosDeRepeti��o;

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
