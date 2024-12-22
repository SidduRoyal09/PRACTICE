package com.Practice;

import java.util.ArrayList;
import java.util.Iterator;

class Student2440 {
    String stName;
    int stMarks;
    int stId;

    Student2440(String stName, int stMarks, int stId) {
        this.stName = stName;
        this.stMarks = stMarks;
        this.stId = stId;
    }

    public String toString() {
        return "Name= " + stName + " Marks=" + stMarks  + " ID=" + stId;
    }
}

public class Test261 {
    public static void main(String[] args) {
//        ArrayList students = new ArrayList();
//        students.add(new Student2440("Alice", 65, 101));
//        students.add(new Student2440("Bob", 45, 102));
//        students.add(new Student2440("Charlie", 75, 103));
//        students.add(new Student2440("David", 30, 104));
//        students.add(new Student2440("Eve", 85, 105));
//        
        ArrayList<Student2440> students = new ArrayList<Student2440>();
        students.add(new Student2440("Alice", 65, 101));
        students.add(new Student2440("Bob", 45, 102));
        students.add(new Student2440("Charlie", 75, 103));
        students.add(new Student2440("David", 30, 104));
        students.add(new Student2440("Eve", 85, 105));

        // Type-safe iterator
        Iterator<Student2440> iterator1 = students.iterator();
//      Iterator iterator1 = students.iterator(); 
        while (iterator1.hasNext()) {
            Student2440 student =(Student2440) iterator1.next();
            if (student.stMarks < 50) { 
                iterator1.remove();
            }
        } 
 
        
            System.out.println(students);
        }
    }

