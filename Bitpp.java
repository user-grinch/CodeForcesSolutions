import java.util.Scanner;

public class Bitpp {
    public static void main(String[] args) {
        int inputs;

        Scanner scanner = new Scanner(System.in);
        inputs = scanner.nextInt();

        int x = 0;
        for (int i =0; i < inputs; i++) {
            String str = scanner.next();
            if (str.contains("++")) {
                x++;
            } else if (str.contains("--")) {
                x--;
            }
        }
        scanner.close();

        System.out.println(x);
    }
}
