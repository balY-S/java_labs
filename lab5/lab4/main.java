package ru.mirea.lab4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;


class main extends JFrame {
    private int status = 1;
    int WINDOW_WIDTH = 600;
    int WINDOW_HEIGHT = 600;
    String animation_images_path;

    main() {
        super("Animation");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    void set_animation_images_path(String path) {
        this.animation_images_path = path;
    }

    // Paint method
    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        Timer timer = new Timer(100, e -> animate(this.animation_images_path, g));
        timer.start();
    }


    void animate(String frames_path, Graphics2D g) {
        File dir = new File(frames_path);
            for (File file : dir.listFiles()) {
                Image frame = Toolkit.getDefaultToolkit().getImage(file.getPath());
                g.drawImage(frame, 200, 200, 150, 150, this);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            }

        }

    public static void main(String[] args) {
        main app = new main();
        app.set_animation_images_path(args[0]);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // "C:/Users/Документы/IdeaProjects/Lab5/src/ru/mirea/lab4/anims/"
    }
}

