package ru.ogai.java.basic.homeworks.hw13_2;

public interface Transport {
    boolean move( int distance, TypeOfArea area);

    void setDriver(Person person);

}
