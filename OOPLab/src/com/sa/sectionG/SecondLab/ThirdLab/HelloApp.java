package com.sa.sectionG.SecondLab.ThirdLab;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by akashs on 10/30/16.
 */
public class HelloApp {
    private JButton oddBtn;
    private JPanel mainPanel;
    private JButton evenBtn;
    private JLabel resultTV;

    private Random random;

    public HelloApp() {
        random = new Random();

        oddBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null, "Click me button event occured")
                int num = random.nextInt();
                if(num%2==1){
                    resultTV.setText("Player winner");
                }
                else{
                    resultTV.setText("Computer winner");
                }


            }
        });
        evenBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = random.nextInt();
                if(num%2==0){
                    resultTV.setText("Player winner");
                }
                else{
                    resultTV.setText("Computer winner");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello App");
        HelloApp helloApp = new HelloApp();
        frame.setContentPane(helloApp.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}













