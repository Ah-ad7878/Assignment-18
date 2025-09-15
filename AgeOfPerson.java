package pk.org.cas.Assignment18;

import java.util.Scanner;

public class AgeOfPerson {
    private int age1;
    private int age2;
    private int age3;

    Scanner sc = new Scanner(System.in);

    public AgeOfPerson(){

    }
    public AgeOfPerson(int age1,int age2,int age3){
        this.age1 = age1;
        this.age2 = age2;
        this.age3 = age3;
    }

    public void setAge1(int age1){
        this.age1 = age1;
    }
    public void setAge2(int age2){
        this.age2 = age2;
    }
    public void setAge3(int age3){
        this.age3 = age3;
    }

    public int getAge1(){
        return age1;
    }
    public int getAge2(){
        return age2;
    }
    public int getAge3(){
        return age3;
    }

    public void input(){
        System.out.print("Enter your age: ");
        setAge1(sc.nextInt());
        System.out.print("Enter your age: ");
        setAge2(sc.nextInt());
        System.out.print("Enter your age: ");
        setAge3(sc.nextInt());

    }

    public  void output(){
        if(getAge1() > getAge2() && getAge1()>getAge3()){
            System.out.println("you are oldest man");
            System.out.println("Take rest and be careful about your health");
        } else if (getAge1() < getAge2() && getAge1() < getAge3()) {
            System.out.println("you are young person");
            System.out.println("very nice");
        }
    }

}
