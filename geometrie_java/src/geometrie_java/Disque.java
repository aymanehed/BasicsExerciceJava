package geometrie_java;

public class Disque implements  Int_Perimetre,Int_Surface {
	double Rayon;

	public Disque(double rayon) {
		super();
		Rayon = rayon;
	}
	public  double surface() {
		// TODO Auto-generated method stub
		return pi*Rayon*Rayon;
	}
	public double perimetre() {
		// TODO Auto-generated method stub
return pi*2*Rayon;
	}
	public void doubler() {
		// TODO Auto-generated method stub
this.Rayon*=2 ;
	}
	

}
