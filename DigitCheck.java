package pk.org.cas.Assignment15;

import java.util.Scanner;

public class DigitCheck {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
       int rem = num%10;
        System.out.println("last digit of a no is "+ rem);
        if(rem%3 == 0){
            System.out.println(rem+" is divisible by 3");
        }else {
            System.out.println(rem+" is not divisible by 3");
        }
    }


}
