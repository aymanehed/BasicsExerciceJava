import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int _id=3;
 int[] b1={1,2,3,4},b2= {1,2,3,4};
System.out.println(_id);
 System.out.println(b1.equals(b2));
	 Collection<Integer> c=new ArrayList<Integer>();
	 c.add(3);
	 c.add(2);
	 c.add(4);
	 Iterator<Integer> it=c.iterator();
	 for(;it.hasNext();) {
	 System.out.println(it.next()*2);
	 }
	 }
	
	

}
