package Quiz;


import java.util.Scanner;

public class Onlinequiz {

    static String[] questions = {
            "1. What is the capital of India?",
            "2. Which language is used for Java programming?",
            "3. Which keyword is used to create an object in Java?",
            "4. What is the size of int in Java?",
            "5. Which company developed Java?"
    };

    static String[][] options = {
            {"A. Mumbai", "B. Delhi", "C. Chennai", "D. Kolkata"},
            {"A. Python", "B. C++", "C. Java", "D. HTML"},
            {"A. class", "B. new", "C. object", "D. this"},
            {"A. 2 bytes", "B. 4 bytes", "C. 8 bytes", "D. 16 bytes"},
            {"A. Microsoft", "B. Apple", "C. Sun Microsystems", "D. Google"}
    };

    static char[] answers = {'B', 'C', 'B', 'B', 'C'};

    static int score = 0;

    static void startQuiz() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = Character.toUpperCase(sc.next().charAt(0));

            if (userAnswer == answers[i]) {
                System.out.println("Correct Answer!");
                score++;
            } else {
                System.out.println("Wrong Answer!");
                System.out.println("Correct Answer: " + answers[i]);
            }
        }

        displayResult();
        sc.close();
    }

    static void displayResult() {
        System.out.println("\n===== QUIZ RESULT =====");
        System.out.println("Total Questions: " + questions.length);
        System.out.println("Correct Answers: " + score);
        System.out.println("Wrong Answers: " + (questions.length - score));
        System.out.println("Score: " + score + "/" + questions.length);

        double percentage = (score * 100.0) / questions.length;
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 60) {
            System.out.println("Grade: B");
        } else if (percentage >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }

    public static void main(String[] args) {
        System.out.println("===== ONLINE QUIZ APPLICATION =====");
        startQuiz();
    }
}