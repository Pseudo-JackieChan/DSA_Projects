package com.hansin;

public class jaw {
	public static void main(String[] args) {
		//write program for kaun banega crorepati
		int score = 0;
		int questionNumber = 1;
		int totalQuestions = 10;
		String[] questions = { "What is the capital of France?", "Who wrote 'To Kill a Mockingbird'?",
				"What is the largest planet in our solar system?", "Who painted the Mona Lisa?",
				"What is the chemical symbol for gold?", "Who discovered penicillin?",
				"What is the longest river in the world?", "Who was the first person to walk on the moon?",
				"What is the currency of Japan?", "Who wrote '1984'?" };
		String[] answers = { "Paris", "Harper Lee", "Jupiter", "Leonardo da Vinci", "Au", "Alexander Fleming",
				"Nile", "Neil Armstrong", "Yen", "George Orwell" };
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		while (questionNumber <= totalQuestions) {
			System.out.println("Question " + questionNumber + ": " + questions[questionNumber - 1]);
			System.out.print("Your answer: ");
			String userAnswer = scanner.nextLine();

			if (userAnswer.equalsIgnoreCase(answers[questionNumber - 1])) {
				score += 10; // Increment score by 10 for each correct answer
				System.out.println("Correct! Your score is now: " + score);
			} else {
				System.out.println("Incorrect! The correct answer was: " + answers[questionNumber - 1]);
			}

			questionNumber++;
			if (questionNumber > totalQuestions) {
				System.out.println("Game Over! Your final score is: " + score);
				break;
			}
			System.out.println("Press Enter to continue to the next question...");
			scanner.nextLine(); // Wait for user to press Enter
			
		}
		
	}

}
