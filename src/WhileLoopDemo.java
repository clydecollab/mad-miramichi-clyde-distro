import java.util.Scanner;

public class WhileLoopDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Good numbers are less than ten.");
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		while (number<10) {
			System.out.println("That's a good number!");
			System.out.println("Enter another number: ");
			number = sc.nextInt();
		}
		
		System.out.println("That's not a good number! What's the big idea? ");
		
	}
}
