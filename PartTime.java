// File Prologue
// Programming Final
// CIT-260
// Virgina Walter & Emily Daniel 
// April 1, 2019
package java_project;

/**
 * Purpose: this class creates a part time employee object. 
 * @author Virgina Walter
 *
 */
public class PartTime extends Employee{
	public double empHourlyWage;
	public double empNumOfHours;
	//magic numbers
	final static double FOURTY = 40;
	final static double ONE_FIVE = 1.5;
	
  /**
	 * purpose: references variables in part time class
	 */
	//no-arg constructor
  /**
	 * references variables in the part-time class
	 */
	public PartTime() {
		super();
		this.empHourlyWage = 8.0;
		this.empNumOfHours = 20.0;	
	}
	
  
	//arg constructor
  /**
	 * purpose: adds arguments into part time object
	 * @param hourlyWage : double
	 * @param numOfHours : double
	 */
	public PartTime(double employeeID, String firstName, String lastName, String empDepartment, int empAddress, double hourlyWage, double numOfHours) {
		super(employeeID, firstName, lastName, empDepartment, empAddress);
		empHourlyWage = hourlyWage;
		empNumOfHours = numOfHours;
	}
	//@author Virgina Walter
	
  	/**
	 * purpose: gets employee hourly wage
	 * @return empHourlyWage
	 */
	public double getHourlyWage() {
		return empHourlyWage;
	}
	//@author Virgina Walter

  
  /**
	 * purpose: sets hourly wage for inputs other than defaults
	 * @param hourlyWage : double
	 */
	public void setHourlyWage (double hourlyWage) {
		empHourlyWage = hourlyWage;
	}
	//@author Virgina Walter

	
  /**
	 * purpose: gets employee number of hours
	 * @return empNumOfHours
	 */
	public double getNumOfHours() {
		return empNumOfHours;
	}
	//@author Virgina Walter
  
  /**
	 * purpose: sets employee number of hours for inputs other than defaults
	 * @param numOfHours : double
	 */
	public void setNumOfHours(double numOfHours) {
		empNumOfHours = numOfHours;
	}
	//@author Virgina Walter

	
	//calculate earnings & overtime 
	 /* Purpose: This method is to calculate earnings & overtime 
	 * @param void
	 * @returns: ID, first, last, department, address 
	 */
	public double earnings() {
		if (getNumOfHours() <= FOURTY )
			return getHourlyWage() * getNumOfHours();
		else 
			return FOURTY * getHourlyWage() + (getNumOfHours()-FOURTY)* getHourlyWage()* ONE_FIVE;
	}
	//@author Emily Daniel
	
	@Override 
	public String toString() {
		return "Part time employee:" + super.toString() + "hourly wage" + getHourlyWage() + "hours worked" + getNumOfHours() + "total earnings" +
	earnings();
	}
	//@author Emily Daniel

	
}