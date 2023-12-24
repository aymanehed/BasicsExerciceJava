package org.example;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s=new Socket("localhost",8090);
        InputStream in=s.getInputStream();
        OutputStream o=s.getOutputStream();
        o.write(12);
        int b=in.read();
            System.out.println(b);
        } catch(IOException e){
            e.printStackTrace();
       }

    }
}
