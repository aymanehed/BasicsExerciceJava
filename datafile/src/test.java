import java.io.RandomAccessFile;
import java.util.Scanner;

public class test {
	public static void main(String []args) {
		try {
			RandomAccessFile monfichier=new RandomAccessFile("input.txt","rw");
			Scanner sc=new Scanner(System.in);
			System.out.println("username:");
			String username=sc.nextLine();
			System.out.println("Password:");
			String Password=sc.nextLine();
			System.out.println("ConfirmPassword:");
			String ConfirmPassword=sc.nextLine();
			while(true) {
				if(!Password.equals(ConfirmPassword))break;
				System.out.println("Password:");
			 Password=sc.nextLine();
			 
				System.out.println("ConfirmPassword:");
			 ConfirmPassword=sc.nextLine();	
			}
			monfichier.seek(0);
			monfichier.writeBytes(username+"/"+Password+"/"+ConfirmPassword);
		monfichier.writeBytes(System.lineSeparator());
			
//			System.out.println(monfichier.readInt());
			monfichier.close();
		}catch(Exception e) {e.printStackTrace();}
	}
}
