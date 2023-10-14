package pl.coderslab.homeworks.arrays;


import java.util.Arrays;

public class Main02 {

    public static int[] append(int[] arr){

        int[] arrTemp = new int[arr.length *2];
        for (int i = 0; i < arrTemp.length; i++) {
            if (i <= arr.length-1){
            arrTemp[i] = arr[i] ;}
            else arrTemp[i] = arr[arrTemp.length -1 -i];
          }
        return arrTemp;
    }


    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 3, 4, 4, 5,7,9};
        int[]result = append(arr);
        System.out.println(Arrays.toString(result));

    }

}
