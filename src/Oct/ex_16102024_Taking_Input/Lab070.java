package Oct.ex_16102024_Taking_Input;

public class Lab070 {
    public static void main(String[] args) {
        //create a program to check whether anand will go to goa or not
        // Taking input age = anand -> goa
        // age > 35 ->drinking is allowed
        // Ternary operator
        //int age = 30;
        //System.out.println(age >=25 ? "Allowed to goa" :"Not allowed");
        // Arguments console
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.printf("%s, %s ",args[0],args[1]);
        int age = Integer.parseInt(args[0]);
        System.out.println(age >=25 ? "Allowed to goa" :"Not allowed");
        //int age = Integer.parseInt(args[1]);
        //System.out.println(age >=25 ? "Allowed to goa" :"Not allowed");

    }
}
