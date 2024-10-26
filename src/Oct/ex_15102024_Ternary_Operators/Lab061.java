package Oct.ex_15102024_Ternary_Operators;

public class Lab061 {
    public static void main(String[] args) {
        int age=13;
        String result = age >18? "Allowed to vote ": "Not allowed to vote";
        System.out.println(result);
       // this also possible
        //System.out.println(age >18? "Allowed to vote ": "Not allowed to vote");

    }
}
