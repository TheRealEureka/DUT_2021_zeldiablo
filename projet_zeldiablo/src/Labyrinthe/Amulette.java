package Labyrinthe;

public class Amulette {
	
	private int x;
	private int y;
	private boolean appartient;

	public Amulette(int xc, int yc, Labyrinthe labi) {
		
		if(this.x > labi.getHauteur() ) {
			this.x = 10;
		}else {
			this.x = xc;
		}
		if(this.y > labi.getLargeur() ) {
			this.y = 10;
		}else {
			this.y = yc;
		}
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public boolean getAppartient() {
		return this.appartient;
	}
	
	public void attraper() {
		//ajout perso dans labyrinthe 
		
	}
}