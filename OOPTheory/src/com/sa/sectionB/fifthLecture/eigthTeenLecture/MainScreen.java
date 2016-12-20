package com.sa.sectionB.fifthLecture.eigthTeenLecture;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by akashs on 12/6/16.
 */
public class MainScreen extends JFrame {

    JTextField textField;
    private JButton button;
    private JTextArea textArea;

    MainScreen(){
        textField = new JTextField();
        textArea = new JTextArea();
        button = new JButton();

        button.setText("Convert");
        textField.setColumns(10);
        textArea.setSize(200,200);

        setSize(300,300);
        setLayout(new FlowLayout());

        add(textField);
        add(button);
        add(textArea);

        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null, "Click");
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







