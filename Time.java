package pk.org.cas.Assignment13;

import java.util.Scanner;

public class Time {
    private int hours;
    private int mint;
    public static final int HOURS_MINIMUM_CRITERIA = 0;
    public static final int HOURS_MAXIMUM_CRITERIA = 24;
    public static final int MINT_MINIMUM_CRITERIA = 0;
    public static final int MINT_MAXIMUM_CRITERIA = 59;


    //create scanner class
    Scanner sc = new Scanner(System.in);

    //create constructor
    public Time(){

    }
    public Time(int hours,int mint){
        this.hours = hours;
        this.mint = mint;
    }

    //create getter and setter
    public void setHours(int hours){
        if(hours>HOURS_MINIMUM_CRITERIA && hours<=HOURS_MAXIMUM_CRITERIA){
            this.hours = hours;
        }else{
            System.out.println("invalid Time");
        }

    }
    public void setMint(int mint){
        if(mint>MINT_MINIMUM_CRITERIA && mint<MINT_MAXIMUM_CRITERIA){
            this.mint = mint;
        }else {
            System.out.println("invalid mint");
        }

    }
    public int getHours(){
        return hours;
    }
    public int getMint(){
        return mint;
    }

    public void input(){
        System.out.print("Enter hours between (0-24): ");
        setHours(sc.nextInt());
        System.out.print("Enter mint between (0-59): ");
        setMint(sc.nextInt());
    }
    public void output(){
        if(getHours()<=12){
            System.out.println("Time is Am");
        }else{
            System.out.println("Time is pm");
        }
    }



}
