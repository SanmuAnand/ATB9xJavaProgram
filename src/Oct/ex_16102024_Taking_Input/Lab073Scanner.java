package Oct.ex_16102024_Taking_Input;

import java.util.Scanner;

public class Lab073Scanner {
    public static void main(String[] args) {
        //Scanner class
        int a=20;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();
      //float age = scanner.nextFloat();
        System.out.println(age>25? "allowed to goa": "not allowed to goa");



    }
}
