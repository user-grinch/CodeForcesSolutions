import java.util.Scanner;
import java.lang.Math;

public class BeautifulMatrix {
    public static void main(String[] args) {
        
        int x = 0, y = 0;
        Scanner scanner = new Scanner(System.in);
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                int i = scanner.nextInt();
                if (i != 0) {
                    x = r+1;
                    y = c+1;
                }
            }
        }
        scanner.close();

        System.out.println(Math.abs(x-3) + Math.abs(y-3));
    }
}
