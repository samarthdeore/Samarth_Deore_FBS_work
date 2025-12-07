package Controller;

import Model.Employee;
import java.util.ArrayList;
import Model.Admin;
import Model.HR;
import Model.SalesManager;

public class EmployeeDAO {

    static ArrayList<Employee> eList;

    static {
        eList = new ArrayList<>();
        eList.add(new HR(101, "Aditya", 50000, 5000));
        eList.add(new HR(102, "Amit", 48000, 4500));
        eList.add(new HR(103, "Suraj", 47000, 4000));
        eList.add(new SalesManager(201, "Minal", 60000, 12, 8000));
        eList.add(new SalesManager(202, "Sanjay", 58000, 15, 7500));
        eList.add(new SalesManager(203, "Chinmay", 62000, 10, 9000));
        eList.add(new Admin(301, "Harsh", 70000, 10000));
        eList.add(new Admin(302, "Ninad", 68000, 9500));
        eList.add(new Admin(303, "Vaibhav", 72000, 11000));
        eList.add(new Admin(304, "Namrata", 75000, 12000));
    }

    public boolean addEmployee(Employee e) {
        return eList.add(e);  // true if added
    }

    public Employee searchEmployee(int id) {
        for (Employee emp : eList) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    public boolean updateEmployee(int id, double salary) {
        for (Employee emp : eList) {
            if (emp.getId() == id) {
                emp.setSalary(salary);
                return true;
            }
        }
        return false;
    }

    public boolean deleteEmployee(int id) {
        for (Employee emp : eList) {
            if (emp.getId() == id) {
                return eList.remove(emp);
            }
        }
        return false;
    }

    public void displayAll() {
        for (Employee emp : eList) {
            System.out.println(emp);
        }
    }
}
