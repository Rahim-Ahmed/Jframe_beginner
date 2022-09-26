package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class temp extends JFrame implements ActionListener {
     JLabel lab1;
     JLabel lab2;
     JTextField tf;
     JPasswordField tf2;
     JButton btn1,btn2;
     Container c;
    temp(){
        c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.lightGray);

        lab1= new JLabel(" Name : ");
        lab1.setBounds(50,20,150,30);
        lab2= new JLabel(" Pass : " );
        lab2.setBounds(50,60,150,30);

        tf= new JTextField();
        tf.setBounds(120,20,150,30);
        tf.setBackground(Color.white);
        tf2= new JPasswordField();
        tf2.setBounds(120,60,150,30);
        tf2.setBackground(Color.white);

        btn1 = new JButton("Submit");
        btn1.setBounds(60,100,80,30);
        btn1.setForeground(Color.white);
        btn1.setBackground(Color.black);
        btn1.addActionListener(this);

        btn2 = new JButton("clear");
        btn2.setBounds(140,100,80,30);
        btn2.setForeground(Color.white);
        btn2.setBackground(Color.black);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                tf2.setText("");
            }
        });




        //lab2.setForeground(Color.white);
        c.add(lab1);        c.add(lab2);        c.add(tf);        c.add(tf2);c.add(btn1);c.add(btn2);

        setSize(400,300);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed (ActionEvent e){
        String s1=tf.getText();
        String s2= tf2.getText();
        if(s1.equals("Rahim") && s2.equals("123") ){
            JOptionPane.showMessageDialog(null,"SUCCESSFULLY LOGED IN");
        }else {
            JOptionPane.showMessageDialog(null,"TRY AGAIN");
        }
    }


    public static void main(String[] args) {
        temp x = new temp();
        
    }
}
