
package edu.poly.model;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8000);
            while (true) {
                System.out.println("Listening new socket ....");
                Socket socket = ss.accept();
                
                BufferedInputStream bin = 
                        new BufferedInputStream(socket.getInputStream());
                
                byte[] buffer = new byte[1024];
                int length = 0;
                do {                    
                    length = bin.read(buffer);
                    if (length>0){
                        String st = new String(buffer, 0, length);
                        System.out.println("Received: " + st);
                    }
                } while (length<0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
