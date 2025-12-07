package Controller;

import java.util.Comparator;

import Model.Employee;

public class SortById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getId() - o2.getId();
	}

}
