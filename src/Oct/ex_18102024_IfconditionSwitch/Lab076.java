package Oct.ex_18102024_IfconditionSwitch;

import java.util.Scanner;

import static java.lang.System.*;

public class Lab076 {
    public static void main(String[] args) {
        //switch condition
        //User enter in number from 1 to 7
        //which dat it is it
        //1 -mon 4-thur 7-sun 8- invalid
        Scanner sc = new Scanner(in);
        System.out.println("Start of the loop");
        out.println("Enter the day from (1-7)");
        int day = sc.nextInt();
        switch (day){

            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Invalid");
                break;

        }

        System.out.println("End of the loop");
      sc.close();
    }
}
