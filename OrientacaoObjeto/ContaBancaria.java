package Orienta�aoObjeto;

public class ContaBancaria {

	String nome;
	String banco;
	int agencia;
	double poupan�a;
	double saldo;
	
	public ContaBancaria(String a, String b) {
	
		this.nome = a;
		this.banco = b;
		this.agencia = 14583;
		this.poupan�a = 348.23;
		this.saldo = 13.89;
	}
	public void financa()
	{
		System.out.println("Seu nome: "+this.nome+";");
		System.out.println("Seu banco:"+this.banco+";");
		System.out.println("N�mero da sua ag�ncia "+this.agencia+";");
		System.out.println("Na sua poupan�a tem ... R$ "+this.poupan�a+";");
		System.out.println("Na sua Conta Corrente tem ... R$ "+this.saldo+";");
		System.out.println("FIM DO EXTRATO!");
	}

}
