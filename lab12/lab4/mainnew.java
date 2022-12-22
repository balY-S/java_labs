package ru.mirea.lab4;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.WindowConstants;


public class mainnew extends JFrame {

    private JLabel imgLabel;
    private int imgNum = 1;

    private mainnew(){
        super("Animation");
        this.setSize(270, 440);
        imgLabel = new JLabel("", new ImageIcon(getClass().getResource("anim1.png")), SwingConstants.CENTER);
        getContentPane().add(imgLabel);

        Timer timer = new Timer(100, e -> nextImg());
        timer.start();
    }
    private void nextImg(){
        imgLabel.setIcon(new ImageIcon(getClass().getResource("anim"+(++imgNum)+".png")));
        if(imgNum == 5) imgNum = 0;

    }

    public static void main(String[] args) {
        mainnew mf = new mainnew();
        mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mf.setVisible(true);

    }
}