package com.company;

public class oop_basic_B39 {
    public static void main(String[] args) {
         Employee emp = new Employee("Krutarth Trivedi",20,123456789,"Dandia Bazar",20000,"Android Developer");
         Manager mng = new Manager("Malay Patel",21,465734821,"Atladara",25000,"Account Department");
         emp.details();
         mng.details();
    }
}

class Member{
    String name;
    int age ;
    long phone_number;
    String address ;
    int salary;

//    void printSalary(){
//        System.out.println("The salary of member is: "+salary);
//    }

    void details(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone Number: "+phone_number);
        System.out.println("Address: "+address);
        System.out.println("Salary: "+salary);
    }
}

class Employee extends Member{

    String specialization;
    Employee(String name, int age, long phone_number, String address,int salary, String specialization) {
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.address = address;
        this.salary = salary;
        this.specialization = specialization;

    }


    void details(){
        System.out.println("The details of Employee is: ");;
        super.details();
        System.out.println("Specialization: "+specialization);
    }

}

class Manager extends Member{

    String department;
    Manager(String name, int age, long phone_number, String address, int salary, String department){
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.address = address;
        this.salary = salary;
        this.department = department;
    }

    void details(){
        System.out.println("\nThe details of Manager is: ");
        super.details();
        System.out.println("Department: "+department);
    }

}
