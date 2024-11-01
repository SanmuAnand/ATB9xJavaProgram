package Oct.ex_18102024_IfconditionSwitch;

import java.util.Scanner;

public class Lab077 {
    public static void main(String[] args) {
        //web automation
        //i will as user which brower you want me to run the code
        // chorme -> ecute chrome
        //firefoc-> excute of firefox
        //edge -> edge cases
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Brower");
        String browser = sc.next();
        browser = browser.toLowerCase();// case sensitive , cover into lowercase

        switch (browser){
            case "chrome" :
                System.out.println("Starting the chrome");
                break;

            case "firefox":
            System.out.println("Starting the firefox");
            break;

            case"edge":
                System.out.println("Starting the edge");
                break;
            default:
                System.out.println("no idea");
                break;
        }

        }



    }

