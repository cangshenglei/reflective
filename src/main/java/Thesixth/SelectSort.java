package Thesixth;

public class SelectSort {
        /**
         * 选择排序（Selection sort）是一种简单直观的排序算法。它的工作原理是：第一次从待排序的数据元素中选出最小（或最大）的一个元素，
         * 存放在序列的起始位置，然后再从剩余的未排序元素中寻找到最小（大）元素，然后放到已排序的序列的末尾。
         * 以此类推，直到全部待排序的数据元素的个数为零。选择排序是不稳定的排序方法。 [1]
         *
         * */
    public static void main(String[] args) {
        //声明并初始化数组
        int[] arr={2,3,4,5,15,19,26,27,36,38,44,46,47,50,48};

        System.out.println("排序前:[");
        for(int i =0;i<arr.length;i++ ){
            if (i == arr.length-1){
                System.out.println(arr[i] + "]");
            }else {
                System.out.println(arr[i]+".");
            }
        }






        System.out.print("排序后:[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }

        }
    }
}
