package TheFourteenth.integer;

public class IntegerDemo06 {
    public static void main(String[] args) {

        int num01 = 987;
        int num02 = 987;
        System.out.println(num01 == num02);

        Integer num03 = new Integer(765);
        Integer num04 = new Integer(765);
        System.out.println(num03 == num04);


        Integer num05 = new Integer("543");
        Integer num06 = new Integer("543");
        System.out.println(num05 == num06);

        Integer num07 = 321;
        Integer num08 = 321;
        System.out.println(num07 == num08);

        Integer num09 = 123;
        Integer num10 = 123;
        System.out.println(num09 == num10);


        System.out.println("============================");


        Integer num11 = 200;
        int num12 = 200;
        System.out.println(num11 == num12);//一切从简
        System.out.println(num12 == num11);
    }

}


/*
        true
        false
        false
        false
        true
        ============================
        true
        true*/
