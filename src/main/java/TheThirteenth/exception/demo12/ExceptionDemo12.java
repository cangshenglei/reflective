package TheThirteenth.exception.demo12;

public class ExceptionDemo12 {
    public static void main(String[] args) throws SubException {
        //throw new SubRuntimeException("自定义运行时异常类对象");

      throw new SubException("自定义编译时异常类对象");
    }
}
