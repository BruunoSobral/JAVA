package Atividade1;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		
		double x1, x2, y1, y2, d;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com as cordenadas do ponto de partida: ");
		x1=ler.nextDouble();
		y1=ler.nextDouble();
		System.out.println("Entre com as cordenadas do ponto de destino: ");
		x2=ler.nextDouble();
		y2=ler.nextDouble();
		d=Math.sqrt(Math.pow(x2-x1, 2)+(Math.pow(y2-y1, 2)));
		System.out.println("A distância entre os dois pontos é: "+d);
		ler.close();
		
			}

}
