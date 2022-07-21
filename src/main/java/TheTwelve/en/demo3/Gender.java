package TheTwelve.en.demo3;

public class Gender {
    private static Gender boy;
    private static Gender gril;
    private static Gender child;

    private Gender student;


    private String name;
    private int age;


    public Gender(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender() {
    }


        public static Gender g(){
            if ( child== null) {
                child = new Gender("李雷",18);
            }
            return child;
        }
    public static Gender getBoy() {
        if (boy == null) {
            boy = new Gender("李雷",18);
        }
        return boy;
    }


}
