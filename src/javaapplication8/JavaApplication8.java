/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

import designs.intro;
import designs.signin;

/**
 *
 * @author HP
 */
public class JavaApplication8 {
    public static void main(String[] args) {

        intro first = new intro();
        first.setVisible(true);
        // delay
        for (int i = 0; i <= 100; i++) {
            first.progressbar.setValue(i);
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
               
            }
        }
        first.setVisible(false);
        first.dispose();
        
        
        signin in = new signin();
        in.setVisible(true);
       
        
        
        

    }
}
