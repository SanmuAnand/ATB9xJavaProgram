package Task_17102024;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // ✅ Grade Calculator:
// Write a program that calculates and displays the letter grade
// for a given numerical score (e.g., A, B, C, D, or F)
// based on the following grading scale:
//
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int score = sc.nextInt();

      if (score >= 90 && score <= 100) {
          System.out.println("Grade A" );
      }

      else if (score >= 80 && score <= 89) {
          System.out.println("Grade B");
      }

      else if (score >= 70 && score <= 79) {
          System.out.println("Grade C");
      }
      else if (score >= 70 && score <= 79) {
          System.out.println("Grade D");
      }

      else {
          System.out.println("Grade F");
      }
      sc.close();
    }
}
