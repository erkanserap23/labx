package org.etiya;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        Employee employee = new Employee();

        customer.email = "serap@fdd";
        employee.salary = 255;


        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.BestEmployee();
        employeeManager.add();
        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.list();


    }
}