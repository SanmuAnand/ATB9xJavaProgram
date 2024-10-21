package Oct.ex_11102024_Operators;

public class Lab006 {
    public static void main(String[] args) {
        String first_name="Priya";
        String second_name ="Anand";
        int a=18;
        int b=10;
        System.out.println(first_name+second_name+a+b);
        //PriyaAnand1810 - first operator perform as a concatination
        System.out.println(a+b+first_name+second_name);
        //28PriyaAnand first operator is normal math
        System.out.println(first_name+second_name+(a+b));

    }
}
