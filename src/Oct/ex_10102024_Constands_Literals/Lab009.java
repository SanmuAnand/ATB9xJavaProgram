package Oct.ex_10102024_Constands_Literals;

public class Lab009 {
    public static void main(String[] args) {
        //char
        char c1='A';
        char c2='B';
        char c3= 'C';

        //Escabe char
        char new_line = '\n';
        char tab_line ='\t';
        char back_space = '\b'; // one char will delete
        char car_r ='\r'; // one word will be deleted

        System.out.println("priya"+ new_line + "perumal");
        //System.out.println("priya" + "perumal"); // not work
        System.out.println("priya"+ tab_line + "perumal");
        System.out.println("priya"+ back_space + "perumal");
        System.out.println("priya"+ car_r+ "perumal");

        char v1 = '\u1F60';
                //ASCII -> US
        // chines , india japense -> unicode

    }
}
