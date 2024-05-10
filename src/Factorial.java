import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int a=in.nextInt();
		int f=1;
		for(int i=1;i<=a;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial of Given Number is "+f);

	}
}
