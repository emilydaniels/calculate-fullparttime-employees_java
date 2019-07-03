// File Prologue
// Programming Final
// CIT-260
// Virgina Walter & Emily Daniel
// April 1, 2019
package java_project; 

/**
 * purpose: creates full time employee object. 
 */
public class FullTime extends Employee {
	public boolean empBenefits;
	public double empSalary;
	public double empCommission;
	//magic number
	final static double TEN_PERCENT = 1.1;
	// Virgina Walter
	
	
	//no-arg constructor
  /**
	 * purpose: references variables in full time class
	 */
	public FullTime() {
		super();
		this.empBenefits = true;
		this.empSalary = 20000.0;
		this.empCommission = 5.0;
	}
	// Virgina Walter

	
	//arg constructor
  /**
	 * purpose: adds arguments into the full-time object
	 * @param benefits, double
	 * @param salary
	 * @param commission
	 */
	public FullTime(double employeeID, String firstName, String lastName, String empDepartment, int empAddress, boolean benefits, double salary, double commission) {
		super(employeeID, firstName, lastName, empDepartment, empAddress);
		empBenefits = benefits;
		empSalary = salary;
		empCommission = commission;
	}
	// Virgina Walter

	
  //gets employee Benefits
	/**
	 * @return empBenefits
	 */
	public boolean getBenefits() {
		return empBenefits;
	}
	// Virgina Walter

  
  /**
	 * purpose: sets employee benefits for inputs other than defaults
	 * @param benefits : double
	 */
	public void setBenefits(boolean benefits) {
		empBenefits = benefits;
	}
	// Virgina Walter

	
  /**
	 * purpose: gets employee Salary
	 * @return empSalary
	 */
	public double getSalary() {
		return empSalary;
	}
	// Virgina Walter

  
  /**
	 * purpose: sets employee salary for inputs other than defaults
	 * @param salary : double
	 */
	public void setSalary(double salary) {
		empSalary = salary;
	}	
	// Virgina Walter

  
  	/**
	 * gets employee commission
	 * @return empCommission
	 */
	public double getCommission() {
		return empCommission;
	}
	// Virgina Walter

  
  /**
	 * purpose: sets employee commission for inputs other than defaults
	 * @param commission : double
	 */
	public void setCommission(double commission) {
		empCommission = commission;
	}
	
	//computes commission
	 /*
		 * purpose: calculates the commission 
		 * @param double
		 * @return: commission
		 */
	public double commission() {
		return getSalary()*TEN_PERCENT;
	}
	//Emily Daniel
	
	@Override
	public String toString() {
		return "Full time employee:" + super.toString() + "salary" + getSalary() + "commission" + getCommission()
		+ "total earnings" + commission();
	}
	//Emily Daniel
	
}