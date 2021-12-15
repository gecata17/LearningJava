import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int squirrels = scanner.nextInt();
        int k = scanner.nextInt();

        int result = k / squirrels;

        System.out.println(result);

    }
}