package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static class Window{

        private int cow = 0;
        private final JLabel CowLabel;

        public Window() {
            JFrame frame = new JFrame("WOW");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setSize(130,100);
            frame.setVisible(true);

            CowLabel = new JLabel("How many cow: " + cow);
            frame.add(CowLabel, BorderLayout.NORTH);

            JButton but1 = new JButton("+");
            frame.add(but1, BorderLayout.CENTER);
            JButton but2 = new JButton("-");
            frame.add(but2, BorderLayout.SOUTH);

            but1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    cow++;
                    updateCow();
                }
                private void updateCow() {
                    CowLabel.setText("How many cow: " + cow);
                }
            });

            but2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    cow--;
                    updateCow();
                }

                private void updateCow() {
                    CowLabel.setText("How many cow: " + cow);
                }
            });
            
            }

        }
        public static void main(String[] args) {
        Window app = new Window();
    }
}
