import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> list = new HashSet<>();
		
			int tab[]= {2,5,-6,2,-8,9,5};
			for (int i:tab)
			{
			if(list.add(tab[i]))
				{list.add(tab[i]);
			System.out.println("on ajoute"+tab[i]);}
				else
					System.out.println(tab[i]+"est deja present");
			
		}
			System.out.print("ensemble en A=");
			for (int E:list)
			{
				System.out.print(E+" ");
			}
			System.out.println("");
			if(list.remove(5))
				{list.remove(5);
			System.out.println("on supprime 5");}
				else
					System.out.println("on ne trouve pas 5");
		
			System.out.print("ensemble en B=");
			for (int E:list)
			{
				System.out.print(E+" ");
			}
			System.out.println("");
			if(list.remove(5))
			{list.remove(5);
		System.out.println("on supprime 5");}
			else
				System.out.println("on ne trouve pas 5");
	
		}
	
	
}
