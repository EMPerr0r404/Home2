package pl.coderslab.homeworks.exceptions;


public class Main03 {
    public static int getLength(String str) {

        try {
            return str.length();
        } catch (NullPointerException e) {
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println(getLength(null));


    }

}
