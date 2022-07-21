package TheEleventh.fin.demo2;

public class SubClass extends SuperClass{
    public SubClass() {

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
