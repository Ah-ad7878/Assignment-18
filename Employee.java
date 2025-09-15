package pk.org.cas.Assignment18;

public class Employee {
    private int service;
    private int salary;

    public static final double SALARY_CRITERIA = 0.05;

    public Employee(){

    }
    public Employee(int service,int salary){
        this.service = service;
        this.salary = salary;
    }

    public void setService(int service){
        this.service = service;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getService(){
        return service;
    }
    public int getSalary(){
        return salary;
    }

    public void output(){
        if(getService()>=5){
            double bonusAmount = getSalary()*SALARY_CRITERIA;
            System.out.println("wow! You got 5% Bonus "+bonusAmount);
        }else {
            System.out.println("oo no! you do not got bonus because your experience is less than 5 year and your Actual salary is "+getSalary());
            System.out.println("Try next time thanks ");
        }
    }
}
