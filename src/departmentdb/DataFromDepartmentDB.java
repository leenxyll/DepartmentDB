/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package departmentdb;

import java.util.Collection;
import java.util.List;
import model.Department;
import model.DepartmentTable;
import model.Employee;
import model.EmployeeTable;

/**
 *
 * @author kotchanika
 */
public class DataFromDepartmentDB {
    public static void main(String[] args) {
        //All Employee (By ID)
        System.out.println("All Employee (By ID)");
        List<Employee> empListByID = EmployeeTable.findAllEmployee();
        for(Employee emp : empListByID){
            System.out.println(emp);
            System.out.println("---------------------------");
        }
        //All Employee (By DEPARTMENT)
        System.out.println("All Employee (By DEPARTMENT)");
        List<Department> dpList = DepartmentTable.findAllDepartment();
        System.out.println("---------------------------");
        for(Department dp : dpList){
            System.out.println(dp);
            System.out.println("---------------------------");
            Collection<Employee> empCollection = dp.getEmployeeCollection();
            for(Employee emp : empCollection){
                System.out.println(emp);
                System.out.println("---------------------------");
            }
        }
    }
}
