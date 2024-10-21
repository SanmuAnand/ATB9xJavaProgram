package OctJava.Task;

public class Task6 {
    public static void main(String[] args) {
        int a= 30;
        int b = 9;

        //Airthmetic Operators
        System.out.println(a+ b);
        System.out.println(a- b);
        System.out.println(a% b);
        System.out.println(a/ b);
        System.out.println(a* b);
        // RELATIONAL OPERATORS : TRUE OR FALSE
        System.out.println(a==b) ;  // == COMPARISON Operator
        System.out.println(a!=b); // !=  NOT EQUAL TO operator
        System.out.println(a<=b) ; // <=  LESS THAN EQUAL TO operator
        System.out.println(a>=b) ;  // >= GREATER THAN EQUAL TO operator
        System.out.println(a>b) ;   // > GREATER operator
        System.out.println(a<b) ;  // < LESS operator

        // Assignment Operators
        //single
        System.out.println(a);
        System.out.println(b);
        // compound
        System.out.println(a+=b);
        System.out.println(a-=b) ;
        System.out.println(a*=b) ;
        System.out.println(a/=b) ;
        System.out.println(a%=b) ;

        // LOGICAL OPERATORS: AND , OR , NOT < GATE>

        System.out.println((6 > 5) || (1>5));
        System.out.println((8 > 5) && (3>5));
        System.out.println(!(10>=5));

    }

}
