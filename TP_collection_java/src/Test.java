import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Client>List1=new ArrayList();
		 Client cl=new Client("111","n1","p1");
		 Client c2=new Client("112","n2","p2");
		 Client c3=new Client("113","n3","p3");
		 List1.add(cl);
		 List1.add(c2);
		 List1.add(c3);
		 System.out.println("list1 "+List1.toString());
		 ArrayList<Client>List2=new ArrayList(List1);
		 System.out.println("modification");
		cl.setMatricule("124");
		cl.setNom("Ahmed");
		cl.setPrenom("A");
		System.out.println("list1 "+List1.toString());
		 System.out.println("list "+List2.toString());
		 System.out.println("null");
		 cl=null;
		 System.out.println("list1 "+List1.toString());
		 System.out.println("list2 "+List2.toString());
		 System.out.println("remove");
		 List1.remove(cl);
		 System.out.println("list1 "+List1.toString());
		 System.out.println("list2 "+List2.toString());

	}

}
