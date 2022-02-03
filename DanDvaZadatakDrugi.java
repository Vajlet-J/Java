import java.util.Scanner;
/*
Korisnik treba da unese naziv filma koji zeli da gleda , u zavisnosti od odabrane predstave ispisuje mu se koja je cena karte i
 koja mesta su slobodna
Korisnik bira jedno od ponudjenih mesta , nakon sto je korisnik izabrao mesto ispisuje se poruka uspesna rezervacija, ako je
korisnik uneo bilo sta osim neki od brojeva ponudjenih mesta ispisuje se poruka "Rezervacija otkazana"
*/

public class DanDvaZadatakDrugi {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Unesite naziv filma: ");
            String nazivFilma = scan.next();

            if (nazivFilma.equals("Dune")) {
                System.out.println("Cena ulaznice je 350din. Slobodna mesta su: 10, 11, 12, 13, 14, 15, 16. ");
            } else if (nazivFilma.equals("Matrix")) {
                System.out.println("Cena ulaznice je 300din. Slobodna mesta su: 1, 2, 3, 5, 6. ");
            } else if (nazivFilma.equals("Hari")) {
                System.out.println("Cena ulaznice je 250din. Slobodna mesta su: 50, 51, 52, 53, 54, 55");
            }

            System.out.println("Izaberite jedno od ponudjenih mesta: ");

            int slobodnoMesto = scan.nextInt();

            if (nazivFilma.equals("Dune")) {
                if ((slobodnoMesto >= 10) && (slobodnoMesto <= 16)) {
                    System.out.println("Uspesna rezervacija. ");
                } else {
                    System.out.println("Rezervacija otkazana. ");
                }
            }

            if (nazivFilma.equals("Matrix")) {
                if (slobodnoMesto == 1 || slobodnoMesto == 2 || slobodnoMesto == 3 ||
                        slobodnoMesto == 5 || slobodnoMesto == 6) {
                    System.out.println("Uspesna rezervacija. ");
                } else {
                    System.out.println("Rezervacija otkazana. ");
                }
            }


            if(nazivFilma.equals("Hari")){
                if((slobodnoMesto >=50) && (slobodnoMesto <=55)) {
                    System.out.println("Uspesna rezervacija.");
                } else{
                        System.out.println("Rezervacija otkazana");
                    }
                }
            }
        }



