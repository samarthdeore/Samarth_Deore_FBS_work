package Controller;

import java.util.Comparator;

import Model.SalesManager;

import Model.Employee;

public class SortByTarget implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1 instanceof SalesManager && o2 instanceof SalesManager)
			return Double.compare(((SalesManager)o1).getTarget(), ((SalesManager)o2).getTarget());
		return 0;
	}
	

}
