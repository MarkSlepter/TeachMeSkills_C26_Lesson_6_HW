package com.teachmeskills.lesson6.Assignment2;

public class InfoMyClassroom {
    public static void main(String[] args) {
        MyClassroom person1 = new MyClassroom("Petya", "Kotlov", "AB35674577", "c26");
        MyClassroom person2 = new MyClassroom("David", "Spronak", "AB57245724", "c26");
        MyClassroom person3 = new MyClassroom("Lisa", "Dombova", "AB48584626", "c26");
        MyClassroom person4 = new MyClassroom("Dima", "Keromak", "AB2562636", "c26");
        String[][] groupBase = {{person1.firstname, person1.lastname, person1.passportID, person1.groupName},{person2.firstname, person2.lastname, person2.passportID, person2.groupName},{person3.firstname, person3.lastname, person3.passportID, person3.groupName},{person4.firstname, person4.lastname, person4.passportID, person4.groupName}};
        for (String[] p1: groupBase) {
            System.out.println(" ");
            for (String p2: p1){
                System.out.print(p2 + " ");
            }
        }
    }
}
