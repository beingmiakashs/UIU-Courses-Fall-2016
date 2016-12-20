package com.sa.sectionG.SecondLab.sixthLab;

import sun.applet.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by akashs on 11/13/16.
 */
public class MainScreen extends JFrame {

    JTextArea textArea;
    JTextField textField;
    JButton button;

    public MainScreen(){
        setSize(400,400);
        setLayout(new FlowLayout());

        textArea = new JTextArea();
        textField = new JTextField("", 12);
        button = new JButton();
        button.setText("Show Data");

        add(textField);
        add(button);
        add(textArea);

        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = textField.getText();
                textArea.setText(s);
            }
        });
    }

    public static void main(String[] args) {
        MainScreen ms = new MainScreen();
        ms.setVisible(true);
    }
}








