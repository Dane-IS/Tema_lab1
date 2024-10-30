package Exercitiu_4;

import java.util.Scanner;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Random random=new Random();

        int numar1=random.nextInt(30)+1;
        int numar2=random.nextInt(30)+1;
        System.out.println("Cele doua numere aleatorii sunt "+numar1+" "+numar2);

        int calcul=cmmdc(numar1,numar2);
        System.out.println("CMMDC dintre cele doua numere este: "+calcul);

    }
    public static int cmmdc(int a, int b){
        if(b==0)
            return a;
        return cmmdc(b,a%b);
    }
}
