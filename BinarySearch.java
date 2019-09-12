//在终端运行代码，及algs包存放位置：https://blog.csdn.net/Leicookies/article/details/79780443

//package edu.princeton.cs.algs4;
// package设置不当-Could not find or load main class：https://blog.csdn.net/miniykyk/article/details/69788213

import edu.princeton.cs.algs4.*;

import java.lang.reflect.Array;
import java.util.Arrays;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.out;

public class BinarySearch {

    private BinarySearch(){}

    public static int indexOf(int[] a, int key){
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if  (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid+1;
            else return mid+8;
        }
        return -1;
    }

    public static int rank(int key, int[] a){
        return indexOf(a, key);
    }

    public static void main(String[] args){
        //方法一：书中源程序，实现有问题
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();

        Arrays.sort(whitelist);

        while (!StdIn.isEmpty()){
            int key = StdIn.readInt();//
            if (BinarySearch.indexOf(whitelist, key) == -1)
                StdOut.println(key);
        }

        //方法二：https://www.cnblogs.com/sunzn/archive/2013/02/13/2910897.html
        //简单直接
        /**int[] arr = new int[] {2,4,6,8,10,12};
        Arrays.sort(arr);
        int key = 6;
        //System.out.println(BinarySearch.indexOf(arr, key));
        StdOut.println(BinarySearch.indexOf(arr, key));**/


        //方法三：https://www.jb51.net/article/150991.htm 里的方法二
        //交互性更好
        /**System.out.println("请输入数据数量：");
        Scanner scanner=new Scanner(System.in);
        int amount=scanner.nextInt();
        //int num;
        int nums[]=new int[amount];
        int i=0;
        while(i<amount)
        {
            nums[i]=scanner.nextInt();
            i++;
        }
        Arrays.sort(nums);
        System.out.println("请输入想要查找的值");
        int key=scanner.nextInt();
        int answer=rank(key,nums);
        if(answer!=-1)
        {
            System.out.println("所查找的数据存在："+nums[answer]);
        }
        else
        {
            System.out.println("您所查找的数据不存在");
        }
        **/

    }
}
