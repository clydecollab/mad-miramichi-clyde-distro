import java.util.Scanner;

public class HelloWorldConditional {

	public static void main(String[] args) {
		System.out.println("How many exclamation marks would you like?");
		System.out.print("Enter a value between 1 and 4: ");

		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		
		if(marks==1) {
			System.out.println("Hello World!");
		} else if (marks==2) {
			System.out.println("Hello World!!");
		} else if (marks==3) {
			System.out.println("Hello World!!!");
		} else {
			System.out.println("Hello World!!!!");
		} 
	}
	
}
