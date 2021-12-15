import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.print(a);
        System.out.print(' ');
        System.out.print(b);
    }
}