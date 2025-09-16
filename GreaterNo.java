package pk.org.cas.Assignment18;

public class GreaterNo {
    public static void main(String[] args) {
        int number1 = 120938;
        int number2 = 25894;
        int number3 = 52244562;

       if (number1>number2 && number1>number3){
           System.out.println(number1+" is greater");
       }else {
           if (number2 > 1 && number2 > number3) {
               System.out.println(number2 + " is greater");
           } else {
               System.out.println(number3 + " is greater");
           }
    }   }
}
