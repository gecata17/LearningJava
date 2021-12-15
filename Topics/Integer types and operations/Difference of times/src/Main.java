import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int firstHours = scanner.nextInt();
        int firstMinutes = scanner.nextInt();
        int firstSeconds = scanner.nextInt();

        int secondHours = scanner.nextInt();
        int secondMinutes = scanner.nextInt();
        int secondSeconds = scanner.nextInt();

        firstHours*=3600;
        secondHours*=3600;
        firstMinutes*=60;
        secondMinutes*=60;

        int total1=firstHours+firstMinutes+firstSeconds;
        int total2=secondHours+secondMinutes+secondSeconds;
        int left = total2-total1;

        System.out.println(left);
    }
}