package TheEleventh.poly.demo9;

public class PolyDemo09 {
    public static void main(String[] args) {
        //使用多态的方式创建对象
        Animal cat = new Cat("Tom",2);

        //向下转型
        if (cat instanceof  Cat){
            Cat c = (Cat)cat;
            //使用多态的对象调用方法
            c.catchMouse();
        } else {
            System.out.println("对象cat在内存中不是Cat类型");
        }


    }
}
