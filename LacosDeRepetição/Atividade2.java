/*
 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */
package LacosDeRepeti��o;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int a, n1, impar = 0, par = 0;
	
	for(n1 = 1; n1 <= 10; n1++) {
		System.out.println("Entre com o n�mero "+n1);
		a = ler.nextInt();
		
		if(a % 2 == 0) {
			par++;
		}
		if(a % 2 == 1) {
			impar++;
		}
	}
	System.out.println("Foram inseridos " +par+ " n�meros pares, \nE "+impar+ " n�meros �mpares.");
	}

}
