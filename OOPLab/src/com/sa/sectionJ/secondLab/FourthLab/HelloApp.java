package com.sa.sectionJ.secondLab.FourthLab;

import javax.swing.*;

/**
 * Created by akashs on 11/2/16.
 */
public class HelloApp {
    private JButton clickMeButton;
    private JPanel mainPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello App");
        HelloApp app = new HelloApp();
        frame.setContentPane(app.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}









