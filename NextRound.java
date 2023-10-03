import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        int inputs, max;

        Scanner scanner = new Scanner(System.in);
        inputs = scanner.nextInt();
        max = scanner.nextInt();

        int[] arr = new int[inputs];
        for (int i =0; i < inputs; i++) {
            arr[i] = scanner.nextInt();
        }

        int last = 0;
        int count = 0;
        for (int i = 0; i < inputs; i++) {
            if (arr[i] <= 0) {
                break;
            }
            if (count < max || last == arr[i]) {
                count++;
                last = arr[i];
            }
        }
        System.out.println(count);
    }
}
