package tp_forme;

public class Cercle extends Forme_geometrique{
int rayon ;
public Cercle(int x,int y,int rayon) {
	// TODO Auto-generated constructor stub
	super.initialiser(x,  y );
	this.rayon=rayon;
	
}
public double perimetre() {
return 3.14*this.rayon;	
} 
public double surface() {
return 3.14*this.rayon*this.rayon;	
} 
public void afficher() {
	super.afficher();
	System.out.printf("je suis   un cercle de  rayon="+this.rayon,"de ce centre x="+super.pos_x()+"y="+super.pos_y());
	System.out.println("de perimetre"+perimetre());
	System.out.println("de surface"+surface());
	System.out.println("**************************************");
}

}
