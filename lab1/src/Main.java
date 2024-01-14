import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст на русском: ");
        String input = scanner.nextLine().toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            int number = letter - 'а' + 1;
            System.out.print(letter + "  ");
        }
        System.out.println();

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            int number = letter - 'а' + 1;
            System.out.print(number + "  ");
        }
    }
}
