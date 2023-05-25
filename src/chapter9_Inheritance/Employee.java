package chapter9_Inheritance;

public class Employee extends Person{
    private int employeeId;
    private String employeeTitle;

    public Employee(){
        super("angie");
        System.out.println("Employee constructor");
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(){
        this.employeeId=employeeId;
    }
    public String getEmployeeTitle(){
        return employeeTitle;
    }

    public void setEmployeeTitle(){
        this.employeeTitle=employeeTitle;
    }

    public String print(String text){
        return text;
    }
}
