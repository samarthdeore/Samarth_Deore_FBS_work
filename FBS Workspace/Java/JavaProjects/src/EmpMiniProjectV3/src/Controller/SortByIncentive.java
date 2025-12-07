package Controller;

import java.util.Comparator;
import Model.SalesManager;

import Model.Employee;

public class SortByIncentive implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1 instanceof SalesManager && o2 instanceof SalesManager)
			return Double.compare(((SalesManager)o1).getIncentive(), ((SalesManager)o2).getIncentive());
		return 0;
	}

}
