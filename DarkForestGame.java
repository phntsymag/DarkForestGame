import java.util.Scanner;

public class DarkForestGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Dark Forest!");

        // Create character instances
        Crow crow = new Crow();
        Bear bear = new Bear();
        Spider spider = new Spider();
        Eagle eagle = new Eagle();

        // Interaction with characters
        System.out.println("You encounter a crow. It speaks, 'Solve my riddle or face your doom!'");
        crow.askRiddle();
        String riddleAnswer = scanner.nextLine();
        if (crow.checkAnswer(riddleAnswer)) {
            System.out.println("Correct answer! The crow is pleased.");
        } else {
            System.out.println("Wrong answer! The crow gets angry and attacks you. Game over!");
            return;
        }

        System.out.println("You stumble upon a bear. It growls, 'Fetch me some honey or meet your end!'");
        bear.askTask();
        String honey = scanner.nextLine();
        if (bear.checkTask(honey)) {
            System.out.println("Well done! The bear is satisfied.");
        } else {
            System.out.println("You failed the task! The bear attacks you. Game over!");
            return;
        }

        System.out.println("A big spider appears in front of you. It hisses, 'Answer my question or face your demise!'");
        spider.askQuestion();
        String answer = scanner.nextLine();
        if (spider.checkAnswer(answer)) {
            System.out.println("Great job! The spider retreats into its web.");
        } else {
            System.out.println("Incorrect answer! The spider captures you. Game over!");
            return;
        }

        System.out.println("An eagle swoops down from above. It screeches, 'Prove your worth or become my meal!'");
        eagle.presentChallenge();
        String challengeSolution = scanner.nextLine();
        if (eagle.validateChallenge(challengeSolution)) {
            System.out.println("You've successfully completed the challenge. The eagle flies away.");
        } else {
            System.out.println("Challenge failed! The eagle attacks you. Game over!");
            return;
        }

        System.out.println("Congratulations! You have successfully completed all the tasks in the dark forest. You're safe now!");
    }
}

class Crow {
    void askRiddle() {
        System.out.println("I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?");
    }

    boolean checkAnswer(String answer) {
        return answer.equalsIgnoreCase("echo");
    }
}

class Bear {
    void askTask() {
        System.out.println("Bring me a jar of honey. What will you do?");
    }

    boolean checkTask(String honey) {
        return honey.equalsIgnoreCase("honey");
    }
}

class Spider {
    void askQuestion() {
        System.out.println("What has a heart that doesn't beat?");
    }

    boolean checkAnswer(String answer) {
        return answer.equalsIgnoreCase("artichoke");
    }
}

class Eagle {
    void presentChallenge() {
        System.out.println("Solve this math problem: 2 + 2 * 2 = ?");
    }

    boolean validateChallenge(String solution) {
        return solution.equals("6");
    }
}
