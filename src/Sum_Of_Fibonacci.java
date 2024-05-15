import java.util.Scanner;

public class Sum_Of_Fibonacci {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int a=-1;
	int b=1;
	int c;
	int sum=0;
	for(int i=1;i<=n;i++)
	{
		c=a+b;
		a=b;
		b=c;
		sum=sum+c;
		System.out.print(c+ " ");
	}
	System.out.println("Sum of Fibonacci Series is "+sum);

	}

}
