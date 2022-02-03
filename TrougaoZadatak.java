import java.util.Scanner;

/* Zadatak 1: korisnik unosi 3 stranice trougla. Napisati program tako da ispise koji je tip trougla.
        Ukoliko korisnik zeli da izadje iz programa, moze ukucati 'exit' u konzolu. Koristiti while petlju i scanner.
        +napraviti proveru da li se trougao moze konstruisati za date 3 stranice.
 */
public class TrougaoZadatak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Ukoliko zelite da izadjete iz programa,ukucajte exit u suprotnom kliknite enter ");
            String exit = scan.nextLine();
            if(exit.equals("exit")){
                System.out.println("Izasli ste iz programa.");
                break;
            }
            System.out.println("Unesite podatak za prvu stranicu trougla: ");
            int prva = scan.nextInt();
            System.out.println("Unesite podatak za drugu stranicu trougla: ");
            int druga = scan.nextInt();
            System.out.println("Unesite podatak za trecu stranicu trougla: ");
            int treca = scan.nextInt();

            if((prva + druga) < treca || (prva + treca) < druga || (druga + treca) < prva) {
                System.out.println("Sa ovim dimenzijama nije moguce konstruisati trougao");
                continue;
            }

            if( prva == druga && druga == treca){
                System.out.println("Tip trougla je jednakostranican");
            }
            else if ( prva == druga || druga == treca || prva == treca){
                System.out.println("Tip trougla je jednakokraki");
            }else {
                System.out.println("Tip trougla je raznostranican");
            }

        }

    }
}