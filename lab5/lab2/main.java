package ru.mirea.lab2;

import java.awt.*;
import javax.swing.*;


class main extends JFrame {
    int WINDOW_WIDTH = 500;
    int WINDOW_HEIGHT = 500;


    main() {
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    @Override
    public void paint(Graphics g2) {
        int shapes = 20;
        Graphics2D g = (Graphics2D) g2;

        for (int i = 0; i < shapes; i++) {
            int choice = (int) (Math.random() * 4);

            switch (choice) {

                // Oval
                case 1:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillOval(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * 300),
                            (int) (Math.random() * 300));
                    break;

                // Rect
                case 2:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillRect(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * 300),
                            (int) (Math.random() * 300));
                    break;


                // Circle
                case 3:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillOval(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            200, 200);
                    break;

                default:
                    break;
            }
        }
    }


    public static void main(String[] args) {
        main app = new main();
    }
}
