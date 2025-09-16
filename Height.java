package pk.org.cas.Assignment17;

import java.util.Scanner;

public class Height {
    private int cm;

    public int getCm() {
        return cm;
    }

    public void setCm(int cm) {
        this.cm = cm;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in cm: ");
        setCm(sc.nextInt());
    }

    public void output(){
        if (getCm()>=165 && getCm()<=182){
            System.out.println("you are tallest person");
            System.out.println("very nice");
        }else {
            if (getCm()>=140 && getCm()<=159){
                System.out.println("You are medium size person");
                System.out.println("Good");
            }else {
                if (getCm()>=100 && getCm()<=139){
                    System.out.println("you are smallest person ");
                    System.out.println("Take protein to increase your height");
                }else {
                    System.out.println("Enter correct cm value");
                }
            }
        }
    }
}
