import java.util.Scanner;

public class Adding_BinaryStrings {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    System.out.println("Enter Value 1 ");
		String a=in.next();
		System.out.println("Enter Value 2 ");
		String b=in.next();
		int m=Integer.parseInt(a,2);
		int n=Integer.parseInt(b,2);
		int result=m+n;
		String finall=Integer.toBinaryString(result);
		System.out.println(finall);
		
		

	}

}
