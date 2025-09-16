package pk.org.cas.Assignment16;

import java.util.Scanner;

public class Cm2 {
    private double cm;
    private double km;
    private double meter;
    private int choice;

    public static final double METER_CRITERIA = 100;
    public static final double KM_CRITERIA = 100000;

    Scanner sc = new Scanner(System.in);

    public void setCm(double cm){
        this.cm = cm;
    }
    public void setKm(double km){
        this.km = km;
    }
    public void setMeter(double meter){
        this.meter = meter;
    }
    public double getCm(){
        return cm;
    }
    public double getKm(){
        return km;
    }
    public double getMeter(){
        return meter;
    }
    int ch;
    public void choice(){
        System.out.println("choose an option");
        System.out.println("1-meter");
        System.out.println("2-km");
        System.out.print("Enter your choice: ");
         ch = sc.nextInt();

    }
    public void output(){
        if(ch == 1){
            System.out.print("Enter the value of cm: ");
            setCm(sc.nextDouble());
            setMeter(getCm()/METER_CRITERIA);
            System.out.println("Meter is: "+getMeter());
        } else if (ch == 2) {
            System.out.print("Enter the value of cm: ");
            setCm(sc.nextDouble());
            setKm(getCm()/KM_CRITERIA);
            System.out.println("kilometer is "+getKm());
        } else {
            System.out.println("invalid choice");
        }
    }
}
