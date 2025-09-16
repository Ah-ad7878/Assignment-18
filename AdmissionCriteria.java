package pk.org.cas.Assignment18;

import java.util.Scanner;

public class AdmissionCriteria {
    private short mathMrks;
    private short chemMarks;
    private short phycsMarks;


    public static final short MATH_CRITERIA = 65;
    public static final short CHEM_CRITERIA = 50;
    public static final short PHYSICS_CRITERIA = 55;
    public static final short TOTAL_CRITERIA_ALL = 190;
    public static final short TOTAL_CRITERIA = 140;


    Scanner sc = new Scanner(System.in);

    public short getMathMrks() {
        return mathMrks;
    }

    public void setMathMrks(short mathMrks) {
        this.mathMrks = mathMrks;
    }

    public short getChemMarks() {
        return chemMarks;
    }

    public void setChemMarks(short chemMarks) {
        this.chemMarks = chemMarks;
    }

    public short getPhycsMarks() {
        return phycsMarks;
    }

    public void setPhycsMarks(short phycsMarks) {
        this.phycsMarks = phycsMarks;
    }
    public AdmissionCriteria(){

    }
    public AdmissionCriteria(short mathMrks,short chemMarks, short phycsMarks){
        this.mathMrks = mathMrks;
        this.phycsMarks = phycsMarks;
        this.chemMarks = chemMarks;
    }

    public void input(){
        System.out.print("Enter the marks of math: ");
        setMathMrks(sc.nextShort());
        System.out.println("Marks of math "+ getMathMrks());
        System.out.print("Enter the marks of chem: ");
        setChemMarks(sc.nextShort());
        System.out.println("Marks of chemistry "+getChemMarks());
        System.out.print("Enter the marks of phycs: ");
        setPhycsMarks(sc.nextShort());
        System.out.println("Marks of physics "+getPhycsMarks());
    }

    public void output(){
        int totalAll = mathMrks+chemMarks+phycsMarks;
        System.out.println("Total marks in all subject "+totalAll);
        int total2 = mathMrks+phycsMarks;
        System.out.println("Total marks in 2 subject "+total2);


        if (getMathMrks()>=MATH_CRITERIA && getPhycsMarks()>=PHYSICS_CRITERIA && getChemMarks()>=CHEM_CRITERIA || totalAll>=TOTAL_CRITERIA_ALL && total2>=TOTAL_CRITERIA){
            System.out.println("wow you are eligible for Admission in this college");
            System.out.println("Good welcome to punjab college");
        }else{
            System.out.println("you are not eligible for Admission");
        }

    }
}
