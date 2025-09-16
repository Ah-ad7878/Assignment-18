package pk.org.cas.Assignment16;

import java.util.Scanner;

public class Cm {
    public static void main(String[] args) {
        double cm;
        double meter;
        double km;

        Scanner sc = new Scanner(System.in);
        System.out.println("--choose an option--");
        System.out.println("1-meter");
        System.out.println("2-km");
        System.out.print("Enter a option: ");
        int option = sc.nextInt();


        if(option == 1){
            System.out.print("Enter the value of cm: ");
            cm = sc.nextInt();
            meter =cm/100;
            System.out.println(meter+" of cm is "+cm);
        } else if (option == 2) {
            System.out.print("Enter the value of cm: ");
            cm = sc.nextInt();
            km = cm/100000;
            System.out.println(km+" of cm is "+cm);
        }else {
            System.out.println("invalid option");
        }

    }




}
