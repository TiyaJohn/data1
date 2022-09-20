import org.emp.Employee;

public class Employee {
	private void empId() {
		System.out.println("Enter Employee Id:");
	}
	
	
	private void empName() {
System.out.println("Enter your Name:");
	}
	
	private void empDob() {
System.out.println("Enter your Date of birth:");
	}
	
	private void empPhone() {
System.out.println("Enter your Phone no. :");
	}
	
	private void empEmail() {
System.out.println("Enter your EmailId:");
	}
	
	private void empAddress() {
System.out.println("Enter your Address:");
	}
	
	public static void main(String[] args) {
		Employee a = new Employee();
		
		//to call method
		a.empId();
		a.empName();
		a.empDob();
		a.empPhone();
		a.empEmail();
		a.empAddress();
	}
	}

}
