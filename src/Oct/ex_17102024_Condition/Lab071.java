package Oct.ex_17102024_Condition;

import java.util.Scanner;

public class Lab071 {
    public static void main(String[] args) {
        //create aprogram - take user input
        //Check whether the point input even or odd num
        //modulus  -> %
        //10%2= 0//enen
        //10%3=1// odd
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER , I WIL TELL YOU ODD OR EVEN");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("num is -> even");
        }else {
            System.out.println("num is  odd");
        }
        sc.close();
    }
}
