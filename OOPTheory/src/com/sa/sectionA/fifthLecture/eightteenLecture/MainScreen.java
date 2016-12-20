package com.sa.sectionA.fifthLecture.eightteenLecture;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by akashs on 12/6/16.
 */
public class MainScreen extends JFrame {

    JTextField textField;
    JTextArea textArea;
    JButton button;

    public MainScreen(){
        setSize(300,300);
        setLayout(new FlowLayout());

        textField = new JTextField();
        textArea = new JTextArea();
        button = new JButton();

        textField.setColumns(10);
        button.setText("Click Me");
        textArea.setSize(300,100);

        add(textField);
        add(button);
        add(textArea);

        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null, "click event");
                String s = textField.getText();
                s = s.toUpperCase();
                textArea.setText(s);
            }
        });

    }

    public static void main(String[] args) {
        MainScreen mainScreen = new MainScreen();
        mainScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainScreen.setVisible(true);
    }
}









