package ru.ogai.java.basic.homeworks.homework4;

public class User {
    private String lastName;
    private String name;
    private String parentName;
    private int birthdayYear;
    private String email;

    public User(String lastName, String name, String parentName, int birthdayYear, String email) {
        this.lastName = lastName;
        this.name = name;
        this.parentName = parentName;
        this.birthdayYear = birthdayYear;
        this.email = email;

    }

    public int getBirthdayYear() {
        return birthdayYear;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getParentName() {
        return parentName;
    }

    public void setBirthdayYear(int birthdayYear) {
        this.birthdayYear = birthdayYear;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public void info() {
        System.out.println("ФИО: " + lastName + " " + name + " " + parentName);
        System.out.println("Год рождения:  " + birthdayYear);
        System.out.println("email: " + email);
    }
    
}
