package Task_15102024;

public class Task3 {
    public static void main(String[] args) {
        int a = 20;

        System.out.println(--a + a++ + a--);
        System.out.println(a);
        // pre A = --a ->19 a= 19
        //post B= a++ ->19  a= 20
        //post C= a-- -> 20 ,a= 19
    }
}
