package pk.org.cas.Assignment14;

import java.util.Scanner;

public class Letter {
    private char letter;
    public static final char LETTER_SMALL_CRITERIA = 97;
    public static final char LETTER_SMALL_CRITERIA2 = 122;
    public static final char LETTER_CAPITAL_CRITERIA = 65;
    public static final char LETTER_CAPITAL_CRITERIA2 = 90;
    public static  final char LETTER_SMALL1 = 'a';
    public static final char LETTER_SMALL2 = 'z';
    public static final char LETTER_CAPITAL1 = 'A';
    public static final char LETTER_CAPITAL2 = 'Z';



    Scanner sc = new Scanner(System.in);

    public void setLetter(char letter){
        this.letter = letter;
    }
    public char getLetter(){
        return letter;
    }
    public Letter(){

    }
    public Letter(char letter){
        this.letter = letter;
    }

    public void input(){
        System.out.print("Enter letter: ");
        setLetter(sc.next().charAt(0));
    }

    //pattern one to solve this problem
    public void output(){
        if(getLetter()>=LETTER_SMALL_CRITERIA && getLetter()<=LETTER_SMALL_CRITERIA2){
            System.out.println(getLetter()+" letter is small");
        }else {
            System.out.println(getLetter()+" letter is capital");
        }
    }

    //pattern 2 to solve this problem
    public void display(){
        if(getLetter()>=LETTER_CAPITAL_CRITERIA && getLetter()<=LETTER_CAPITAL_CRITERIA2){
            System.out.println(getLetter()+" letter is capital");
        }else{
            System.out.println(getLetter()+" letter is small");
        }
    }

    //pattern 3 to solve this problem
    public void show(){
        if(getLetter()>=LETTER_SMALL1 && getLetter()<=LETTER_SMALL2){
            System.out.println(getLetter()+" letter is small");
        }else{
            System.out.println(getLetter()+" letter is capital");
        }
    }

    //pattern 4 to solve this problem
    public void view(){
        if(getLetter()>=LETTER_CAPITAL1 && getLetter()<=LETTER_CAPITAL2){
            System.out.println(getLetter()+" letter is capital");
        }
        else {
            System.out.println(getLetter()+" letter is small");
        }
    }







}
