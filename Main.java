package pk.org.cas.Assignment13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Vowel class---");
        Vowel vowel = new Vowel();
        vowel.input();
        vowel.output();
        System.out.println();
        System.out.println("---Square class---");
        Square square = new Square();
        square.input();
        square.output();
        System.out.println();
        System.out.println("---time class---");
        Time time = new Time();
        time.input();
        time.output();






    }
}
