package main.java.oops.concepts;

public class EmployeeEncapsulation {
    private String employeeName;
    private int employeeId;
    private boolean isVeteran;
    private float employeeExperience;
    private double employeeSalary;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public boolean isVeteran() {
        return isVeteran;
    }

    public void setVeteran(boolean veteran) {
        isVeteran = veteran;
    }

    public float getEmployeeExperience() {
        return employeeExperience;
    }

    public void setEmployeeExperience(float employeeExperience) {
        this.employeeExperience = employeeExperience;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public static void main(String[] args) {

        EmployeeEncapsulation obj = new EmployeeEncapsulation();
        obj.setEmployeeName("Madhu");
        obj.setEmployeeId(34);
        obj.setVeteran(false);
        obj.setEmployeeExperience(2.8f);
        obj.setEmployeeSalary(70000);
        System.out.println("EmployeeName :" + obj.getEmployeeName() +"\n" +"EmployeeId  :" + obj.getEmployeeId()
                +"\n" + "Veteran :" + obj.isVeteran() + "\n" + "Employee Experience (years) :" + obj.getEmployeeExperience()
                +"\n" + "Employee Salary(USD) :" + obj.getEmployeeSalary());
    }


}
