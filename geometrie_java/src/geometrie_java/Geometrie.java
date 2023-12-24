package geometrie_java;

public  interface Geometrie  {
	public static final double pi=3.14159;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle R=new Rectangle(5, 5);
		Disque D=new Disque(5);
		System.out.println("Perimetre="+R.perimetre());
		System.out.println("Surface="+R.surface());
		System.out.println(" ancienne valeur la largeur="+R.l+" ancienne valeur de la Longeur="+R.L);
		R.doubler();
		System.out.println("nouvelle valeur la largeur="+R.l+" nouvelle valeur de la Longeur="+R.L);
		System.out.println("Perimetre="+D.perimetre());
		System.out.println("Surface="+D.surface());
		System.out.println(" ancienne valeur du rayon ="+D.Rayon);
		D.doubler();
		System.out.println(" nouvelle valeur du rayon ="+D.Rayon);

	
	
		
		

	}

}
