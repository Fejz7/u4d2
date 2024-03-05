package package2;


    import java.util.Scanner;

public class es2 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            System.out.print("Inserisci un numero compreso tra 0 e 3: ");
            int numero = scanner.nextInt();


            scanner.close();


            switch (numero) {
                case 0:
                    System.out.println("Il numero in lettere è: Zero");
                    break;
                case 1:
                    System.out.println("Il numero in lettere è: Uno");
                    break;
                case 2:
                    System.out.println("Il numero in lettere è: Due");
                    break;
                case 3:
                    System.out.println("Il numero in lettere è: Tre");
                    break;
                default:
                    System.out.println("Errore: Il numero non è compreso tra 0 e 3");
            }
        }
    }


