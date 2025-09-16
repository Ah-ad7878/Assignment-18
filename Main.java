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
//        System.out.println();
//        Attendance attendance = new Attendance();
//        System.out.print("Enter total class held in university: ");
//        attendance.setClassHeld(sc.nextInt());
//        System.out.print("Enter the classes which is attended by the student: ");
//        attendance.setClassAttend(sc.nextInt());
//
//        attendance.output();

//        System.out.println();
//        Medical medical = new Medical();
//        medical.input();
//        medical.output();

//        System.out.println();
//        AbsoluteValue absoluteValue = new AbsoluteValue();
//        System.out.print("Enter a no: ");
//        absoluteValue.setNo(sc.nextInt());
//        absoluteValue.output();

//        System.out.println();
//        Coordinatesystem c = new Coordinatesystem();
//        c.input();
//        c.output();

//        System.out.println();
//        Quadrant q = new Quadrant();
//        q.input();
//        q.output();

        System.out.println();
        Temperature temperature = new Temperature();
        System.out.print("Enter temperature in centigrade: ");
        temperature.setCentigrade(sc.nextShort());
        temperature.output();

    }
}
