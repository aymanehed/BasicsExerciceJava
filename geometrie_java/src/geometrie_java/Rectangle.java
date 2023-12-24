package geometrie_java;

public class Rectangle implements  Int_Perimetre,Int_Surface{
	int l,L;

	public Rectangle(int l, int L){
		super();
		this.l = l;
	 this.L=L;
	}
	
	public double surface() {
		// TODO Auto-generated method stub
return l*L;
	}
	public double perimetre() {
		// TODO Auto-generated method stub
return 2*(L+l);
	}
	public void doubler() {
		// TODO Auto-generated method stub
this.l*=2;
this.L*=2;
	}
}
