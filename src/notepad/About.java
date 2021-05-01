/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Lenovo
 */
public class About extends JFrame implements ActionListener {
    JButton b1;
    About(){
        setBounds(600, 200, 700, 600);
        setLayout(null);
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("notepad/icon/window10.png"));
        Image i2 = il.getImage().getScaledInstance(400, 80,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel i1 = new JLabel(i3);
        i1.setBounds(150, 40, 400, 30);
        add(i1);
        
         ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("notepad/icon/notepad.ico"));
        Image i5 = i4.getImage().getScaledInstance(70, 70,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(50, 180, 70, 70);
        add(l2);
        JLabel l3 = new JLabel("<html> Code for interview <br>NotePad Version2020<br>NotePad is a word processing program </html>");
        l3.setBounds(150, 130, 500, 300);
         l3.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        add(l3);
         b1= new JButton("OK");
         b1.setBounds(580, 500, 100, 20);
        b1.addActionListener(this);
         add(b1);
        
        
    }
      public void actionPerformed(ActionEvent ae){
          this.setVisible(false);
      }
    
        public static void main(String[] args){
        
        new About().setVisible(true);
        }
        
        
}

