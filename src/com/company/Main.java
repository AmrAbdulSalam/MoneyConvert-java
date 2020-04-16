package com.company;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;



public class Main {

    public static void main(String[] args) {
	   Convert convert = new Convert();
	   convert.setSize(500 , 300);
	   convert.setVisible(true);
	   convert.setDefaultCloseOperation(convert.EXIT_ON_CLOSE);
	   convert.setResizable(false);
	   convert.setLocationRelativeTo(null);
    }
}
