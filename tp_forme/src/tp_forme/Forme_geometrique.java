package tp_forme;

abstract class  Forme_geometrique {
	int positionx,positiony;
 public abstract double perimetre();
 public abstract double surface();
 public void afficher() {
	 System.out.println("de position x= "+this.positionx+" y="+this.positiony);
 }
 int pos_x() {
	 return this.positionx;
 }
 int pos_y() {
	 return this.positiony;
 }
 void initialiser(int x,int y ) {
	 this.positionx=x;
	 this.positiony=y;
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

	}



}
