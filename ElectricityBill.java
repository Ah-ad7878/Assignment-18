package pk.org.cas.Assignment18;

import java.util.Scanner;

public class ElectricityBill {
    private String name;
    private long customerId;
    private int unitConsumed;

    public static final int GST = 180;
    public static final int TV_FEE = 35;
    public static final int METER_RENT = 200;


    Scanner sc = new Scanner(System.in);

    public int getUnitConsumed() {
        return unitConsumed;
    }

    public void setUnitConsumed(int unitConsumed) {
        this.unitConsumed = unitConsumed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }
    public ElectricityBill(){

    }
    public ElectricityBill(String name,int unitConsumed,long customerId){
        this.name = name;
        this.customerId = customerId;
        this.unitConsumed = unitConsumed;
    }
    public ElectricityBill(long customerId,int unitConsumed){
        this.customerId = customerId;
        this.unitConsumed = unitConsumed;
    }
    public ElectricityBill(String name,int unitConsumed){
        this.name = name;
        this.unitConsumed = unitConsumed;
    }

    public void input(){
        System.out.print("Enter the name of customer: ");
        setName(sc.next());
        System.out.println("Name of the customer "+name);
        System.out.print("Enter the customer id: ");
        setCustomerId(sc.nextLong());
        System.out.println("customer id "+customerId);
        System.out.print("Enter the units consumed by user: ");
        setUnitConsumed(sc.nextInt());
        System.out.println("unit consumed "+unitConsumed);
    }

    public void display(){
        if (getUnitConsumed()<=199){
           int price1 =  getUnitConsumed()*13+METER_RENT+TV_FEE+GST;
           int outstandingUnit = unitConsumed/30;
            System.out.println("your bill is "+price1+" and outstanding unit in a month is "+outstandingUnit);
        }else {
            if (getUnitConsumed()>=200 && getUnitConsumed()<=300){
                int price2 = getUnitConsumed()*18+METER_RENT+TV_FEE+GST;
                int outstandingUnit = unitConsumed/30;
                System.out.println("your bill is "+price2+" and outstanding unit in a month is "+outstandingUnit);
            }else {
                if (getUnitConsumed()>=301 && getUnitConsumed()<=700){
                    int price3 = getUnitConsumed()*26+METER_RENT+TV_FEE+GST;
                    int outstandingUnit = unitConsumed/30;
                    System.out.println("your bill is "+price3+" and outstanding unit in a month is "+outstandingUnit);
                }else {
                    if (getUnitConsumed()>=700){
                        int price4 = getUnitConsumed()*35+METER_RENT+TV_FEE+GST;
                        int outstandingUnit = unitConsumed/30;
                        System.out.println("your bill is "+price4+" and outstanding unit in a month is "+outstandingUnit);
                    }else {
                        System.out.println("invalid units");
                    }
                }
            }
        }
    }

















}
