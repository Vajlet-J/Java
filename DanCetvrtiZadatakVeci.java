
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DanCetvrtiZadatakVeci {
public static void main(String[]args) {

    //1 Napraviti niz od 1 do n brojeva, gde n unosi korisnik, 1, 2, 3...n...
    Scanner scan = new Scanner(System.in);
    System.out.println("Unesite broj loptica: ");
    int n = scan.nextInt();

    int[] bubanj = new int[n];
    for (int i = 0; i < n; i++) {
        bubanj[i] = i + 1;
    }
    System.out.println(Arrays.toString(bubanj));

    //2 Za zadati niz, NASUMICNO izdvojiti iz niza u (1) kombinaciju brojeva od 1 do K , gde je K broj koji unosi korisnik

    System.out.println("Unesite koliko brojeva zelite da se izvuce iz bubnja: ");
    int k = scan.nextInt();
    int[] dobitnaKombinacija = new int[k];

    for (int i = 0; i < k; i++) {
        int r = (int) Math.floor((Math.random()) * n);
        dobitnaKombinacija[i] = bubanj[r];
    }
    System.out.println(Arrays.toString(dobitnaKombinacija));

    //3 Dati mogucnost korisniku da unese brojeve niza i da pogodi kombinaciju brojeva

    int[] korisnikNiz = new int[k];
    for (int i = 0; i < k; i++) {
        System.out.print("Unesite " + (i + 1) + " broj: ");
        int num = scan.nextInt();
        korisnikNiz[i] = num;
    }

    //4 Proverti da li je korisnik pogodio kombinaciju i dati odgovarajucu poruku

    boolean pogodak = true;

    for (int i = 0; i < k; i++) {
        if (korisnikNiz[i] != dobitnaKombinacija[i]) {
            pogodak = false;
            break;
        }
    }

    if (pogodak) {
        System.out.println("pogodili ste dobitnu kombinaciju");
        System.out.println(Arrays.toString(dobitnaKombinacija));
    } else {
        System.out.println("niste pogodili :( ");
        System.out.println(Arrays.toString(dobitnaKombinacija));
    }

    }

}
