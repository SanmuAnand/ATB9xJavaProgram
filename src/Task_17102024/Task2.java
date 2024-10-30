package Task_17102024;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Side1");
        int  side1= sc.nextInt();

        System.out.println("Enter the Side1");
        int  side2= sc.nextInt();

        System.out.println("Enter the Side1");
        int  side3= sc.nextInt();

        if (side1 == side2 && side2==side3 && side3==side1 ){
            System.out.println("this is Equilateral triangle");
        }
        else if ((side1 == side2 )&&(side2 != side3) ||(side1 != side2)&&(side2 == side3)) {
            System.out.println("this is isosceles");
        }
        else  {
            System.out.println("this is scalene triangle");
        }
    }
}
