package ru.mirea.lab4;

public enum Season {
    WINTER(-25) {
        public void getDescription() { System.out.print("Холодное время года!"); }
    },
    SPRING(-13) {
        public void getDescription() {
            System.out.print("Цветущее время года!");
        }
    },
    SUMMER(30) {
        public void getDescription() {
            System.out.print("Теплое время года!");
        }
    },
    AUTUMN(15) {
        public void getDescription() {
            System.out.print("Дождливое время года!");
        }
    };
    // 2) Создать метод, который принимает на вход переменную созданного вами enum типа.
    // Если значение равно Лето, выводим на консоль “Я люблю лето” и так далее.
    // Используем оператор switch.
    public void displayFavoriteSeason() {
        System.out.print("Я люблю ");
        switch (this) {
            case WINTER -> System.out.println("Зиму!");
            case SPRING -> System.out.println("Весну!");
            case SUMMER -> System.out.println("Лето!");
            case AUTUMN -> System.out.println("Осень!");
        }
    }
    // 3) Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
    private final int avrTemp;
    // 4) Добавить конструктор, принимающий на вход среднюю температуру.
    Season(int temp) {
        avrTemp = temp;
    }
    public int getAvrTemp() {
        return avrTemp;
    }
    // 5) Создать метод getDescription, возвращающий строку “Холодное время года”.
    // Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
    public abstract void getDescription();
}
