package gussingGames;

import java.util.Scanner;

public class FortuneTeller {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your favorite number: ");
		int favoriteNumber = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter your favorite color: ");
		String favoriteColor = scanner.nextLine();

		System.out.print("Enter your mood (eg: happy, sad, excited): ");
		String mood = scanner.nextLine();

		int randomFortune = (favoriteNumber % 3) + 1;

		String fortune = "";
		if (randomFortune == 1) {
			fortune = "With your favorite color being" + favoriteColor + ", today will bring you great joy!";

		} else if (randomFortune == 2) {
			fortune = "Your mood of " + mood + " means you might face a little challenge, but you'll overcome it!";
			
		} else {
			fortune = "the number " + favoriteNumber + " suggests that luck is on your side today! ";
		
		}

		System.out.println("\nYour fortune: " + fortune);

		scanner.close();

	}
}
