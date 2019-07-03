// File Prologue
// Programming Final
// CIT-260
// Emily Daniel
// April 1, 2019
/*This program prints a paystub based on employee status. The employees’ status are part-time and full-time. Full-time employees will  receive a fixed weekly amount regardless of hours worked and part time employees will be paid hourly. Hourly employees receive 1.5 times their hourly wage for every hour over 40. Full-time employees receive benefits and pay into Health care accounts before taxes. For this pay period, salaried employees receive a commission of 10% of their base salaries.  */
package java_project;

public class Employee {
	private double employeeID;
	private String firstName;
	private String lastName;
	private String empDepartment;
	private int empAddress;
	//@author Emily Daniel

	//arg constructor 
	public Employee() {
	}
	//@author Emily Daniel

	//constructor
	/* The arg-constructor
	 * Purpose: This method assigns certain variables  
	 * @param void
	 * @returns: ID, first, last, department, address 
	 */
	public Employee(double ID, String first, String last, String department, int address) {
		employeeID = ID; 
		firstName = first;
		lastName = last;
		empDepartment = department;
		empAddress = address;
	}
	//@author Emily Daniel

	
	//sets employeeID,
	/* set employeeID
	 * Purpose: This method sets the employeeID  
	 * @param void, double
	 * @returns: ID
	 */
	public void setEmployeeID ( double ID ) {
		employeeID = ID;
	}
	//@author Emily Daniel

	
	//gets employeeID 
	/* get employeeID
	 * Purpose: This method gets the employeeID  
	 * @param double
	 * @returns: employeeID
	 */
	public double getEmployeeID() {
		return employeeID;
	}
	
	//sets firstName
	/* set firstName
	 * Purpose: This method sets the firstName  
	 * @param void, String
	 * @returns: first
	 */
	public void setFirstName( String first) {
		firstName = first;
	}
	//@author Emily Daniel

	
	//gets firstName 
	/* get firstName
	 * Purpose: This method gets the firstName  
	 * @param String
	 * @returns: firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	//@author Emily Daniel

	
	//sets lastName
	/* set lastName
	 * Purpose: This method sets the lastName  
	 * @param void
	 * @returns: last
	 */
	public void setLastName( String last) {
		lastName = last;
	}
	//@author Emily Daniel

	
	//gets lastName 
	/* get lastName
	 * Purpose: This method gets the lastName  
	 * @param String
	 * @returns: lastName
	 */
	public String getLastName() {
		return lastName;
	}
	//@author Emily Daniel


	//sets empDepartment
	/* set empDepartment
	 * Purpose: This method sets the empDepartment  
	 * @param void
	 * @returns: department
	 */
	public void setEmpDepartment( String department) {
		empDepartment = department;
	}
	//@author Emily Daniel

	
	//gets empDepartment 
	/* get empDepartment
	 * Purpose: This method sets the empDepartment  
	 * @param String
	 * @returns: address
	 */
	public String getEmpDepartment() {
		return empDepartment;
	}
	//@author Emily Daniel

	
	//sets empAddress
	/* set empAddress
	 * Purpose: This method sets the empAddress  
	 * @param void, int
	 * @returns: address
	 */
	public void setEmpAddress( int address) {
		empAddress = address;
	}
	//@author Emily Daniel

		
	//gets empAddress 
	/* get empAddress
	 * Purpose: This method gets the empAddress  
	 * @param int
	 * @returns: empAddress
	 */
	public int getEmpAddress() {
		return empAddress;
	}
	//@author Emily Daniel

	
	//returns the formated version of the paystub
	/* formats paystub
	 * Purpose: This method formats the paystub 
	 * @param String
	 * @returns: getEmployeeID, getFirstName, getLastName, getEmpDepartment, getEmpAddress
	 */
	@Override
	public String toString() {
		return getEmployeeID() + getFirstName() + getLastName() + getEmpDepartment() + getEmpAddress(); 
	}
	//@author Emily Daniel


}
