package package1;

public class es1 {


        public static void main(String[] args) {

            String testString1 = "Javascript";
            String testString2 = "Java";

            System.out.println("La lunghezza di " + testString1 + " è pari? " + stringPariDispari(testString1));
            System.out.println("La lunghezza di " + testString2 + " è pari? " + stringPariDispari(testString2));


            int testYear1 = 2020;
            int testYear2 = 2023;

            System.out.println(testYear1 + " è bisestile? " + annoBisestile(testYear1));
            System.out.println(testYear2 + " è bisestile? " + annoBisestile(testYear2));
        }


        public static boolean stringPariDispari(String input) {
            int lunghezza = input.length();
            return lunghezza % 2 == 0;
        }


        public static boolean annoBisestile(int anno) {
            return (anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0);
        }
    }


