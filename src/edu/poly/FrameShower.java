/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly;

import javax.swing.JFrame;

public class FrameShower {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        frame.setTitle("JFrame Demo");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        
        frame.setVisible(true);
    }
}
