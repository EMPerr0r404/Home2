package pl.coderslab.homeworks.exceptions;


import static pl.coderslab.homeworks.exceptions.Main01.average;

public class Main01 {

    public static void main(String[] args) {
        String a = "5";
        String b = "0";
        average(a, b);
double c = 2.2;
double  d = 0;
        System.out.println(c/d);

    }

    public static void average(String a, String b) {
        try {


            int a2 = Integer.parseInt(a);
            int b2 = Integer.parseInt(b);
            System.out.println(a2 / b2);

        } catch (NumberFormatException e) {
            System.out.println("Invalid integer input");
        } catch (ArithmeticException er) {
            System.out.println("We can not divide by 0");

        } finally {
            System.out.println("Yep, we needed it here.");
        }

    }
}
