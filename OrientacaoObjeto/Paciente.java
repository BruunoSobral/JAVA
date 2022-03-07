package OrientaçaoObjeto;

public class Paciente {
	
	String nome;
	String Doenca;
	String cor;
	double febre;
	int idade;
	
	public Paciente(String a, String b, String c)
	{
		this.nome = a;
		this.Doenca = b;
		this.cor = c;
		this.febre = 40.1;
		this.idade = 34;
	}
	
	public void cura()
	{
		System.out.println("A paciente se chama: "+this.nome+";");
		System.out.println("Se encontra com "+this.Doenca+";");
		System.out.println("Seu rosto está "+this.cor+";");
		System.out.println("Com muita febre, última medida estava "+this.febre+" graus;");
		System.out.println("Ela tem "+this.idade+" anos de idade.");
	}

}
