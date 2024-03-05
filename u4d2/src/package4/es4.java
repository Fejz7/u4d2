package package4;
import java.util.Scanner;
public class es4 {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Inserisci un numero intero: ");


            if (scanner.hasNextInt()) {
                int numero = scanner.nextInt();
                scanner.close();


                for (int i = numero; i >= 0; i--) {
                    System.out.println(i);
                }
            } else {
                System.out.println("Errore: Inserisci un numero intero valido.");
                scanner.close();
            }
        }
    }


