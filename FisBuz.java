import java.util.Scanner;
/*Zadatak1: napisati metodu koja za zadati broj n kao parametar prolazi kroz brojeve od 0 do n i ispisuje sledece poruke:
fizz ako je broj deljiv sa 3
buzz ako je broj deljiv sa 5
fizzbuzz ako je broj deljiv sa 3 i sa 5*/

public class FisBuz {

    public static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        System.out.println("Unesite broj: ");

        int broj = scanner.nextInt();

        fizzBuz(broj);
    }
    public static void fizzBuz (int broj){
        for (int i = 0; i <= broj; i++){
            if( i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz" + broj);
            }else if( i % 3 == 0){
                System.out.println("Fizz" + broj);
            }else if(i % 5 == 0){
                System.out.println("Buzz" + broj);
            }else{
                System.out.println(broj + "Nije deljivo ni sa 3 ni sa 5.");
            }
        }

    }

}

