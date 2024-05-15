import java.util.Scanner;

public class Largest_of_three_numbers {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int result=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println("Largest of three Numbers is "+result);
	}

}
