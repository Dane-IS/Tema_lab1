package Exercitiul_5;

import java.util.Scanner;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Random random=new Random();
        int numar=random.nextInt(21);
        System.out.println("Numarul aleator este "+numar);
    if(Fibonacci(numar)){
        System.out.println("Numarul face parte din sirul lui Fibonacii: "+numar);
    }
    else {
        System.out.println("Numarul nu face parte din sirul lui Fibonacii");
    }

    }

    public static boolean Fibonacci(int n){
return  true;
    }
}
