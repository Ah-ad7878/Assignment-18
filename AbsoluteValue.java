package pk.org.cas.Assignment18;

public class AbsoluteValue {
    private int no;

    public void setNo(int no){
        this.no = no;
    }
    public int getNo(){
        return no;
    }
    public AbsoluteValue(){

    }
    public AbsoluteValue(int no){
        this.no = no;
    }

    public void output(){
        if(getNo()<0){
            int absolute  = -getNo();
            System.out.println(absolute+" is the  absolute value of this No "+getNo());
        }else {
            if (getNo()>=0){
                int absolute = getNo();
                System.out.println(absolute+" is the absolute of this No");
            }
        }
    }
}
