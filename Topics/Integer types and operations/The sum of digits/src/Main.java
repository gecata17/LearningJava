import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int number = scanner.nextInt();

        int firstDigit = number / 100;
        int secondDigit = (number / 10) % 10;
        int thirdDigit = number % 10;

        int sum = firstDigit + secondDigit + thirdDigit;

        System.out.println(sum);

    }
}