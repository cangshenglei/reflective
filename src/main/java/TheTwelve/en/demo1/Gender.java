package TheTwelve.en.demo1;

public class Gender {
    private static Gender boy;
    private static Gender gril;


    private String name;
    private int age;

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

    private Gender () {}

    public Gender(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Gender getBoy(){
        if (boy == null){
            Gender boy = new Gender("李雷",18);
        }
        return boy;
    }

    public static Gender getGril(){
        if (gril == null){
            Gender girl = new Gender("韩梅梅",18);
        }
        return gril;
    }

}
