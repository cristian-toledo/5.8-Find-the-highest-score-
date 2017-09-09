import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int highestScore = 0;
        String highestscorename = "";

        System.out.print("How many students are there?: ");
        int numberofstudents = input.nextInt();

        System.out.println("Enter each student’s name and score");
        for (int i = 0; i < numberofstudents; i++) {
            System.out.print(
                    "Student: " + (i + 1) +
                            "\n   Name: ");
            String name = input.next();
            System.out.print(
                    "   Score: ");
            int score = input.nextInt();

            if (score > highestScore)
            {
                highestScore = score;
                highestscorename = name;
            }

        }

       System.out.println("Student with the highest score: " + highestscorename);
    }
}