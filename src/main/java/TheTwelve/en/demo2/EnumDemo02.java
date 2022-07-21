package TheTwelve.en.demo2;

public class EnumDemo02 {
    public static void main(String[] args) {
        Gender boy = Gender.BOY;
        Gender boy1 = Gender.BOY;

        Gender girl = Gender.GIRL;
        Gender girl1 = Gender.GIRL;
        System.out.println(girl==girl1);
        System.out.println(boy==boy1);
    }
}
