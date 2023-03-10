package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI {

    private JButton button = new JButton("Перевести");
    private JTextField textField1 = new JTextField();
    private JTextField textField2 = new JTextField();
    private JFrame frame = new JFrame();

    public static void main(String[] args) {
        new GUI();
    }

    public GUI() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.add(button);
        frame.add(textField1);
        frame.add(textField2);



        button.setBounds(100, 100, 100, 30);
        textField1.setBounds(30, 30, 230, 20);
        textField2.setBounds(30, 60, 230, 20);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField1.getText();
                String reversed = reverseString(text);
                textField2.setText(reversed);
            }
        });
    }

    public static String reverseString(String text) {
        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();
    }
}