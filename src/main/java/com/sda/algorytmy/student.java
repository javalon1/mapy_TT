package com.sda.algorytmy;

import java.util.Objects;

public class student {

    private  String name;
    private  String lastname;
    private  int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof student)) return false;
        student student = (student) o;
        return id == student.id &&
                Objects.equals(name, student.name) &&
                Objects.equals(lastname, student.lastname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, lastname, id);
    }



    public student(String name, String lastname, int id) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
