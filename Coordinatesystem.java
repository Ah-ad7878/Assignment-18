package pk.org.cas.Assignment18;

import java.util.Scanner;

public class Coordinatesystem {
    private int quadrant1;
    private int quadrant2;

    Scanner sc = new Scanner(System.in);

    public int getQuadrant2() {
        return quadrant2;
    }

    public void setQuadrant2(int quadrant2) {
        this.quadrant2 = quadrant2;
    }

    public int getQuadrant1() {
        return quadrant1;
    }

    public void setQuadrant1(int quadrant1) {
        this.quadrant1 = quadrant1;
    }

    public Coordinatesystem(){

    }
    public Coordinatesystem(int quadrant1,int quadrant2){
        this.quadrant1 = quadrant1;
        this.quadrant2 = quadrant2;
    }

    public void input(){
        System.out.print("Enter quadrant1: ");
        setQuadrant1(sc.nextInt());
        System.out.print("Enter quadrant2: ");
        setQuadrant2(sc.nextInt());
    }

    public void output(){
        if (getQuadrant1()>0 && getQuadrant2()>0){
            System.out.println("This is first Quadrant");
        }else{
            if (getQuadrant1()<0 && getQuadrant2()>0){
                System.out.println("This is second Quadrant");
            }else {
                if (getQuadrant1()>0 && getQuadrant2()<0){
                    System.out.println("This is fourth Quadrant");
                }else {
                    if (getQuadrant1()<0 && getQuadrant2()<0){
                        System.out.println("This is third Quadrant");
                    }else {
                        System.out.println("invalid value");
                    }
                }
            }
        }
    }

}