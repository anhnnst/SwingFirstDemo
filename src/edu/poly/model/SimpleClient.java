package edu.poly.model;

import java.io.BufferedOutputStream;
import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 8000);
            BufferedOutputStream bout= 
                    new BufferedOutputStream(socket.getOutputStream());
            bout.write("Hello world!".getBytes());
            System.out.println("Sent: Hello world!");
            bout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
