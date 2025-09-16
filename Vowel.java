package pk.org.cas.Assignment13;

import java.util.Scanner;

public class Vowel {
    private char alphabet;
    public static final char ALPHABET1 = 'a';
    public static final char ALPHABET2= 'e';
    public static final char ALPHABET3 = 'i';
    public static final char ALPHABET4 = 'o';
    public static final char ALPHABET5 = 'u';




    //create scanner class for input
    Scanner sc = new Scanner(System.in);

    //create getter and setter
    public void setAlphabet(char alphabet){
        this.alphabet = alphabet;
    }
    public char getAlphabet(){
        return alphabet;
    }

    //create default constructor
    public Vowel(){

    }
    public Vowel(char alphabet){
        this.alphabet = alphabet;
    }

    public void input(){
        System.out.print("Enter a alphabet: ");
        setAlphabet(sc.next().charAt(0));
    }

    public void output(){
        if(getAlphabet()==ALPHABET1 || getAlphabet() == ALPHABET2 ||getAlphabet() == ALPHABET3 || getAlphabet() == ALPHABET4 || getAlphabet() == ALPHABET5){
            System.out.println(getAlphabet()+" is Vowel letter");
        }
        else{
            System.out.println(getAlphabet()+" is Not Vowel letter");
        }
    }
}
