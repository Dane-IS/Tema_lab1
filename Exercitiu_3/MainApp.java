package Exercitiu_3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("n= ");
    int n=scanner.nextInt();

    boolean estePrim=true;

    System.out.println("Divizorii numarului "+ n +" sunt:");

    for(int i=1;i<=n;i++){
        if(n%i==0){
            System.out.println(i+" ");
            if(i!=1 && i!=n)
                estePrim=false;
        }
      }
        if (estePrim && n > 1) {
            System.out.println("\nNumărul " + n + " este prim.");
        } else if (n == 1) {
            System.out.println("\nNumărul 1 nu este nici prim, nici compus.");
        }
    }

}
