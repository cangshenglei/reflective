package TheEighth.knowledege.demo3;

public class Student {


    /**
     * @ClassName Student
     * @Description 此类用于演示功能
     * @Author Shark
     * @DateTime 2022年02月22日 09时22分
     * @Version 1.0
     */
        private int id;
        private String name;
        private int age;
        private static int num = 220222001;

        public Student(String name, int age) {
            //this.id = num++;
            this.name = name;
            this.age = age;
        }

        public Student() {
            //this.id = num++;
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

        public String print () {
            return id + "=" + name + "=" + age;
        }

        {
            this.id = num++;
        }
    }
