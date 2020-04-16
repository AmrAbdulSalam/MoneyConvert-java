package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Convert extends JFrame implements ActionListener {

    private JLabel enter , conver , from , to;
    private JComboBox first , second;
    private String names [] = {"JOD" , "USD" , "EURO" , "ILS"};
    private JPanel all,  p1 , p2 , p3 , p4;
    private JTextField t1,t2;
    private JButton b1 , b2;
    private int  val;
    private String s1;
    private Double doub , x;
    Color c1 = Color.gray;
    public Convert(){
        super("Currency Convertor");
        setLayout(new BorderLayout());
        enter = new JLabel("Enter The Amount");
        t1 = new JTextField("0" , 15);
        p1 = new JPanel();
        p2 = new JPanel();
        all = new JPanel();
        p1.add(enter);
        p1.add(t1);
        p1.setBackground(c1);
        from = new JLabel("From");
        to = new JLabel("To");
        first = new JComboBox(names);
        second = new JComboBox(names);
        p2.add(from);
        p2.add(first);
        p2.add(to);
        p2.add(second);
        p2.setBackground(c1);
        b1 = new JButton(" Convert ");
        b2 = new JButton(" Clear ");
        p3 = new JPanel();
        p3.add(b1);
        p3.add(b2);
        p3.setBackground(c1);
        //add here
        b2.addActionListener(this);
        b1.addActionListener(this);
        //end here
        conver = new JLabel("Converted Amount");
        t2 = new JTextField("0" , 15);
        t2.setEditable(false);
        p4 = new JPanel();
        p4.add(conver);
        p4.add(t2);
        p4.setBackground(c1);
        all.setLayout(new GridLayout(4, 0));
        all.add(p1);
        all.add(p2);
        all.add(p3);
        all.add(p4);

        add(all , BorderLayout.CENTER);

    }
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == b2){
            t1.setText("0");
            t2.setText("0");
        }
        else if(event.getSource() == b1){
            s1 = "";
            doub = 0.0;
            if(t1.getText().isEmpty() || t1.getText().equals("0")){
                //System.out.println("it is emphty");
                JOptionPane.showMessageDialog(null ,"You should put a value!" );
            }
            else{
               x = Double.parseDouble(t1.getText());
                //System.out.println(x);
                if (first.getSelectedItem() == "USD"){ // here is USD
                    if (second.getSelectedItem() == "JOD") {
                        doub = x *0.71;
                        s1 = "" + doub;
                        t2.setText(s1);
                    }
                    else if(second.getSelectedItem() == "EURO"){
                        doub = x * 0.92;
                        s1 = "" + doub;
                        t2.setText(s1);
                    }
                    else if(second.getSelectedItem() == "ILS"){
                        doub = x *3.59;
                        s1 = "" + doub;
                        t2.setText(s1);
                    }
                    else{
                        s1 = "" + x;
                        t2.setText(s1);
                    }
                }
                else if(first.getSelectedItem() == "EURO"){ // here is EURO
                    if (second.getSelectedItem() == "JOD") {
                        doub = x *0.77;
                        s1 = "" + doub;
                        t2.setText(s1);
                    }
                    else if(second.getSelectedItem() == "USD"){
                        doub = x * 1.09;
                        s1 = "" + doub;
                        t2.setText(s1);
                    }
                    else if(second.getSelectedItem() == "ILS"){
                        doub = x *3.91;
                        s1 = "" + doub;
                        t2.setText(s1);
                    }
                    else{
                        s1 = "" + x;
                        t2.setText(s1);
                    }

                }
                else if(first.getSelectedItem() == "JOD"){
                    if (second.getSelectedItem() == "EURO") {
                        doub = x *1.30;
                        s1 = "" + doub;
                        t2.setText(s1);
                    }
                    else if(second.getSelectedItem() == "USD"){
                        doub = x * 1.41;
                        s1 = "" + doub;
                        t2.setText(s1);
                    }
                    else if(second.getSelectedItem() == "ILS"){
                        doub = x *5.06;
                        s1 = "" + doub;
                        t2.setText(s1);
                    }
                    else{
                        s1 = "" + x;
                        t2.setText(s1);
                    }
                }
                else if(first.getSelectedItem() == "ILS"){
                    if (second.getSelectedItem() == "EURO") {
                        doub = x *0.26;
                        s1 = "" + doub;
                        t2.setText(s1);
                    }
                    else if(second.getSelectedItem() == "USD"){
                        doub = x * 0.28;
                        s1 = "" + doub;
                        t2.setText(s1);
                    }
                    else if(second.getSelectedItem() == "JOD"){
                        doub = x *0.20;
                        s1 = "" + doub;
                        t2.setText(s1);
                    }
                    else{
                        s1 = "" + x;
                        t2.setText(s1);
                    }
                }
            }
        }
    }
    
}
