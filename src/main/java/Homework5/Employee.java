package Homework5;

public class Employee extends Person {
    private double daySalary;

    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    public double getDaySalary() {
        return this.daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }
    public void employeeInfo(){
        System.out.println("Name: " + super.getName());
        System.out.println("Age: " + super.getAge());
        System.out.println("Is Man: " + super.getIsMan());
        System.out.println("Salary: " + this.daySalary);
    }

    public double calculateOvertime() {
        double overtime;
        if (super.getAge() > 18 )
        {
            overtime = daySalary * 1.5 ;
        }
        else overtime = 0;

        return overtime;
    }
}