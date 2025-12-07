package Controller;

import java.util.Comparator;
import Model.HR;

import Model.Employee;

public class SortByCommission implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1 instanceof HR && o2 instanceof HR)
			return Double.compare(((HR)o1).getCommission(), ((HR)o2).getCommission());
		return 0;
		
	}

}
