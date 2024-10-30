package Oct.ex_17102024_Condition;

import java.util.Scanner;

public class Lab066_if {
    public static void main(String[] args) {
        // int age = 25;
        // or
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Allowed to vote");
        }
    }
}
