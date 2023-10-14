package pl.coderslab.homeworks.exceptions;


import java.util.NoSuchElementException;

public class Main05 {

    public static int indexOf(int[] elements, int value) throws NoSuchElementException {
        int result = -1;
        for (int i = 0; i < elements.length; i++) {

            if (elements[i] == value) {
                result = i;
                break;
            }


        }
        if (result == -1)
            throw new NoSuchElementException("NoSuchElementException");
        else
            return result;
    }

    public static void main(String[] args) {
        int[] elements = {2, 3, 4, 5};
        try{
        System.out.println(indexOf(elements, 2));}
        catch (NoSuchElementException e){
            System.out.println("Error");
        }

    }

}
