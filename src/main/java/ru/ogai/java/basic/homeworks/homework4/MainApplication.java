package ru.ogai.java.basic.homeworks.homework4;

public class MainApplication {
    public static void main(String[] args) {
        User[] users = {new User("Иванов", "Иван", "Иванович", 2002, "ivanov@mail.ru"),
                new User("Петров", "Петр", "Петрович", 1975, "petr@example.com"),
                new User("Сидоров", "Сидор", "Сидорович", 1992, "sidor@example.com"),
                new User("Козлова", "Ксения", "Андреевна", 1985, "ksenia@example.com"),
                new User("Новиков", "Николай", "Николаевич", 1970, "nikolai@example.com"),
                new User("Григорьева", "Галина", "Сергеевна", 1988, "galina@example.com"),
                new User("Александров", "Александр", "Александрович", 1995, "alex@example.com"),
                new User("Ольгина", "Ольга", "Игоревна", 1968, "olga@example.com"),
                new User("Дмитриев", "Дмитрий", "Дмитриевич", 1978, "dmitriy@example.com"),
                new User("Мариянова", "Мария", "Александровна", 1990, "maria@example.com")
        };
        for (int i = 0; i < users.length; i++) {
            if (2024 - (users[i].getBirthdayYear()) > 40) {
                users[i].info();
            }
        }
        Box box = new Box(20, 15, 30, "желтый");
        box.printInfo();
        box.repaint("зеленый");
        box.printInfo();
        box.open();
        box.addItem("ручка");
        box.close();
        box.printInfo();
        box.removeItem();
        box.open();
        box.removeItem();
        box.addItem("тетрадка");
        box.close();
        box.printInfo();
    }
}
