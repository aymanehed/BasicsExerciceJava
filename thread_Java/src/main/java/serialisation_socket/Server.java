package serialisation_socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
    ServerSocket ss;
        try {
        ss=new ServerSocket(8070);
            System.out.println("Attendre la connexion");;
        Socket socket=ss.accept();
        InputStream i=socket.getInputStream();
        OutputStream o =socket.getOutputStream();
            ObjectInputStream oi=new ObjectInputStream(i);
            Etudiant e=(Etudiant) oi.readObject();
            System.out.println(e.getNom()+""+e.getPrenom()+""+e.getGroupe());
            oi.close();
    }catch (Exception e){
        e.printStackTrace();
    }
}
}
