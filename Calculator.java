package pk.org.cas.Assignment15;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Calculator {
    private int num1;
    private char operator;
    private int num2;

    Scanner sc = new Scanner(System.in);

    public void setNum1(int num1){
        this.num1 = num1;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }
    public void setOperator(char operator){
        this.operator = operator;
    }

    public int getNum1(){
        return num1;
    }
    public int getNum2(){
        return num2;
    }
    public char getOperator(){
        return operator;
    }
    public Calculator(){

    }
    public Calculator(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void input(){
        System.out.print("Enter first No: ");
        setNum1(sc.nextInt());
        System.out.print("Enter operator(+,-,/,%,*): ");
        setOperator(sc.next().charAt(0));
        System.out.print("Enter second No: ");
        setNum2(sc.nextInt());
    }

    public void calculate(){
        if(getOperator() == '+'){
            System.out.println("The Addition of 2 number is "+(getNum1()+getNum2()));
        } else if (getOperator() == '-') {
            System.out.println("The subtraction of no is "+ (getNum1() - getNum2()));
        } else if (getOperator() == '*') {
            System.out.println("The multiplication of 2 number is "+getNum1() * getNum2());
        } else if (getOperator() == '/') {
            System.out.println("The division of 2 no is "+getNum1()/getNum2());
        } else if (getOperator() == '%') {
            System.out.println("The modules of 2 no is "+getNum1()%getNum2());
        }else {
            System.out.println("invalid operator");
        }
    }
}
