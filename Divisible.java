package pk.org.cas.Assignment15;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Divisible {
    private int num;
    public static final int FIRSTNO = 5;
    public static final int SECONDNO = 11;


    Scanner sc = new Scanner(System.in);

    public void setNum(int num){
        this.num = num;
    }
    public int getNum(){
        return num;
    }
    public Divisible(){

    }
    public Divisible(int num){
        this.num = num;
    }
    public void input(){
        System.out.print("Enter a num: ");
        setNum(sc.nextInt());
    }
    public void output(){
        if(getNum()%FIRSTNO == 0 || getNum()%SECONDNO == 0){
            System.out.println(getNum()+" is divisible by 5 and 11");
        }else{
            System.out.println(getNum()+" is no divisible by 5 and 11");
        }
    }
}
