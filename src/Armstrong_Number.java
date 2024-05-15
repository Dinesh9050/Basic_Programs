import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int copy_Digit=a;
		int rem;
		int sum=0;
		while(a!=0)
		{
			rem=a%10;
			a=a/10;
			sum=(int) (sum+Math.pow(rem, 3));
		}
		System.out.println("Result is "+sum);
		if(copy_Digit==sum)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not a Armstrong Number ");
		}

	}

}
