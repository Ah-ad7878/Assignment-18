package pk.org.cas.Assignment17;

import java.util.Scanner;

public class Shop {
    private int quantity;
    private int discount = 10;

    public static final int ITEM_PRICE= 100;
    public static final int TOTAL_CRITERIA = 1000;

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }

    public Shop(){

    }
    public Shop(int quantity){
        this.quantity = quantity;
    }
    Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.print("Enter Quantity: ");
        setQuantity(sc.nextInt());
        System.out.println("Selected quantity: "+getQuantity());
    }

    public void output(){
        int totalQuantityPrice = getQuantity()*ITEM_PRICE;
        System.out.println("Total price of item "+totalQuantityPrice);

        if(totalQuantityPrice>=TOTAL_CRITERIA){
            int discountPrice = discount*totalQuantityPrice/100;
            int finalPrice = totalQuantityPrice-discountPrice;
            System.out.println("Discount is "+discountPrice);
            System.out.println("final price after discount "+finalPrice);
            System.out.println("Wow! you got discount ");
            System.out.println("Thanks for shopping");
        }else{
            if (totalQuantityPrice<TOTAL_CRITERIA){
                System.out.println("ooo! no you do not have discount ");
                System.out.println("Thanks for shopping ");
            }
        }
    }

}
