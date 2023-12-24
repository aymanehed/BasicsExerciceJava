import java.util.*;
public class Test_linkedlist {
	public static void main(String[] args) {
	LinkedList<String>list=new LinkedList<>();
	ListIterator<String> it1=list.listIterator();
	System.out.print("Liste en A:");
	while(it1.hasNext())
	{
System.out.print(it1.next());
	}
	System.out.println("");

	list.add("a");
	list.add("b");
	System.out.print("Liste en B:");
	for(String e:list) {
System.out.print(e);
	}	
	System.out.println("");
	

	while(it1.hasNext())
	{

	}
	}}

