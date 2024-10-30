package Oct.ex_17102024_Condition;

import java.util.Scanner;

public class Lab067_ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Allowed to vote");

        }
        else {
            System.out.println("Not allowed to vote");
        }
    }
}