package TheEighth.knowledege.demo5;

/**
 * @ClassName ArrayUtils
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月22日 10时02分
 * @Version 1.0
 *
 * 数组工具类
 */
public class ArrayUtils {
    //打印数组
    //排序数组
    //反转数组
    //求和
    //求最大值
    //求最小值
    //........


    private ArrayUtils() {
    }

    public void printArr (int[] arr) {
        if (arr == null ) {
            return;
        }

        if (arr.length == 0) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    public static void print (int[] arr) {
        if (arr == null ) {
            return;
        }

        if (arr.length == 0) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
