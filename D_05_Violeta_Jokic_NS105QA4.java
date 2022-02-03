import java.util.Arrays;
import java.util.Scanner;

public class D_05_Violeta_Jokic_NS105QA4 {
    public static void main(String[] args) {

/*----------------1--------------------------*/

  /*      Scanner scan = new Scanner(System.in);
        System.out.println("Unesite neki broj: ");
        int broj = scan.nextInt();
        int suma = 0;

        for(int i = 0; i <= broj; i++) {
            if( i % 2 == 0) {
                suma = suma + i;
            }
        }
        System.out.println("Suma svih parnih brojeva je: " + suma);
*/

/*-------------------2--------------------------*/

/*        Scanner scan = new Scanner(System.in)
        System.out.println("Unesite broj: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int s = n - i; s >= 0; s--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
*/

/*------------------3-------------------------------*/
/*
      int [] niz = {7, 9, 6, 3, 8, 5};
       int [] niz2 = new int[niz.length];

      for (int i = niz.length - 1; i >= 0; i--) {
           niz2 [i] = niz[niz.length - 1 - i];
      }
        System.out.println(Arrays.toString(niz2));
*/
/*-----------------------4---------------------------*/
/*
        int [] brojevi = {5, 6, 8, 9, 4, 2, 3};
        Scanner scan = new Scanner(System.in);
        System.out.println("Unesite neki broj: ");
        int x = scan.nextInt();
        boolean nadjen = false;

        for(int i = 0; i < brojevi.length; i++) {
            if(brojevi[i] == x) {
                nadjen = true;
            }
        }

        if(nadjen == true) {
            System.out.println("Nadjen.");
        } else {
            System.out.println("Ovaj broj ne postoji u nizu.");
        }
*/
    }
}
