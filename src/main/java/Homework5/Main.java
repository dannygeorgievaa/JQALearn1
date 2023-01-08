package Homework5;

public class Main {
    public static void main(String[] args) {
        //Person john = new Person("John",30,true);
        // john.showPersonInfo();
        //Student nikolay = new Student("Nikolay",35,true,5);
        //nikolay.showStudentInfo();
        // Employee niki = new Employee("Niki",33,true,300);
        // double overtime = niki.calculateOvertime();
        // niki.employeeInfo();
        // System.out.println("Overtime money : " + overtime);
        Person[] people = new Person[10];

        people[0] = new Person("John", 25, true);
        people[1] = new Person("Jane", 35, false);
        people[2] = new Student("Jack", 18, true, 4.5);
        people[3] = new Student("Ana", 17, false, 6);
        people[4] = new Employee("Niki", 32, true, 320);
        people[5] = new Employee("Danny", 25, false, 250);

        for (int i = 0; i < people.length; i++) {

            if (people[i].getClass().getName().contains("Person")) {
                ((Person) people[i]).showPersonInfo();
            } else if (people[i].getClass().getName().contains("Student")) {
                ((Student) people[i]).showStudentInfo();

            } else if (people[i].getClass().getName().contains("Employee")) {
                ((Employee) people[i]).employeeInfo();
                double overtimeForDay = ((Employee) people[i]).calculateOvertime();
                double hourlyPay = overtimeForDay / 8;
                System.out.println("For 2 hours overtime: " + hourlyPay * 2);


            }


//            if (people[i] instanceof Person){
//                ((Person) people[i]).showPersonInfo();
//            }
//            else if (people[i] instanceof Student) {
//                ((Student) people[i]).showStudentInfo();
//
//            }
//            else if (people[i] instanceof Employee) {
//                ((Employee)people[i]).employeeInfo();
//
//            }


            //for (Person person : people) {
            //     person.showPersonInfo();
            //    System.out.println();
            // }

        }
    }
}

