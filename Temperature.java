package pk.org.cas.Assignment18;

import java.util.Scanner;

public class Temperature {
    private short centigrade;

    Scanner sc = new Scanner(System.in);

    public void setCentigrade(short centigrade){
        this.centigrade = centigrade;
    }
    public short getCentigrade(){
        return centigrade;
    }
    public Temperature(){

    }
    public Temperature(short centigrade){
        this.centigrade = centigrade;
    }

    public void output(){
        if (centigrade<0){
            System.out.println("This is freezing weather");
            System.out.println("hooooo! its very cold weather everything freeze");
        }else {
            if (centigrade>0 && centigrade<=10){
                System.out.println("its very cold weather");
            }else {
                if (centigrade>10 && centigrade<20){
                    System.out.println("its cold weather");
                }else {
                    if (centigrade>20 && centigrade<30){
                        System.out.println("it is normal temperature");
                    }else{
                        if (centigrade>30 && centigrade<50){
                            System.out.println("its very hot weather ");
                            System.out.println("ooo! everything is hot");
                        }else {
                            System.out.println("invalid temperature");
                        }
                    }
                }
            }
        }
    }
}
