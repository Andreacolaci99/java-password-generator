
import java.util.Scanner;

public class PasswordGenerator {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("BENVENUTO NEL GENERATORE DI PASSWORD !!");
        System.out.println("PER GENERARE UNA PASSWORD INSERISCI I DATI RICHIESTI !!");
        System.out.println("Inserisci il tuo nome");

        String name = scan.next();

        System.out.println("Inserisci il tuo cognome");

        String surname = scan.next();

        System.out.println("Inserisci il tuo colore preferito");

        String favouriteColor = scan.next();

        System.out.println("Inserisci il tuo giorno di nascita");

        int dayOfBirth = scan.nextInt();

        System.out.println("Inserisci il tuo mese di nascita");

        int monthOfBirth = scan.nextInt();

        System.out.println("Inserisci il tuo anno di nascita");

        int yearOfBirth = scan.nextInt();

        System.out.println("La tua password sarà : " + name + "-" + surname + "-" + favouriteColor + "-" + (dayOfBirth + monthOfBirth + yearOfBirth));

    }
}