import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		System.out.println("Before Swapping "+"A value is "+a+" B value is "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping "+"A value is "+a+" B value is "+b);
		
	}

}
