package Oct.ex_18102024_IfconditionSwitch;

public class Lab080 {
    public static void main(String[] args) {
        int itemcode=001;
        switch(itemcode) {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            case 004 -> System.out.println("004");
            default -> System.out.println("default");
        }
    }
}
