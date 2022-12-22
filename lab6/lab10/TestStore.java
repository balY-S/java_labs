package ru.mirea.lab10;

import java.util.Scanner;

public class TestStore {
    static public Computer enter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите информацию о мониторе - диагональ и частота: ");
        Monitor monitor = new Monitor(sc.nextInt(), sc.nextInt());
        System.out.println("Введите объем памяти: ");
        Memory memory = new Memory(sc.nextInt());
        System.out.println("Введите тактовую частоту процессора: ");
        Processor processor = new Processor(sc.nextInt());
        int num;
        Brand brand;
        System.out.println("Введите номер компьютера: ");
        num = sc.nextInt();
        System.out.println("Введите марку - Lenovo, HP, ASUS, ACER, DELL: ");
        String brandName = sc.next();
        switch (brandName) {
            case "Lenovo":
                brand = Brand.Lenovo;
                break;
            case "HP":
                brand = Brand.HP;
                break;
            case "ASUS":
                brand = Brand.ASUS;
                break;
            case "ACER":
                brand = Brand.ACER;
                break;
            default:
                brand = Brand.DELL;
        }
        Computer computer = new Computer(brand, num, monitor, memory, processor);
        return computer;
    }

    public static void main(String[] args) {
        String command;
        Store s = new Store();
        Computer c;
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - добавить\n2 - удалить\n3 - найти\n4 - показать\n0 - выйти ");
        command = sc.next();
        while (true) {
            switch (command) {
                case "1":
                    s.addComputer(enter());
                    break;
                case "2":
                    System.out.println("Введите номер ");
                    s.deleteComputer(sc.nextInt());
                    break;
                case "3":
                    System.out.println("Введите номер: ");
                    System.out.println(s.findComputer(sc.nextInt()));
                    break;
                case "4":
                    System.out.println(s);
                    break;
                case "0":
                    return;
                default:
                    System.out.println("неизвестная команда");
            }
            System.out.println("1 - добавить\n2 - удалить\n3 - найти\n4 - показать\n0 - выйти ");
            command = sc.next();
        }
    }
}
