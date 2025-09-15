package pk.org.cas.Assignment18;

import java.util.Scanner;

public class Medical {
        private char medicalCause;

        public static final char MEDICAL_CRITERIA= 'y';
        public static final char MEDICAL_CRITERIA2 = 'n';

        Scanner sc = new Scanner(System.in);

    public char getMedicalCause() {
        return medicalCause;
    }

    public void setMedicalCause(char medicalCause) {
        this.medicalCause = medicalCause;
    }

    public Medical() {

    }

    public Medical(char medicalCause) {
        this.medicalCause = medicalCause;
    }

    public void input(){
        System.out.print("your health is good or not (y or n): ");
        setMedicalCause(sc.next().charAt(0));
    }

    public void output(){
        if (getMedicalCause() == MEDICAL_CRITERIA){
            System.out.println("wow you can set in exam");
            System.out.println("very Good");
        }else{
            if (getMedicalCause() == MEDICAL_CRITERIA2){
                System.out.println("o no! you cannot set in exam");
                System.out.println("Go for check up and take rest");
            }else{
                System.out.println("invalid input");
            }
        }
    }
}
