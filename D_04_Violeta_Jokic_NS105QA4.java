import java.util.Locale;
import java.util.Scanner;

public class D_04_Violeta_Jokic_NS105QA4 {
    public static void main(String[] args) {

        //PRVI ZADATAK

       Scanner scan = new Scanner(System.in);
        System.out.println("Unesite ocenu za kvalitet restorana: ");
        int ocenaKvalitet = scan.nextInt();

        if (ocenaKvalitet >= 1 && ocenaKvalitet <= 10) {
            System.out.println("Uneli ste ocenu za kvalitet restorana");
        } else {
            System.out.println("Podatak koji ste uneli nije validan.");
            return;
        }

        System.out.println("Unesite ocenu za uslugu restorana: ");
        int ocenaUsluga = scan.nextInt();

        if (ocenaUsluga >= 1 && ocenaUsluga <= 10) {
            System.out.println("Uneli ste ocenu za uslugu restorana");
        } else {
            System.out.println("Podatak koji ste uneli nije validan.");
            return;
        }

        double prosek = (ocenaKvalitet + ocenaUsluga) / 2.0;
        if (prosek > 5) {
            System.out.println("Prosek ocena veci od 5.");
        } else if (prosek < 5 && ocenaKvalitet == 1) {
            System.out.println("Treba popravljati kvalitet.");
        } else if (prosek < 5 && ocenaUsluga == 1) {
            System.out.println("Treba popraviti uslugu.");
        } else {
            System.out.println("Prosek ocena je manji od 5.");
        }


     //DRUGI ZADATAK

        /*
        Scanner sken = new Scanner(System.in);
        System.out.println("Unesite mesec: ");
        String mesec = sken.nextLine().toLowerCase(Locale.ROOT);
        switch (mesec){
            case "januar":
            case "mart":
            case "maj":
            case "jul":
            case "avgust":
            case "oktobar":
            case "decembar":
                System.out.println("Ovaj mesec ima 31 dan.");
                break;
            case "april":
            case "jun":
            case "septembar":
            case "novembar":
                System.out.println("Ovaj mesec ima 30 dana.");
                break;
            case "februar":
                System.out.println("Ovaj mesec ima 28 dana.");
                break;
            default:
                System.out.println("Pogresan unos imena meseca.");
        }

        */

    }
}
