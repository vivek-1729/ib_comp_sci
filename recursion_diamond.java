import java.util.Scanner;
public class Main {
    public static void challenge(int i, int j, boolean change, int number) {
        if (i==0 || i==-1) {
            String firstSpace = new String(new char[(number-1)/2]).replace("\0", " ");
            System.out.print(firstSpace);
        }
        if (i!=number-2) {
            System.out.print("X");
        }
            if (i < number && !change) {
                if (j < i) {
                    j++;
                    challenge(i, j, change, number);
                } else {
                    i += 2;
                    j = 0;
                    if (i!=number+1) {
                        System.out.println();
                        String spaces = new String(new char[(number-i-1)/2]).replace("\0", " ");
                        System.out.print(spaces);
                        challenge(i, j,change, number);
                    }
                }
            }
            if (i>number && i<number*2) {
                change = true;
                i = number-2;
            }
            if (i < number && i>-3 && change) {
                if(j<=i) {
                    j++;
                    challenge(i,j,change, number);
                }
                else {
                    i-=2;
                    j=0;
                    System.out.println();
                    if (i >-3) {
                        String spaces = new String(new char[(number-i-1)/2]).replace("\0", " ");
                        if (i!=-1) {
                            System.out.print(spaces);
                        }
                        challenge(i, j, change, number);
                    }
                }
            }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scan.nextInt();
        if (number % 2 == 0 || number < 0) {
            System.out.println("Has to be a positive odd number");
        }
        else {
            challenge(0, 0, false, number);
        }
    }
}
