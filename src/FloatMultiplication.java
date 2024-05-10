import java.util.Scanner;

public class FloatMultiplication {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Digit1 ");
		float a=in.nextFloat();
		System.out.print("Enter Digit2 ");
		float b=in.nextFloat();
		float c=a*b;
		System.out.println("Multiplication of two float Numbers is "+c);

	}

}
