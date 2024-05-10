import java.util.Scanner;
public class EvenorOdd {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Digit ");
		int a=in.nextInt();
		if(a%2==0)
		{
			System.out.println("Given Number is Even");
		}
		else
		{
			System.out.println("Given Number is Odd");
		}
	}
}
