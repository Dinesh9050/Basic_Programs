import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class LargestThree {
	public static void main(String[] args) {
		ArrayList<Integer> x=new ArrayList<>();
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
	    x.add(a);
	    x.add(b);
	    x.add(c);
	    System.out.println("Largest of three Numbers is "+Collections.max(x));

	}

}
