package com.inheritance.hierarchicalInheritance;

public class PersonMain {
    public static void main(String[] args) {

        Teacher t = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student s = new Student("Raj", 18, "12th Grade");
        Staff st = new Staff("Anita", 35, "Administration");

        t.displayRole();
        System.out.println();

        s.displayRole();
        System.out.println();

        st.displayRole();
    }
}

