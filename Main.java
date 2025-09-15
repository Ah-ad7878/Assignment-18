package pk.org.cas.Assignment18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Employee employee = new Employee();

        Scanner sc = new Scanner(System.in);
//        //experience >5 or <5
//        System.out.print("Enter your experience: ");
//        employee.setService(sc.nextInt());
//        System.out.print("Enter your salary: ");
//        employee.setSalary(sc.nextInt());

//        employee.output();
//        System.out.println();
//        AgeOfPerson age = new AgeOfPerson();
//        age.input();
//        age.output();
        System.out.println();
        Attendance attendance = new Attendance();
        System.out.print("Enter total class held in university: ");
        attendance.setClassHeld(sc.nextInt());
        System.out.print("Enter the classes which is attended by the student: ");
        attendance.setClassAttend(sc.nextInt());

        attendance.output();

        //obtain/total*100 but in java obtain*100/total

    }
}
