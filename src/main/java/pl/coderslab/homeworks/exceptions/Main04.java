package pl.coderslab.homeworks.exceptions;

public class Main04 {
    public static int toInt(String str) {
        int result =0;
        try {
            result = Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println(e);
          return 404;
        }
        return result;

    }



    public static void main(String[] args) {
        String str = "123151l";
        System.out.println(toInt(str));


    }

}
