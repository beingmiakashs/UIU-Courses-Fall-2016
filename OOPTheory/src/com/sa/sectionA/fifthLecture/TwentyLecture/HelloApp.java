package com.sa.sectionA.fifthLecture.TwentyLecture;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by akashs on 12/8/16.
 */
public class HelloApp {
    private JTextField textField1;
    private JButton clickMeBtn;
    private JPanel mainPanel;

    public HelloApp() {
        clickMeBtn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "click");
            }
        });
        textField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println(textField1.getText());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        HelloApp app = new HelloApp();
        frame.setContentPane(app.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}




