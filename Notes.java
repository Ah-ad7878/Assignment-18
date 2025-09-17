package pk.org.cas.Assignment18;

import java.util.Scanner;

public class Notes {
    private int amount;

    Scanner sc = new Scanner(System.in);

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Notes(int amount) {
        this.amount = amount;
    }

    public Notes() {
    }

    public void output(){
       if (getAmount()>=5000){
           System.out.println("Notes in 5000 "+getAmount()/5000);
           amount = amount%5000;
       }
       if(getAmount()>=1000){
           System.out.println("Notes in 1000 "+getAmount()/1000);
           amount = amount%1000;
       }
       if (getAmount()>=500){
           System.out.println("Notes in 500 "+getAmount()/500);
           amount = amount%500;
       }
       if (getAmount()>=100){
           System.out.println("Notes in 100 "+getAmount()/100);
           amount = amount%100;
       }
       if (getAmount()>=50){
           System.out.println("Notes in 50 "+getAmount()/50);
           amount = amount%50;
       }
       if (getAmount()>=20){
           System.out.println("Notes in 20 "+getAmount()/20);
           amount = amount%20;
       }
       if (getAmount()>=10){
           System.out.println("Notes in 10"+getAmount()/10);
           amount = amount%10;
       }
       if (getAmount()>=5){
           System.out.println("Notes in 5 "+getAmount()/5);
           amount = amount%5;
       }
       if (getAmount()>=2){
           System.out.println("Notes in 2 "+getAmount()/2);
           amount = amount%2;
       }
       if (getAmount()>=1){
           System.out.println("Notes in 1 "+getAmount()/1);
           amount = amount%1;
       }

    }
}
