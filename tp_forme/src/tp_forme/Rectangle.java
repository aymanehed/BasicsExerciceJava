package tp_forme;

public class Rectangle extends Forme_geometrique{
	int lon,lar ;
	public Rectangle(int x,int y,int lon,int lar) {
		// TODO Auto-generated constructor stub
		super.initialiser(x,  y );
		this.lon=lon;
		this.lar=lar;
		
	}
	public double surface() {
	return this.lar*this.lon;	
	} 
	public double perimetre() {
	return 2*(this.lon+this.lar);	
	} 
	public void afficher() {
		super.afficher();
		System.out.println("je suis un Rectangle"+"de  longeur="+this.lon+" de  largeur="+this.lar);
		super.afficher();
		System.out.println("de perimetre"+perimetre());
		System.out.println("de surface"+surface());
		System.out.println("**************************************");
	}
}
