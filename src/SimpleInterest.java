import java.util.Scanner;

public class SimpleInterest {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Principal Amount ");
		int p=in.nextInt();
		System.out.println("Enter No of Years ");
	    int n=in.nextInt();
	    System.out.println("Enter rate of Interest ");
	    int r=in.nextInt();
	    float result=(p*n*r)/100;
	    System.out.print(result);

	}

}
