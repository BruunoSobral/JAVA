package Orienta�aoObjeto;

public class Patinete {
	int VelocidadeMax;
	String material;
	String cor;
	int roda;
	
	public Patinete( String b, String c)
	{
		this.VelocidadeMax = 45;
		this.material = b;
		this.cor = c;
		this.roda = 2;
	}
	public void acabou()
	{
		System.out.println("A valocidade m�xima que o patins pode chegar � de "+this.VelocidadeMax+" quilometros por hora.");
		System.out.println("Ela � totalmente feita de "+this.material);
		System.out.println("A cor do meu patinete �: "+this.cor);
		System.out.println("O meu patinete tem "+this.roda+" rodas." );
	}

}
