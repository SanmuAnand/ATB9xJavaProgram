package Oct.ex_17102024_Condition;

import java.util.Scanner;

public class Lab072if_else_if_else {
    public static void main(String[] args) {
        //condition - 2 outputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1= sc.nextInt();
        System.out.println("Enter the num2");
        int num2 =sc.nextInt();
        //num1>num2
        //2 num2>num1
        //3 both are equal num1==num2

       //
                if(num1>num2){
                    System.out.println("num1>num2");
                } else if (num2>num1) {
                    System.out.println("num2>num1");

                }
                else {
                    System.out.println("equal");
                }
    }
}
