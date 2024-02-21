import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year, modulo;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your birth year: ");
        year = scanner.nextInt();

        modulo = year % 12;

        switch(modulo) {
            case 0:
                System.out.print("Your Chinese zodiac sign is: Monkey.");
                break;
            case 1:
                System.out.print("Your Chinese zodiac sign is: Rooster.");
                break;
            case 2:
                System.out.print("Your Chinese zodiac sign is: Dog.");
                break;
            case 3:
                System.out.print("Your Chinese zodiac sign is: Pig.");
                break;
            case 4:
                System.out.print("Your Chinese zodiac sign is: Rat.");
                break;
            case 5:
                System.out.print("Your Chinese zodiac sign is: Ox.");
                break;
            case 6:
                System.out.print("Your Chinese zodiac sign is: Tiger.");
                break;
            case 7:
                System.out.print("Your Chinese zodiac sign is: Rabbit.");
                break;
            case 8:
                System.out.print("Your Chinese zodiac sign is: Dragon.");
                break;
            case 9:
                System.out.print("Your Chinese zodiac sign is: Snake.");
                break;
            case 10:
                System.out.print("Your Chinese zodiac sign is: Horse.");
                break;
            case 11:
                System.out.print("Your Chinese zodiac sign is: Goat.");
                break;
            default:
                System.out.print("There was a problem with your answer. Please try again.");
        }

        scanner.close();
    }
}