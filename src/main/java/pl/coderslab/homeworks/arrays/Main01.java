package pl.coderslab.homeworks.arrays;


import java.util.Arrays;

public class Main01 {

    public static int[] returnUnique(int[] arr) {
        int[] distinctElements = {};
        for (int i = 0; i < arr.length; i++) {
            boolean exists = false;
            // Sprawdzenie 0 tablicy, powiększenie tablicy i przepisanie pierwszej wartości
            if (distinctElements.length == 0) {
                distinctElements = new int[1];
                distinctElements[0] = arr[i];
            } else {
                for (int j = 0; j < distinctElements.length; j++) {
                    if (arr[i] == distinctElements[j]) {
                        exists = true;
                        break;
                    }
                }
                if (exists == false) {
                    distinctElements = Arrays.copyOf(distinctElements, distinctElements.length + 1);
                    distinctElements[distinctElements.length - 1] = arr[i];

                }
            }
        }
        return distinctElements;
    }


    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 2, 3, 4, 4, 5};
        System.out.println(Arrays.toString(returnUnique(arr)));
    }

}
