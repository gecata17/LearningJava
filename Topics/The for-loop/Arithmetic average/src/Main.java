import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double average = 0;
        double sum = 0;
        int counter = 0;
        for (int i = a; i <= b; i++) {

            if (i % 3 == 0) {
                sum += i;
                counter++;
                average = sum / counter;
            }
        }

        System.out.println(average);
    }
}