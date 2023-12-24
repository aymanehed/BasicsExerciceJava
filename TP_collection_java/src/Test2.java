import  java.util.LinkedList;
import  java.util.ListIterator;
import java.util.Scanner;


public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>List=new LinkedList<>();
		ListIterator<String>it= List.listIterator();
		System.out.println("veuillez saisir un mot ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner. nextLine(); 
		String[] splitted = input. split(" ");
for(int i=0;i<splitted.length;i++) {
	it.add(splitted[i]);
	System.out.println(splitted);
	
}
	
	
	
	
				
		
	}

}
