import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("===== QUIZ APPLICATION =====");

        System.out.println("\n1. What is the size of int in Java?");
        System.out.println("a) 2 bytes");
        System.out.println("b) 4 bytes");
        System.out.println("c) 8 bytes");
        System.out.print("Your answer: ");
        char ans1 = sc.next().charAt(0);

        if (ans1 == 'b' || ans1 == 'B') score++;

        System.out.println("\n2. Which keyword is used to inherit a class?");
        System.out.println("a) implements");
        System.out.println("b) inherits");
        System.out.println("c) extends");
        System.out.print("Your answer: ");
        char ans2 = sc.next().charAt(0);

        if (ans2 == 'c' || ans2 == 'C') score++;

        System.out.println("\n3. Which method is the entry point of Java program?");
        System.out.println("a) start()");
        System.out.println("b) main()");
        System.out.println("c) run()");
        System.out.print("Your answer: ");
        char ans3 = sc.next().charAt(0);

        if (ans3 == 'b' || ans3 == 'B') score++;

        System.out.println("\n4. Which of these is not an OOP concept?");
        System.out.println("a) Inheritance");
        System.out.println("b) Polymorphism");
        System.out.println("c) Compilation");
        System.out.print("Your answer: ");
        char ans4 = sc.next().charAt(0);

        if (ans4 == 'c' || ans4 == 'C') score++;

        System.out.println("\n5. Which collection does not allow duplicates?");
        System.out.println("a) List");
        System.out.println("b) Set");
        System.out.println("c) Map");
        System.out.print("Your answer: ");
        char ans5 = sc.next().charAt(0);

        if (ans5 == 'b' || ans5 == 'B') score++;

        System.out.println("\n===== QUIZ RESULT =====");
        System.out.println("Total Questions: 5");
        System.out.println("Correct Answers: " + score);
        System.out.println("Score: " + score + "/5");

        sc.close();
    }
}
