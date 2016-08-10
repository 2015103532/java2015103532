package employeeclass;

		import java.util.Scanner;
		 
		public class EmployeeTest {
		    public static void main(String[] args) {
		         
		        Employee e1 = new Employee();
		        Employee e2 = new Employee();
		 
		    Scanner input = new Scanner(System.in);
		         
		        String f;
		        String l;
		        double monthlySalary;
		 
		        
		         
		        System.out.print("Enter the  First Name of the emplloyeeeee 1: ");
		        f = input.next();
		        e1.setFirstName(f);
		        e1.getFirstName();
		        System.out.print("Enter the  Last Name of the employeeee 1: ");
		        l = input.next();
		        e1.setLastName(l);
		        e1.getLastName();
		        System.out.print("Enter Monthly Salary of emplloyee 1: ");
		        monthlySalary = input.nextDouble();
		        if (monthlySalary > 0)
		            e1.setmonthlySalary(monthlySalary);
		        e1.getmonthlySalary();
		 
		        System.out.println();
		 
		       
		 
		        System.out.print("Enter First Name of employee 2: ");
		        f = input.next();
		        e2.setFirstName(f);
		        e2.getFirstName();
		        System.out.print("Enter Last Name of emplloyee 2: ");
		        l = input.next();
		        e2.setLastName(l);
		        e2.getLastName();
		        System.out.print("Enter Monthly Salary of employee 2: ");
		        monthlySalary = input.nextDouble();
		        if (monthlySalary > 0) 
		            e2.setmonthlySalary(monthlySalary);
		        e2.getmonthlySalary();
		 
		        System.out.println();
		 
		        e1.yearlySalary();
		        e2.yearlySalary();
		        
		        e1.displayYearlySalary();
		 
		        System.out.println();
		 
		        e2.displayYearlySalary();
		 
		        System.out.println();
		 
		        e1.yearlySalaryIncrease();
		        e2.yearlySalaryIncrease();
		 
		        System.out.println("the salaries of the 2 employeees after 10%incrementation is :");
		 
		        e1.displayYearlySalaryIncrease();
		 
		        System.out.println();
		 
		        e2.displayYearlySalaryIncrease();
		 
		    }
		

	}


