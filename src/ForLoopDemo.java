import java.util.Scanner;

public class ForLoopDemo {
	//This is acomment made by clydecollab
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What's your favourite number? ");
		int number = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter your favourite word and ");
		System.out.println("I'll repeat it for you: ");
		String favWord = sc.nextLine();
		
		for (int count = 1; count <= number; count++) {
			System.out.println(count + " " + favWord);
		}
		
	}
}
