package edu.poly.socket;

import java.io.BufferedOutputStream;
import java.net.Socket;

public class CharacterClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 8000);
            
            BufferedOutputStream bout = 
                    new BufferedOutputStream(socket.getOutputStream());
            System.out.println("Sent: Hello World!");
            bout.write("Hello world!".getBytes());
            bout.flush();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
