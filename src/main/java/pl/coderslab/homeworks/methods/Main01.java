package pl.coderslab.homeworks.methods;


public class Main01 {
    public static double dogAge(double dogAge) {
        if (dogAge < 2) {
            dogAge *= 10.5;
            return dogAge;
        } else
            dogAge =  (dogAge -2) * 4 + (2 * 10.5);
        return dogAge;
    }


    public static void main(String[] args) {

        System.out.println(dogAge(5.5));
    }


}
