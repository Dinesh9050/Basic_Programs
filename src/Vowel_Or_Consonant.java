import java.util.Scanner;

public class Vowel_Or_Consonant {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char a=in.next().charAt(0);
		if(a=='a'|| a=='e' || a=='i' || a=='o'|| a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
		{
			System.out.println("Given Charater is Vowel");
		}
		else
		{
			System.out.println("Given Character is Consonant");
		}

	}

}
