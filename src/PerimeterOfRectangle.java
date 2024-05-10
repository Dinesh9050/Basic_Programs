import java.util.Scanner;

public class PerimeterOfRectangle {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Length ");
		int l=in.nextInt();
		System.out.println("Enter Breadth ");
		int b=in.nextInt();	
		int result=2*(l+b);
		System.out.println("Perimeter of Rectangle is "+result);
	}
}
