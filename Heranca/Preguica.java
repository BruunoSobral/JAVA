package Herança;

public class Preguica extends Animal{
	
	private boolean subArvores;
	
	
	public void sobe() 
	{
		this.subArvores = true;
	}
	public void nSobe()
	{
		this.subArvores = false;
	}
	public boolean isSubArvores() {
		return subArvores;
	}
	public void setSubArvores(boolean subArvores) {
		this.subArvores = subArvores;
	}
	
	

}
