package com.ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class widget extends JFrame {
    private Container panel1;
    private JButton boton1;


    public widget(){
        this.setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("ingresar");

        panel1 = getContentPane();
        panel1.setLayout(null);
        panel1.setBackground(new Color(255, 22, 0));

        boton1 = new JButton("InGresar al Restaurente");
        boton1.setSize(170,30);
        boton1.setLocation(200,250);
        panel1.add(boton1);

        ActionListener Bot = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formu v2 = new formu();
                v2.setVisible(true);
                dispose();
            }
        };

        boton1.addActionListener(Bot);


    }

}