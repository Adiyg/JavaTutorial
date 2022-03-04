
public class Employee implements Comparable<Employee> {
	
	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", Employeename=" + Employeename + ", Salary=" + Salary + "]";
	}
	public int EmployeeId;
	public String Employeename;
	public int Salary;
	public Employee(int employeeId, String employeename, int salary) {
		
		EmployeeId = employeeId;
		Employeename = employeename;
		Salary = salary;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.EmployeeId>o.EmployeeId) {
			return 1;
		}
		else if(this.EmployeeId<o.EmployeeId) {
			return -1;
		}
		return 0;
		
	//return this.EmployeeId-o.EmployeeId;
	}
	
	

}
