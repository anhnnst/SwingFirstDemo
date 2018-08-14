package edu.poly.socket;

import java.net.InetAddress;

public class FindAddress {
    public static void main(String[] args) {
        try {
            InetAddress[] inetAddress = 
                    InetAddress.getAllByName("microsoft.com");
            for (InetAddress item : inetAddress) {
                System.out.println("Item: " + item.getHostName() 
                        + "/" + item.getHostAddress());
            }
            System.out.println(""+inetAddress.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
