import java.util.Scanner;
public class Largest_of_three {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		if(a>=b && a>=c)
		{
			System.out.println(a+" is the Greater Number");
		}
		else if(b>=c && b>=a)
		{
			System.out.println(b+" is the Greater Number");
		}
		else
		{
			System.out.println(c+ " is the Greater Number");
		}
	}

}
