package pk.org.cas.Assignment17;

import java.util.Scanner;

public class TwoNo {
    private int num1;
    private int num2;

    Scanner sc = new Scanner(System.in);

    public TwoNo(){

    }
    public TwoNo(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(int num1){
        this.num1 = num1;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }
    public int getNum1(){
        return num1;
    }
    public int getNum2(){
        return num2;
    }

    public void input(){
        System.out.print("Enter first no: ");
        setNum1(sc.nextInt());
        System.out.print("Enter second no: ");
        setNum2(sc.nextInt());
    }

    public void output(){
        if(getNum1() == getNum2()){
            System.out.println(getNum1()+" is greater then "+getNum2());
        }else {
            System.out.println(getNum1()+" is not greater than "+getNum2());
        }
    }


}
