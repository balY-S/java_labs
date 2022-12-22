package ru.mirea.lab1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {
    static JLabel label = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
    static JLabel label2 = new JLabel("Last Scorer: N/A",SwingConstants.CENTER);
    static JLabel label3 = new JLabel("Winner: DRAW",SwingConstants.CENTER);
    static int milan = 0, real = 0;
    static JFrame getFrame() {
        JFrame frame = new JFrame("My First GUI");
        frame.setSize(250, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        return frame;
    }

    public static void main(String[] args) {

        JFrame frame = getFrame();
        JPanel panel = new JPanel();
        frame.add(panel);

        JButton jButton = new JButton("AC Milan");
        panel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milan++;
                update("AC Milan");
            }
        });
        JButton jButton2 = new JButton("Real Madrid");
        panel.add(jButton2);
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                real++;
                update("Real Madrid");
            }
        });
        panel.add(label);
        panel.add(label2);
        panel.add(label3);
    }
     static void update(String last){
        label.setText("Result: " + milan + " X " + real);
        label2.setText("Last Score: " + last);
        String w = "DRAW";
        if(milan > real)
            w = "AC Milan";
        else if (real > milan)
            w = "Real Madrid";
        label3.setText("Winner: " + w);
    }
}