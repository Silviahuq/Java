package factorial;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n, factorial = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("enter any positive integer : ");
		n = input.nextInt();
		for (int i = n; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println("the factorial is : " + factorial);
	}

}