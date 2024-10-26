package Oct.ex_15102024_Ternary_Operators;

public class Lab062 {
    public static void main(String[] args) {
        //Nested ternary
        //Result =condition1? expression1:(condition2? expression2: expression3;
        //Grade -system -score >90 ->A
        //Grade -system -score >80 ->B
        //Grade -system -score >70 ->C
        //Grade -system -score >60 ->D
        //Grade -system -score >50 ->E
        //Grade -system -score <50 ->F

        int score = 49;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "c" : (score >= 60) ? "D" : (score >= 60) ? "E" : (score >= 50) ? "E" :"F";
        System.out.println("your Grade is ->" + grade);
        System.out.printf("Your Grade is %s", grade);

    }

}
