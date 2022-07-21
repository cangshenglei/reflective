package TheSixteenth.set.demo4;

public class Student {
    private int id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public int hashCode() {
     int result=id;
     result =31*result+(name!= null? name.hashCode():0);
     return result;
    }

    @Override
    public boolean equals(Object obj) {
       if (this == obj){
           return true;
       }
       if (obj==null|| getClass()!=obj.getClass()){
           return false;
       }
        Student student=(Student)obj;

       if (id != student.id){
           return false;
       }
       return name!=null?name.equals(student.name):student.name==null;
    }

}
