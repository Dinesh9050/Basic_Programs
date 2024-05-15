import java.util.Scanner;

public class Neon_Number {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int rem;
		int sum=0;
		int Original=a;
		int sqrt=a*a;
		while(sqrt!=0)
		{
			rem=sqrt%10;
			sqrt=sqrt/10;
			sum=sum+rem;
		}
		System.out.println(sum);
		if(sum==Original)
		{
			System.out.println("Given Number is Neon Number");
		}
		else
		{
			System.out.println("Given Number is Not a Neon Number");
		}
	}
}
