package edu.poly.socket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CharacterServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8000);
            System.out.println("Listening....");
            
            while (true){
                Socket socket = ss.accept();
                System.out.println("Accepted");
                BufferedInputStream bin = 
                        new BufferedInputStream(socket.getInputStream());
                BufferedOutputStream bout = 
                        new BufferedOutputStream(socket.getOutputStream());
                byte[] buffer = new byte[1024];
                int length=0;
                do{
                    length = bin.read(buffer);
                    if (length >0){
                        String line = new String(buffer, 0, length);
                        System.out.println("Received: " + line);
                    }
                }while (length<0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
