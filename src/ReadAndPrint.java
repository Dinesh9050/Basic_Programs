import java.util.Scanner;

public class ReadAndPrint {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the Digit ");
		int a=in.nextInt();
		System.out.println("Entered Digit is "+a);
		System.out.print("Enter the Decimal Value ");
		float b=in.nextFloat();
		System.out.println("Entered Decimal Value is "+b);
		System.out.print("Enter the Double Value ");
		double c=in.nextDouble();
		System.out.println("Entered Double value is "+c);
		System.out.print("Enter the long value ");
		long d=in.nextLong();
		System.out.println("Entered Long Value is "+d);
		in.nextLine();
		System.out.print("Enter the String Value ");
		String e=in.nextLine();
		System.out.println("Entered String value is "+e);
		System.out.print("Enter the Character Value ");
	    char f=in.next().charAt(0);
	    System.out.println("Entered Character Value is "+f);
	    System.out.println("Enter the String Value(using next) ");
		String g=in.next();
		System.out.println("Entered String value is "+g);
	}

}
