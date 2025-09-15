package pk.org.cas.Assignment18;

public class Attendance {
    private int classHeld;
    private int classAttend;

//    public static final int ATTENDANCE_PERCENTAGE = 75;

    public void setClassHeld(int classHeld){
        this.classHeld = classHeld;
    }
    public void setClassAttend(int classAttend){
        this.classAttend = classAttend;
    }
    public int getClassHeld(){
        return classHeld;
    }
    public int getClassAttend(){
        return classAttend;
    }

    public Attendance(){

    }
    public Attendance(int classAttend,int classHeld){
        this.classAttend = classAttend;
        this.classHeld = classHeld;
    }


    public void output(){
        int percentage = getClassAttend()*100/getClassHeld();
        if(percentage>=75){
            System.out.println("Good you can sit in exam room for exam");
            System.out.println("your Attendance percentage is "+percentage);
        }
        else {
            System.out.println("o No you cannot sit in exam room for exam");
            System.out.println("your Attendance percentage is "+percentage);
        }
    }

}
