package com.sda.algorytmy;

public class HashExample {
    public static void main(String[] args) {
        student student1 = new student("Jan","Kow",1);
        student student2 = new student("Jan1","Kow",1);
        System.out.println(student1==student2);
        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

    }
}
