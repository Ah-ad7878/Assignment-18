package pk.org.cas.Assignment13;

import java.util.Scanner;

public class Square {
    private int length;
    private int width;

    //create scanner class for input
    Scanner sc = new Scanner(System.in);

    //create getter and setter
    public void setLength(int length){
        this.length = length;
    }
    public int getLength(){
        return length;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return width;
    }

    //create constructor
    public Square(){

    }
    public Square(int length,int width){
        this.length  = length;
        this.width = width;
    }

    public void input(){
        System.out.print("Enter the value of length: ");
        setLength(sc.nextInt());
        System.out.print("Enter the value of width: ");
        setWidth(sc.nextInt());
    }

    public void output(){
        if(length == width){
            System.out.println("It is Square");
        }
        else{
            System.out.println("it is rectangle");
            //because when both side is equal it is square and if both side is not equal it is rectangle
        }
    }

}
