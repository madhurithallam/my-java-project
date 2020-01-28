package main.java.oops.concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeSort implements Comparator<EmployeeEncapsulation>{
    @Override
    public int compare(EmployeeEncapsulation o1, EmployeeEncapsulation o2) {
        return  o1.getEmployeeName().compareTo(o2.getEmployeeName());
    }
}
public class EmployeeList {

    public static void main(String[] args) {
        List<EmployeeEncapsulation> employees = new ArrayList<>();
        EmployeeEncapsulation employee1 = getEmployeeEncapsulations("Mark", 27, false, 9.2f, 70000);
        EmployeeEncapsulation employee2 = getEmployeeEncapsulations("Nicole", 22,false,19.2f,250000);
        employees.add(employee1);
        employees.add(employee2);
        Collections.sort(employees,new EmployeeSort());

        for(EmployeeEncapsulation obj :employees){
            System.out.println("EmployeeName :" + obj.getEmployeeName() +"\n" +"EmployeeId  :" + obj.getEmployeeId()
                    +"\n" + "Veteran :" + obj.isVeteran() + "\n" + "Employee Experience (years) :" + obj.getEmployeeExperience()
                    +"\n" + "Employee Salary(USD) :" + obj.getEmployeeSalary());
        }

    }

    private static EmployeeEncapsulation getEmployeeEncapsulations(String employeeName, int employeeId, boolean isVeteran,
                                                                   float employeeExperience, double employeeSalary) {
        EmployeeEncapsulation employee = new EmployeeEncapsulation();
        employee.setEmployeeName(employeeName);
        employee.setEmployeeId(employeeId);
        employee.setVeteran(isVeteran);
        employee.setEmployeeExperience(employeeExperience);
        employee.setEmployeeSalary(employeeSalary);
        return employee;
    }
}
