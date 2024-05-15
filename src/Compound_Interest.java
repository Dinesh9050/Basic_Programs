import java.util.Scanner;

public class Compound_Interest {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Principal Amount: ");
		double p=in.nextDouble();
		System.out.println("Enter Rate of Interest: ");
		float r=in.nextFloat();
		System.out.println("Enter time period: ");
		int t=in.nextInt();
		double result=p*Math.pow((1+r/100),t);
		System.out.println("Compound Interest of Given Number is:"+result);
	

	}

}
