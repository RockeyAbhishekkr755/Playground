import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		// Get the input from the user
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		// Compare two numbers
		if(num1>num2)
		{
		    System.out.println("num1 is the greatest number");
		}
		else
        {
		    System.out.println("num2 is the greatest number");
		}
	}
}