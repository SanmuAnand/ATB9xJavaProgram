package OctJava.Task;

public class Task1 {
    public static void main(String[] args) {
        int x = 40;
        int y = 20;
        int z = 30;
        // Rough logic x > y ->  x : y
       // int max = x > y ? x : y;
        // String max = x > y ? "Max is -> x" : "Max is -> y";

        int max = x>y && x>z ? x:y>z ? y:z;
        System.out.println("Laterest number" +max);

    }
}
