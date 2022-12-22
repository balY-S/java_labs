package ru.mirea.lab41.p2;

// 2. Создайте класс Phone, который содержит переменные number, model и weight.
// 1)  Создайте три экземпляра этого класса.
// 2)  Выведите на консоль значения их переменных.
// 3)  Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
// 4)  Выводит на консоль сообщение “Звонит {name}”.
// 5)  Метод getNumber – возвращает номер телефона.
// 6)  Вызвать эти методы для каждого из объектов.
// 7)  Добавить конструктор в класс Phone, который принимает на вход
//     три параметра для инициализации переменных класса - number, model и weight.

// 8)  Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
// 9)  Добавить конструктор без параметров.
// 10) Вызвать из конструктора с тремя параметрами конструктор с двумя.
// 11) Добавьте перегруженный метод. receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
// 12) Вызвать этот метод.
// 13) Создать метод sendMessage с аргументами переменной длины.
//     Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.

// 14) Метод выводит на консоль номера этих телефонов.

public class Phone {
    private String number;
    private String model;
    private Double weight;

    public Phone(String number, String model, Double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public void sendMessage(String... numbers){
        System.out.println("\nСообщения отправлены на номера:");
        for (String num:
                numbers) {
            System.out.println(num);
        }
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + "{" + name + "}");
    }

    public void receiveCall(String name, String telephoneNumber) {
        System.out.println("Звонит " + "{" + name + " // номер: " + telephoneNumber + "}");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Phone a = new Phone("1111", "Model 1111", 500.0);
        Phone b = new Phone("2222", "Model 2222", 600.0);
        Phone c = new Phone("3333", "Model 3333", 700.0);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        a.receiveCall("namee");

        System.out.println("number у 1 = " + a.getNumber());
        System.out.println("number у 2 = " + b.getNumber());
        System.out.println("number у 3 = " + c.getNumber());

        a.receiveCall("namee", "123276832472");

        a.sendMessage("1231313","2313123", "323131");
    }
}
