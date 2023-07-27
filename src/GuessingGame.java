import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100);
        int attempts = 0;
        System.out.println("---ATTENTION: Você possui 5 tentativas! (you have 5 attempts)---");

        while (attempts < 5) {
            String phraseIntro = """
                Digite um número entre 0 e 100 e tecle 'enter':
                Type a number between 0 and 100 and press 'enter':""";
            System.out.println(phraseIntro);
            int typedNumber = number.nextInt();
            attempts++;

            if (typedNumber == randomNumber) {
                String phraseCongratulations = """
                        Parabéns!(Congratulations!) Você acertou o número!(You got the number right!)
                        """;
                System.out.println(phraseCongratulations);
                break;
            } else if (typedNumber < randomNumber) {
                String phraseSmallerNumber = """
                        O número digitado é menor que o número correto! Tente novamente.
                        The number you entered is lower than the correct number! Try again.
                        """;
                System.out.println(phraseSmallerNumber);
            } else {
                String phraseBiggerNumber = """
                        O número digitado é maior que o número correto! Tente novamente.
                        The number you entered is bigger than the correct number! Try again.
                        """;
                System.out.println(phraseBiggerNumber);
            }
        }
        if (attempts == 5) {
            System.out.println("O número era(The number was )" + randomNumber);
        }
    }
}
