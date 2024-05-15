import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int flag=0;
		int m=0;
		m=n/2;
		if(n==0 || n==1)
		{
			System.out.println("Given Number is not a Prime Number");
		}
		else
		{
			for(int i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println("Given Number is not a Prime Number");
					flag=1;
					break;
				}
				
			}
		}
		if(flag==0) {
			System.out.println("Given Number is a Prime Number");
		}

	}

}
