package edu.poly.network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ImageDownloader2 {

    public static void main(String[] args) {
        String urlString = "https://static.boredpanda.com/blog/wp-content/uploads/2015/07/transparent-skeleton-flowers-in-rain-diphylleia-grayi-23.jpg";
        URL url;
        try {
            url = new URL(urlString);

            try (
                    BufferedOutputStream bout = new BufferedOutputStream(
                            new FileOutputStream("e:/temp/flower.jpg"));
                    BufferedInputStream bin = new BufferedInputStream(url.openStream());
                ) {

                byte[] buffer = new byte[1024];
                int length = 0;

                while ((length = bin.read(buffer)) > 0) {
                    bout.write(buffer, 0, length);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
