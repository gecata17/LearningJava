import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int number;
        int max = 0;
        for (int i = 0; i < n; i++) {
            number = scanner.nextInt();

            if (max<=number){
                if(number%4==0) {
                    max = number;

                }
            }
        }
        System.out.println(max);
    }
}