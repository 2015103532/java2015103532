package employeeclass;

	public class Employee {
	     
	    private String f; 
	    private String l; 
	    private double monthlySalary;
	 
	     Employee() {
	        f = "\0";
	        l = "\0";
	        monthlySalary = 0.0;
	    }
	 
	     void setFirstName(String m) {
	        f = m;
	    }
	 
	     String getFirstName() {
	        return f;
	    }
	 
	     void setLastName(String m) {
	        l = m;
	    }
	 
	    String getLastName() {
	        return l;
	    }
	 
	     void setmonthlySalary(double v) {
	        monthlySalary = v;
	    }
	 
	     double getmonthlySalary() {
	        return monthlySalary;
	    }
	 
	     double yearlySalary() {
	        double yearlySalary;
	        yearlySalary = (monthlySalary * 12);
	        return yearlySalary;
	    }
	 
	     double yearlySalaryIncrease() {
	        double yearlySalaryIncrease;
	        yearlySalaryIncrease = (((yearlySalary() * (0.1)) + yearlySalary()));
	        return yearlySalaryIncrease;
	    }
	 
	     void displayYearlySalary() {
	        System.out.printf("%s %s's the salary of this year is Salary is:rupees %f\n", f, l,
	           yearlySalary());
	    }
	 
	     void displayYearlySalaryIncrease() {
	        System.out.printf("%s %s = rupees%f\n", f, l, yearlySalaryIncrease());
	    }
	 
	}


