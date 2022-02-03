import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class D_07_Violeta_Jokic_NS105QA4 {

    public static Scanner scan;

    public static void main(String[] args) {

        System.out.println("Izaberi X ili O : ");

        scan = new Scanner(System.in);
        String izbor = scan.next().toLowerCase(Locale.ROOT);
        String komp = "";


        String[] niz = new String[9];


        izborSimbola(izbor, komp);
        tabelaNiz(niz);

        while (true) {
            System.out.println("Izaberite poziciju od 0 do 8: ");

            int unosPozicija = scan.nextInt();
            int kompPozicija = (int) Math.floor(Math.random() * 9);

            for (int i = 0; i < niz.length; i++) {
                if (i == unosPozicija) {
                    if (niz[i] == null) {
                        niz[i] = izbor;
                    } else {
                        System.out.println("Unesite slobodnu poziciju.");
                        continue;
                    }

                    do {
                        kompPozicija = (int) Math.floor(Math.random() * 9);
                    } while (niz[kompPozicija] != null);
                    niz[kompPozicija] = komp;
                }
                break;
            }

        }
    }
    public static String izborSimbola(String izbor, String komp){

        if (izbor.equals("x")) {
            komp = "o";
        } else if (izbor.equals("o")) {
            komp = "x";
        } else {
            System.out.println("Pogresan unos.");
        }
        return komp;
    }


    public static void tabelaNiz (String [] niz){

        while (true) {
            System.out.println((niz[0] + " " + niz[1] + " " + niz[2]));
            System.out.println((niz[3] + " " + niz[4] + " " + niz[5]));
            System.out.println((niz[6] + " " + niz[7] + " " + niz[8]));
            break;
        }
    }



}

