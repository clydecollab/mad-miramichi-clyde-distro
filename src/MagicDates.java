import java.util.Scanner;

public class MagicDates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the current day (1-31): ");
		int date = sc.nextInt();
		System.out.print("Enter the current month (1-12): ");
		int month = sc.nextInt();
		System.out.print("Enter the current two-digit year (00-99): ");
		int year = sc.nextInt();
		
		if(date*month==year) {
			System.out.println("That's a magic date!");
		} else {
			System.out.println("Sorry, that's not a magic date. :(");
		} 
	}
	
}
