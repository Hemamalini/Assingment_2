package assingment2;
//Create a new class as EmployeeDetails with methods as below
public class EmployeeDetails {
	//printEmployeeName(String empName, int empId) -> print the empName & empId
	public void printEmployeeName(String empName, int empId) {
		System.out.println("The Employee Name and ID is : "+empName+", "+empId);
	}
	//getEmployeeAddress(String empAddress) -> print address (eg: Chennai)
	private void getEmployeeAddress(String empAddress) {
		System.out.println("The Employee Address is : "+empAddress);
	}
	//printEmployeeSalary(double empSalary) -> print the empSalary
	private void printEmployeeSalary(double empSalary) {
		System.out.println("The Employee Salary is : "+empSalary);
	} 
	//printEmployeeMobileNumber(long mobNum) -> print the phoneNumber
	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println("The Employee Mobile Number is : "+mobNum);
	}
	//Call all the methods from main() and execute
	public static void main(String[] args) {
		EmployeeDetails employeeDetailObject = new EmployeeDetails();
		employeeDetailObject.printEmployeeName("rupan",1001001);
		employeeDetailObject.getEmployeeAddress("Chennai");
		employeeDetailObject.printEmployeeSalary(56000.78);
		employeeDetailObject.printEmployeeMobileNumber(989889899L);
	}
}
