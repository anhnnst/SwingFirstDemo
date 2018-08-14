package edu.poly.network;

import java.net.URL;

public class ReadURLInfo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://google.com");
            
            System.out.println("Host: " + url.getHost());
            System.out.println("Protocol: " + url.getProtocol());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
