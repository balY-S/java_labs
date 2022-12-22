package ru.mirea.lab4;

public class TestMath {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();
        int d;
        double x, pi, c;
        d = mc1.Pow(4, 5);
        x = mc1.Abs(2, 3);
        pi = mc1.pi;
        c = mc1.Circ(6);
        System.out.println("Возведение в степень: " + d + "\nМодуль комплексного числа: " + x + "\nЧисло Пи: " + pi + "\nДлина окружности: " + c);

    }
}