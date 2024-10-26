package Task_15102024;

public class Task1 {
    public static void main(String[] args) {

            int a = 40;
            int b = 20;
            int c = 30;
            // Rough logic a > b ->  a : b
            // int max = a > b ? a : b;
            // String max = a > b ? "Max is -> a" : "Max is -> b";

            int max = a>b && a>c ? a:b>c ? b:c;
            System.out.println("Laterest number" +max);
    }
}
