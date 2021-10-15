package com.ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class formu extends JFrame {

    private Container c;
    private JPanel panel1;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel add;
    private JTextArea tadd;
    private JLabel l2;
    private JPasswordField p;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
    private String dates[]
            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String months[]
            = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private String years[]
            = { "2021","2022","2023"};



    public formu(){
        this.setSize(900,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Facturacion");

        c = getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(17, 224, 243));

        panel1 = new JPanel();
        panel1.setSize(500,600);
        panel1.setLocation(0,0);
        panel1.setBackground(new Color(255, 3, 10));
        panel1.setLayout(null);
        c.add(panel1);


        title = new JLabel("Facturacion");
        title.setFont(new Font("Algerian Black", Font.PLAIN, 32));
        title.setSize(400, 35);
        title.setLocation(50, 30);
        title.setForeground(new Color(131, 255, 80));
        panel1.add(title);

        name = new JLabel("Nombre");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(50, 100);
        name.setForeground(new Color(0, 0, 0));
        panel1.add(name);

        tname = new JTextField("");
        tname.setForeground(new Color(53, 119, 126));
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(220, 28);
        tname.setLocation(120, 100);
        panel1.add(tname);

        mno = new JLabel("codigo");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(50, 150);
        mno.setForeground(new Color(0, 0, 0));
        panel1.add(mno);

        tmno = new JTextField("");
        tmno.setForeground(new Color(153, 163, 164));
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(220, 28);
        tmno.setLocation(120, 150);
        panel1.add(tmno);

        l2 =new JLabel("mesero");
        l2.setFont(new Font("Arial", Font.PLAIN, 20));
        l2.setSize(100, 20);
        l2.setLocation(50, 200);
        l2.setForeground(new Color(0, 0, 0));
        panel1.add(l2);

        p = new JPasswordField();
        p.setForeground(new Color(153, 163, 164));
        p.setFont(new Font("Arial", Font.PLAIN, 15));
        p.setSize(220, 28);
        p.setLocation(120, 200);
        panel1.add(p);


        gender = new JLabel("comida");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(80, 20);
        gender.setLocation(50, 250);
        gender.setForeground(new Color(0, 0, 0));
        panel1.add(gender);

        male = new JRadioButton("Almuerzo");
        male.setFont(new Font("Arial", Font.PLAIN, 17));
        male.setSelected(true);
        male.setSize(110, 20);
        male.setLocation(130, 250);
        male.setBackground(new Color(255,255,255));
        male.setForeground(new Color(0,0,0));
        panel1.add(male);

        female = new JRadioButton("Cena");
        female.setFont(new Font("Arial", Font.PLAIN, 17));
        female.setSelected(false);
        female.setSize(110, 20);
        female.setLocation(250, 250);
        female.setBackground(new Color(255,255,255));
        female.setForeground(new Color(0,0,0));
        panel1.add(female);

        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        dob = new JLabel("FN");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(50, 300);
        dob.setForeground(new Color(0, 0, 0));
        panel1.add(dob);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(120, 300);
        panel1.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(190, 300);
        panel1.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(270, 300);
        panel1.add(year);

        add = new JLabel("observaciones");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(50, 350);
        add.setForeground(new Color(0, 0, 0));
        panel1.add(add);

        tadd = new JTextArea();
        tadd.setForeground(new Color(0, 0, 0));
        tadd.setBackground(new Color(229, 231, 233 ));
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(140, 350);
        tadd.setLineWrap(true);
        panel1.add(tadd);

        term = new JCheckBox("Tiene que Pagar antes de consumir ");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setBackground(new Color(255, 22, 0));
        term.setSize(250, 20);
        term.setLocation(110, 450);
        panel1.add(term);

        sub = new JButton("Facturar");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 30);
        sub.setLocation(100, 500);
        sub.addActionListener(this::actionPerformed);
        panel1.add(sub);

        reset = new JButton("Borrar");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 30);
        reset.setLocation(250, 500);
        reset.addActionListener(this::actionPerformed);
        panel1.add(reset);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(550, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(60, 500);
        res.setForeground(new Color(0, 0, 0));
        panel1.add(res);

        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);




    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data1;
                String data
                        = "Nombre : "
                        + tname.getText() + "\n"
                        + "codigon de la comida : "
                        + tmno.getText() + "\n";
                if (male.isSelected())
                    data1 = "Almuerzo : cena"
                            + "\n";
                else
                    data1 = "Almuerzo : Cena"
                            + "\n";
                String data2
                        = "Fecha : "
                        + (String)date.getSelectedItem()
                        + "/" + (String)month.getSelectedItem()
                        + "/" + (String)year.getSelectedItem()
                        + "\n";

                String data3 = "Observaciones: " + tadd.getText();
                tout.setText(data + data1 + data2 + data3);
                tout.setEditable(false);
                res.setText("Registration Successfully..");
            }
            else {
                tout.setText("");
                resadd.setText("");
                res.setText("Si pago antes de consumir");
            }
        }

        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tmno.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
        }
    }
}