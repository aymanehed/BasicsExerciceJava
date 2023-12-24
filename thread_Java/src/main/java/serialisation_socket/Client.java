package serialisation_socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s=new Socket("localhost",8070);

            InputStream in=s.getInputStream();
            OutputStream o=s.getOutputStream();
            ObjectOutputStream oos=new ObjectOutputStream(o);
            Etudiant e=new Etudiant("jad","khafof","4IIRG1");
           oos.writeObject(e);


        } catch(IOException e){
            e.printStackTrace();
        }

    }
}
