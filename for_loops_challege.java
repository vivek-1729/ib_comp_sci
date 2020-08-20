import java.util.Scanner;
public class Main {
    public static void challenge1(int number) {
        for (int i=0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
    public static void challenge2(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
    public static void challenge3(int number) {
        for (int i=0; i< number; i++) {
            String spaces = new String(new char[number-i-1]).replace("\0", " ");
            System.out.print(spaces);
            for (int j = 0; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
    public static void challenge4(int number) {
        for (int i = 0; i < number; i++) {
            String spaces = new String(new char[i]).replace("\0", " ");
            System.out.print(spaces);
            for (int j = 0; j < number - i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
    public static void challenge5(int number) {
        for (int i=0; i < number*2; i+=2) {
            int numSpaces = (number-i-1)/2;
            if (numSpaces < 0) {
                numSpaces = numSpaces * -1;
            }
            String spaces = new String(new char[numSpaces]).replace("\0", " ");
            System.out.print(spaces);
            for (int j = 0; j <= i; j++) {
                if (i < number) {
                    System.out.print("X");
                }
            }
            for (int j = 0; j < number*2-i-1; j++) {
                if (i>number) {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Challenge number (1-5): ");
        int challengeNumber = scan.nextInt();
        System.out.print("Number: ");
        int number = scan.nextInt();
        switch (challengeNumber) {
            case 1:
                challenge1(number);
                break;
            case 2:
                challenge2(number);
                break;
            case 3:
                challenge3(number);
                break;
            case 4:
                challenge4(number);
                break;
            case 5:
                if (number % 2 == 0) {
                    System.out.println("Must be an odd number");
                }
                else {
                    challenge5(number);
                }
                break;
            default:
                System.out.println("Must be a number between 1 and 5");
        }
    }
}
