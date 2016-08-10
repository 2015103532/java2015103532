import java.util.Scanner;
public class Sales {

	public static void main(String[] args) {
		int i, a[]=new int[9],employee,grossSalary;
		for(i=0;i<9;i++)
		{
			a[i]=0;
		}
		Scanner in=new Scanner(System.in);
System.out.println("enter the no of employees");
employee=in.nextInt();
for(i=0;i<employee;i++)
{
	System.out.println("enetr the gross salaries");
	grossSalary=in.nextInt();
	grossSalary=(int)((grossSalary*9)/100)+200;
	switch(grossSalary/100)
	{
	case 2:
		a[0]++;
		break;
	case 3:
		a[1]++;
		break;
	case 4:
		a[2]++;
		break;
	case 5:
		a[3]++;
		break;
	case 6:
		a[4]++;
		break;
	case 7:
		a[5]++;
		break;
	case 8:
		a[6]++;
		break;
	case 9:
		a[7]++;
		break;
	default:
		a[8]++;
		break;
	}
	}
   System.out.println("employess in the salary ranges are");
   System.out.println("$200-299: "+a[0]);
   System.out.println("$300-399: "+a[1]);
   System.out.println("$400-499: "+a[2]);
   System.out.println("$500-599: "+a[3]);
   System.out.println("$600-699: "+a[4]);
   System.out.println("$700-799: "+a[5]);
   System.out.println("$800-899: "+a[6]);
   System.out.println("$900-999: "+a[7]);
   System.out.println("$1000 and over: "+a[8]);
	}

}