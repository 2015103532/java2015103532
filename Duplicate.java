import java.util.Scanner;
public class Duplicate {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i=0,j,k;
	
		int []a=new int[5];
		while(i<5)
		{
			
			
		System.out.println("enetr any element between 10 and 100");
		a[i]=in.nextInt();
		j=0;k=0;
		if((a[i]>=10)&&(a[i]<=100))
				{
			
		while(j<i)
		{
			if((a[j]==a[i])&&(i!=0))
			{
				k++;
				break;
			}
			else
			{
				
				j++;
				
			}
		}
		}
		else
		{
			System.out.println("enetr a valid no");
			continue;
		}
	
		if(k==0)
		{
			System.out.println("the no:"+a[i]);
		}
		i++;
		}
		
		
		
		
	
		
}
}