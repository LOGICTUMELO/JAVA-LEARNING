import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Quiz Menu:");
            System.out.println("1. Start Quiz");
            System.out.println("2. View Score");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");

            int choice = getValidIntInput(scanner, 1, 3);

            switch (choice) {
                case 1:
                    startQuiz(scanner);
                    break;
                case 2:
                    viewScore();
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting the program. Goodbye!");
                    break;
            }
        }

        scanner.close();
    }

    private static int score = 0;

    private static void startQuiz(Scanner scanner) {
        String[] questions = {
                "What is the capital of France?",
                "What is 2 + 2?",
                "What is the largest planet in our solar system?"
        };
        String[][] options = {
                {"1. Paris", "2. London", "3. Rome", "4. Berlin"},
                {"1. 3", "2. 4", "3. 5", "4. 6"},
                {"1. Earth", "2. Mars", "3. Jupiter", "4. Saturn"}
        };
        int[] answers = {1, 2, 3};

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer (1-4): ");
            int userAnswer = getValidIntInput(scanner, 1, 4);

            if (userAnswer == answers[i]) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect.");
            }
        }
    }

    private static void viewScore() {
        System.out.println("Your current score is: " + score);
    }

    private static int getValidIntInput(Scanner scanner, int min, int max) {
        int input;
        while (true) {
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= min && input <= max) {
                    return input;
                } else {
                    System.out.printf("Invalid input. Please enter a number between %d and %d: ", min, max);
                }
            } else {
                System.out.printf("Invalid input. Please enter a number between %d and %d: ", min, max);
                scanner.next(); // Clear the invalid input
            }
        }
    }
}
