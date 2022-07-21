package Thesixth;

/**
 * @ClassName ArrayDemo07
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年02月19日 10时09分
 * @Version 1.0
 *
 * 数组的排序:
 *      含义:将数组中的元素按照一定的规则进行排序
 *      分类:
 *          冒泡排序
 *          选择排序
 *          插入排序
 *          归并排序
 *          快速排序
 *          堆排序
 *          希尔排序
 *          ......
 *
 * 冒泡排序:其实就是求最大值排序
 *      原理:比较两个相邻的元素,将两个元素中较大的元素交换到右侧
 *      分析:
 *          考虑遍历一次无法将数组中元素进行排序好,所有进行多次遍历,选择循环嵌套格式
 *          外层循环的循环变量控制的是"求几次最大值"
 *          内层循环的循环变量控制的是"求一次最大值需要进行几次排序"
 *
 */

public class Bubble {
    public static void main(String[] args) {
//声明并初始化数组
        int[] arr = {5, 4, 6, 8, 3, 0, 1, 2, 7, 9};

        System.out.print("排序前:[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        //进行数组的排序

		/*
			当进行第1轮遍历时:需要进行10-1次判断;
			当进行第2轮遍历时:需要进行10-2次判断;
			当进行第3轮遍历时:需要进行10-3次判断;
			当进行第4轮遍历时:需要进行10-4次判断;
			当进行第5轮遍历时:需要进行10-5次判断;
			当进行第6轮遍历时:需要进行10-6次判断;
			当进行第7轮遍历时:需要进行10-7次判断;
			当进行第8轮遍历时:需要进行10-8次判断;
			当进行第9轮遍历时:需要进行10-9次判断;
		*/
          int count =0;
          int count1 = 0;
        //外层循环:求几次最大值
        for (int i = 1; i < arr.length; i++) {
            //内层循环:求一次最大值需要多少次循环
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
                count++;
            }
                count1++;
        }
        System.out.print("排序后:[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }

        }
        System.out.println("内循环"+count+"外循环"+ count1);
        }
    }