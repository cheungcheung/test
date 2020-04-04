package LianXi;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String args[]){

        String[] num = {"int.class","long.class"};



        for (int i=0;i<num.length;i++){
            System.out.println("当前元素:"+num[i]+",索引:"+Arrays.binarySearch(num,num[i]));

            if (Arrays.binarySearch(num,num[i]) != 0 ){
                System.out.println("上一个元素:"+num[Arrays.binarySearch(num,num[i])-1]);

            }

        }
    }
}
