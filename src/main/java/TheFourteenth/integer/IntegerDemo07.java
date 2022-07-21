package TheFourteenth.integer;

public class IntegerDemo07 {
    public static final Integer num01 = 200;
    public static final Integer num02 = 200;
    public static final Integer num03 = 50;
    public static final Integer num04 = 150;
    public static final Integer num05;
    public static final Integer num06 ;
    public static final Integer num07;
    public static final Integer num08;


    static {
        num05 = 200;
        num06 = 200;
        num07 = 50;
        num08 = 150;
    }

    public static void main(String[] args) {

        System.out.println(num01 == num02);//false
        System.out.println(num01 == num05);//false
        System.out.println(num03 == num07);//true

        System.out.println("===============");

        System.out.println(num01 == (num03 + num04));//int类型和int类型比
        System.out.println(num05 == (num07 + num08));
        System.out.println((num03 + num04) == (num07 + num08));




    }



/*   false
        false
        true
        ===============
        true
        true
        true*/
}
