import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class D_08_Violeta_Jokic_NS105QA4 {
   public static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        //-----------------------1------------------------------

        /*
        System.out.println("Unesite zeljenu recenicu: ");
        String recenica = scan.nextLine();
        brojReciURecenici(recenica);
        System.out.println("Broj reci u recenici je: " + brojReciURecenici(recenica));
        */

        //------------------------2-----------------------------

        /*
        String nekiString = "Inicijalizacija stringa u svrhe izrade zadatka zadatog u okviru domaceg broj osam.".toLowerCase(Locale.ROOT);
        System.out.println(nekiString);
        System.out.println("Izaberite slovo iz recenice za koje zelite da se izvrsi prebrojavanje: ");
        String slovo = scan.nextLine().toLowerCase(Locale.ROOT);
        prebrojavanjeSlovaURecenici(slovo,nekiString);
        System.out.println("Broj trazenog slova u recenici je: " + prebrojavanjeSlovaURecenici(slovo,nekiString));
        */

        //------------------------3------------------------------

        /*
        int[][] nizDabl = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};

        transponovanaMatrica(nizDabl);
        System.out.println("Transponovana matrica je: " + transponovanaMatrica(nizDabl);
        */
    }

   //-------------------------1-----------------------------------------------

    public static int brojReciURecenici(String string){
        String [] nizReci = string.split(" ");
        int brojReci = nizReci.length;
        return brojReci;
    }


    //-----------------------2------------------------------------------------

  public static int prebrojavanjeSlovaURecenici (String unos, String recenica){
        String [] nizKaraktera = recenica.split("");
        int brojSlova = 0;
        for(int i = 0; i < nizKaraktera.length; i++){
            if( nizKaraktera[i].equals(unos)){
                brojSlova = brojSlova + 1;
            }
        }
        return brojSlova;
    }


    //-----------------------3------------------------------------------------

   public static int[][] transponovanaMatrica(int[][] matrica){
        int [] [] transM = new int[matrica[0].length][matrica.length];
       for(int i = 0; i < matrica.length; i++){
           for(int j = 0; j < matrica[i].length; j++){
               transM [j][i] = matrica [i][j];
           }
       }
       return transM;
    }

    }


