import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();

        int number;
        int counterA = 0;
        int counterB = 0;
        int counterC = 0;
        int counterD = 0;
        for (int i = 0; i < n; i++) {
            number = scanner.nextInt();
            if (number == 5) {
                counterA++;
            } else if (number == 4) {
                counterB++;
            } else if (number == 3) {
                counterC++;
            } else if (number == 2) {
                counterD++;
            }
        }

        System.out.print(counterD);
        System.out.print(' ');
        System.out.print(counterC);
        System.out.print(' ');
        System.out.print(counterB);
        System.out.print(' ');
        System.out.print(counterA);

    }
}