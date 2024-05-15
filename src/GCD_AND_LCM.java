import java.util.Scanner;

public class GCD_AND_LCM {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int temp;
		System.out.println("Enter Number 1: ");
		int a=in.nextInt();
		int a1=a;
		System.out.println("Enter Number 2: ");
		int b=in.nextInt();
		int b1=b;
		while(b!=0)
		{
			temp=b;
			b=a%b;
			a=temp;
		}
		System.out.println("GCD of Given Number is " +a);
		int lcm=(a1*b1)/a;
		System.out.println("LCM of Given Number is "+lcm);

	}

}
