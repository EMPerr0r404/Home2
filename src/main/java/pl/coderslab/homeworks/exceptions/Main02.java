package pl.coderslab.homeworks.exceptions;


public class Main02 {
    public static String safeGet(String[] strTab, int index) {
        try {
          return  strTab[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Index can be only up to " + (strTab.length-1);
        }


    }

    public static void main(String[] args) {
        String[] strTab = {"2", "3", "4", "5"};
        System.out.println(safeGet(strTab, 6));

    }

}