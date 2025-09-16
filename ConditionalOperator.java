package pk.org.cas.Assignment12;

import java.util.Scanner;

public class ConditionalOperator {

        //Qno 01
        //first we take input of 2 n by the user
       Scanner sc = new Scanner(System.in);
       private int num1;
       private int num2;

       //create getter setter
    public void setNum1(int num1){
        this.num1 = num1;
    }
    public int getNum1(){
        return num1;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }
    public int getNum2(){
        return num2;
    }

    //default constructor
    public ConditionalOperator(){

    }
    public ConditionalOperator(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void equalNo() {
        System.out.print("Enter first no: ");
        setNum1(sc.nextInt());
        System.out.print("Enter second no: ");
        setNum2(sc.nextInt());

        //now we use if statement to check the no are equals or not
        if (getNum1() == getNum2()) {
            System.out.println("These 2 no are equals");
        } else {
            System.out.println("These 2 no are not equals");
        }

    }


        //Qno 02
    private int num;
    //create getter setter
    public void setNum(int num){
        this.num = num;
    }
    public int getNum(){
        return num;
    }
    public void checkEven(){
        System.out.print("Enter a number: ");
        setNum(sc.nextInt());
        if(getNum()%2 == 0){
            System.out.println("The no is even");
        }
        else{
            System.out.println("The no is odd");
        }
    }

       //Qno 3
    private int age;

    //create getter setter
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void voteCasting(){
        System.out.print("Enter your age: ");
        setAge(sc.nextInt());

        if(getAge()>=18){
            System.out.println("Candidate eligible for vote casting");
        }
        else{
            System.out.println("Candidate is not eligible for vote casting ");
        }
    }


       //Qno 04
    private int year;

    //create getter setter
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public void leapYear(){
        System.out.print("Enter a year: ");
        setYear(sc.nextInt());
        if(getYear()%4 == 0 & getYear()%100 == 0|| getYear()%400 == 0){
            System.out.println("year is leap");
        }
        else{
            System.out.println("year is not leap");
        }
    }




}
