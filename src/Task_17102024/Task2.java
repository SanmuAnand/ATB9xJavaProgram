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
        //Logic building
        //step1
        //find the inputs /outputs
        //input |side1 and side2 and side 3->(0-100)data type - double /int
        //outptut string |Equilateral\isosceles\triangle
  if (side1<=0|| side2<=0 ||side3<=0){
      System.out.println("not a valid");
  }
       else if (side1 == side2 && side1==side3 && side2==side3 ){
            System.out.println("this is Equilateral triangle");
        }
        else if (side1 == side2 |side1 ==side3 ||side2==side3){
            System.out.println("this is isosceles");
        }
        else  {
            System.out.println("this is scalene triangle");
        }
    }
}
