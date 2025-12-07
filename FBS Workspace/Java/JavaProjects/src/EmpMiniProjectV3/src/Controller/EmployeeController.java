package Controller;

import java.util.Collections;

import Model.Employee;

public class EmployeeController {
	EmployeeDAO ed=new EmployeeDAO();
	
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		if(ed.addEmployee(e)) {
			System.out.println("Successfull!!!");
		}else {
			System.out.println("Array is Full!!");
		}
		
	}

	public Employee searchEmployeeById(int id) {
		// TODO Auto-generated method stub
		Employee e1=ed.searchEmployee(id);
		if(e1!=null) {
			return e1;
		}
		return null;
	}

	public boolean updateEmployee(int id, double salary) {
		// TODO Auto-generated method stub
		if(ed.updateEmployee(id,salary)) {
			return true;
		}
		return false;
	}

	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		if(ed.deleteEmployee(id)) {
			return true;
		}
		return false;
	}

	public void displayAll() {
		// TODO Auto-generated method stub
		ed.displayAll();
		
	}

	public void sortEmployees(int choice) {
		switch (choice) {
		case 1:
			SortById sbi = new SortById();
			Collections.sort(ed.eList, sbi);
			break;
		case 2:
			SortByName sbn = new SortByName();
			Collections.sort(ed.eList, sbn);
			break;
		case 3:
			SortBySalary sbs = new SortBySalary();
			Collections.sort(ed.eList, sbs);
			break;
		case 4:
			SortByCommission sbc = new SortByCommission();
			Collections.sort(ed.eList, sbc);
			break;
		case 5:
			SortByAllowance sba = new SortByAllowance();
			Collections.sort(ed.eList, sba);
			break;
		case 6:
			SortByTarget sbt = new SortByTarget();
			Collections.sort(ed.eList, sbt);
			break;
		case 7:
			SortByIncentive sb = new SortByIncentive();
			Collections.sort(ed.eList, sb);
			break;
		default:
			System.out.println("Invalid Sort Choice!");
		}
	}
}
