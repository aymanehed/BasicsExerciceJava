import java.util.*;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> List=new ArrayList<>();
		System.out.println("En A : taille de "+List.size());
		for(int i=0;i<10;i++)
		List.add(i);
		System.out.println("En B : taille de "+List.size());
		System.out.println("En B :  contenu de v=");
		for(Integer i:List)
			System.out.print(i+" ");
		System.out.println();
			List.remove(3);
			List.remove(5);
			List.remove(5);
			
			System.out.println("En C : contenu de v="+List);
			List.add(2,200);
			List.add(3,100);
			
			System.out.println("En D : contenu de v="+List);
				List.set(2, 1000);
				List.set(5, 2000);
				System.out.println("En D : contenu de v="+List);
		
		
		

	}

}
