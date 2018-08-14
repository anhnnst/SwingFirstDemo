package edu.poly.net;

import java.net.InetAddress;

public class ListAddress {
    public static void main(String[] args) {
        try {
            InetAddress[] addresses = 
                    InetAddress.getAllByName("microsoft.com");
            
            for (InetAddress item : addresses) {
                System.out.println("Item: " 
                        + item.getHostName() + "/" 
                        + item.getHostAddress()
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
