/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Bilal
 */
public class soru4 {
    public static void main(String[] args) {
         JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        
        JLabel lbl_label1=new JLabel();    
        lbl_label1.setText("bu bir label");
        frame.add(lbl_label1);
        
        JTextField txt_box1= new JTextField();
        txt_box1.setText("Bu bir text alani");
        frame.add(txt_box1);
        
        JButton btn_buton = new JButton();
        btn_buton.setText("bu butondur");
        frame.add(btn_buton);
    }
}
