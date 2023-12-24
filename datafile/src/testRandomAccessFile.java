import java.io.RandomAccessFile;
public class testRandomAccessFile  {
public static void main(String []args) {
	try {
		RandomAccessFile monfichier=new RandomAccessFile("monfichier.dat","rw");
		for(int i=0;i<10;i++) {monfichier.writeInt(i*100);}
		monfichier.seek(5*4);
		System.out.println(monfichier.readInt());
		monfichier.close();
	}catch(Exception e) {e.printStackTrace();}
}
}
