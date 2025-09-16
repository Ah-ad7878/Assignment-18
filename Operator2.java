package pk.org.cas.Assignment16;

public class Operator2 {
    int x = 2;
    int y = 5;
    int z = 0;

    public void setX(int x){
        this.x= x;
    }
    public int getX(){
        return x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getY(){
        return y;
    }
    public void setZ(int z){
        this.z = z;
    }
    public int getZ(){
        return z;
    }
    public Operator2(){

    }
    public Operator2(int y,int x, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Operator2(int z,int y){
        this.z = z;
        this.y = y;
    }
//x == 2, x!=5,x!=5 && y>=5,z!=0||x==2, !y<10
    public void output(){
        if(x == 2){
            System.out.println("true");
            if (x!=5){
                System.out.println("true");
            }else {
                System.out.println("not true");
            }if (x!=5 && y>=5){
                System.out.println("true");
            }else {
                System.out.println("not true");
            }if (z!=0 || x==2){
                System.out.println("true");
            }else{
                System.out.println("not true");
            }if (!(y<10)){
                System.out.println(true);
            }
        }else {
            System.out.println("not true");
        }
    }
}
