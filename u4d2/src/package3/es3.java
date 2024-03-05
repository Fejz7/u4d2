package package3;
import java.util.Scanner;
public class es3 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Inserisci una stringa (o ':q' per uscire): ");
                String input = scanner.nextLine();

                if (input.equals(":q")) {
                    System.out.println("Uscita dal programma.");
                    break;
                }

                suddividiEStampa(input);
            }

            scanner.close();
        }

        private static void suddividiEStampa(String input) {

            String[] caratteri = input.split("");


            System.out.print("Caratteri separati da virgola: ");
            for (String carattere : caratteri) {
                System.out.print(carattere + ",");
            }
            System.out.println();
        }
    }


