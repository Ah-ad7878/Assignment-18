package pk.org.cas.Assignment18;

import java.util.Scanner;

public class Quadrant {
    private String quadrant1;
    private String quadrant2;

    Scanner sc = new Scanner(System.in);

    public String getQuadrant1() {
        return quadrant1;
    }

    public void setQuadrant1(String quadrant1) {
        this.quadrant1 = quadrant1;
    }

    public String getQuadrant2() {
        return quadrant2;
    }

    public void setQuadrant2(String quadrant2) {
        this.quadrant2 = quadrant2;
    }

    public Quadrant() {
    }

    public Quadrant(String quadrant1) {
        this.quadrant1 = quadrant1;
    }

    public void input(){
        System.out.print("Enter first Quadrant: ");
        setQuadrant1(sc.next());
        System.out.print("Enter second Quadrant: ");
        setQuadrant2(sc.next());
    }

    public void output(){
        if (getQuadrant1().equals("x") && getQuadrant2().equals("y")){
            System.out.println("This is first Quadrant");
        }else {
            if (getQuadrant1().equals("-x") && getQuadrant2().equals("y")){
                System.out.println("This is second Quadrant");
            }else {
                if (getQuadrant1().equals("x") && getQuadrant2().equals("-y")){
                    System.out.println("This is fourth Quadrant");
                }else {
                    if (getQuadrant1().equals("-x") && getQuadrant2().equals("-y")){
                        System.out.println("This is third Quadrant");
                    }else {
                        System.out.println("invalid value");
                    }
                }
            }
        }
    }
}
