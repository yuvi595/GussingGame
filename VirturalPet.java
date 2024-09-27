package gussingGames;

import java.util.Scanner;

public class VirturalPet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] moods = { "happy", "sad", "hungry", "playful" };
		String[] gifts = { "a toy", "a hug", "food", "a ball" };

		int randomIndex = (int) (Math.random() * moods.length);
		String petMood = moods[randomIndex];

		System.out.println("Welcome to the Virtual Pet Mood Guesser! ");
		System.out.println("Can you guess how your pet is feeling? ");

		int attempts = 0;
		String guess;

		do {
			System.out.println("Enter your guess (happy, sad, hungry, playful): ");
			guess = scanner.nextLine().toLowerCase();
			attempts++;
			chooseFile
			if (guess.equals(petMood)) {
				System.out.println("You guessed it! Your pet is " + petMood + "!");
				System.out.println("It took you " + attempts + "attempts to guess correctly.");

				System.out.println("\nNow, choose a gift for your pet:");
				System.out.println("1. A toy");
				System.out.println("2. A hug");
				System.out.println("3. Food");
				System.out.println("4. a ball");
				System.out.print("Enter the number of the gift ou want to give: ");
				int giftChoice = scanner.nextInt() - 1;
				scanner.nextLine();

				if (giftChoice >= 0 && giftChoice < gifts.length
						&& gifts[giftChoice].equals(correctGiftforMood(petMood))) {
					System.out.println("Your pet loved the gift of " + gifts[giftChoice] + "! Your pet is very happy!");
				} else {
					System.out.println("Hmm... your pet doesn't seem to like the " + gifts[giftChoice]
							+ ". Maybe choose something more fitting next time.");
				}
			} else {

				if (petMood.equals("happy")) {
					System.out.println("Hint: Your pet is feeling cheerful!");
				} else if (petMood.equals("sad")) {
					System.out.println("Hint: Your pet seems down and could use some cheering up. ");
				} else if (petMood.equals("hungry")) {
					System.out.println("Hint: Your pet could use some food.");
				} else if (petMood.equals("playful")) {
					System.out.println("Hint: Your pet feels like playing!");
				}
			}
		} while (!guess.equals(petMood));

		scanner.close();
	}

	public static String correctGiftforMood(String mood) {
		switch (mood) {
		case "happy":
			return "a toy";
		case "sad":
			return "a hug";
		case "hungry":
			return "food";
		case "playful":
			return "a ball";
		default:
			return "";
		}
	}
}
