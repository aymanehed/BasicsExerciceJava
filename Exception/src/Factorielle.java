
public class Factorielle {
public static int factorielle(int n)throws PasDefini {
	int res=1;
	if(n<0)throw new PasDefini();
for(int i=1;i<n;i++)
	 res=res*i;
return res;
}
public static void main(String[] args)throws PasDefini{
	// TODO Auto-generated method stub
	System.out.println("Factorielle(3)="+ factorielle(3));
	System.out.println("Factorielle(4)="+ factorielle(4));
	System.out.println("Factorielle(-2)="+ factorielle(-2));
}
}
