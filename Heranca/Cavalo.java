package Herança;

public class Cavalo extends Animal{
	
	public boolean isCorrer() {
		return correr;
	}
	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	private boolean correr;
	
	public void corre() 
	{
		this.correr = true;
	}
	public void nCorre()
	{
		this.correr = false;

}
}
