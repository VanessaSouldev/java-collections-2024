import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Hier mag je je code schrijven voor de hoofd-opdracht
        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] alphabetic = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "nul"};


        Translator translator = new Translator(numeric, alphabetic);


        Scanner Scanner = new Scanner(System.in);
        boolean play = true;
        String ongeldig = "ongeldige invoer";

        while (play) {
            System.out.println("type 'x' om te stoppen \n Type 'v' om te vertalen ");
            String input = Scanner.nextLine();
            if (input.equals("x")) {
                play = false;
            } else if (input.equals("v")) {
                System.out.println("Type een cijfer in van 0 t/m 9");
                int number = Scanner.nextInt();
                Scanner.nextLine();
                {
                    if (number < 10) {
                        String result = translator.translate(number);
                        System.out.println("De vertaling van " + number + " is " + result + ".");
                    } else {
                        System.out.println(ongeldig);
                    }


                }
            }

        }

    }


}


