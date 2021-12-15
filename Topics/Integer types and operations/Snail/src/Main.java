import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int height = scanner.nextInt();
        int up = scanner.nextInt();
        int down = scanner.nextInt();
        int counter = 0;
        int days = 0;
        while (counter<= height) {
            counter += up;

            if (counter >= height) {

                days++;
                break;
            }
            else{
                counter-=down;
                days++;

            }
        }
        System.out.println(days);
    }
}