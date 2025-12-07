package Controller;

import java.util.Comparator;

import Model.Admin;
import Model.Employee;

public class SortByAllowance implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		 if(o1 instanceof Admin && o2 instanceof Admin)
			return Double.compare(((Admin)o1).getAllowance(), ((Admin)o2).getAllowance());
		return 0;
	}

}
