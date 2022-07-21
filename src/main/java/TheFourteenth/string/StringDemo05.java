package TheFourteenth.string;

import java.util.Arrays;

public class StringDemo05 {
    public static void main(String[] args) {
        String str1 = "abc@def@g";
        System.out.println(Arrays.toString(str1.split("@")));

        String str2 = "abc@@def@g";
        System.out.println(Arrays.toString(str2.split("@")));

        String str3 = "@@abc@@def@g";
        System.out.println(Arrays.toString(str3.split("@")));

        String str4 = "abc@def@g@@";
        System.out.println(Arrays.toString(str4.split("@")));

        String str5="ifghgi222837";
        System.out.println(Arrays.toString(str5.split("2",2)));
    }
}
