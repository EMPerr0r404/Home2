package pl.coderslab.homeworks.arrays;


import java.util.Arrays;

public class Main03 {
    public static boolean contains(int[] arr, int element) {
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                result = true;
                break;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 4, 4, 5, 7, 3};
        boolean result = contains(arr, 3);
        System.out.println(result);

    }
}