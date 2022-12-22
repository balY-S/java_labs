package ru.mirea.lab3;

import java.awt.*;
import javax.swing.*;

class main extends JFrame {
    int WINDOW_WIDTH = 500;
    int WINDOW_HEIGHT = 500;
    String background_image_path;

    main() {
        super("Image");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    void set_background_image_path(String path) {
        this.background_image_path = path;
    }

    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        Image img = Toolkit.getDefaultToolkit().getImage(this.background_image_path);
        g.drawImage(img, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);
    }

    public static void main(String[] args) {
        main app = new main();
        app.set_background_image_path(args[0]);
    }
    // "C:/Users/Документы/IdeaProjects/Lab5/src/ru/mirea/lab3/background.jpg"
}