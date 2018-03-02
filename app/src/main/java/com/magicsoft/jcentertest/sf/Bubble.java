package com.magicsoft.jcentertest.sf;

/**
 * <pre>
 *     @author : Lss winding
 *     e-mail : kiwilss@163.com
 *     time   : 2018/3/1
 *     desc   : ${DESCRIPTION}
 *     version: ${VERSION}
 * </pre>
 */


public class Bubble {

    public static final String TAG = "MMM";



    public static void bubble(int data[]){
        int length = data.length;

        for (int i = 0; i < length-1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                System.out.println("bubble:  i="+i+".....j="+j );
                int temp;
                if (data[j]>data[j+1]){
                    temp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                }
            }

        }

        for (int i = 0; i < length; i++) {
            System.out.println("bubble: "+data[i]);
        }
    }






    public static void main(String[] args) {
        int data[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        bubble(data);
    }
}
