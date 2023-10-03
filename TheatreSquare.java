import java.util.Scanner;
import java.lang.Math;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = Integer.parseInt(input.next());
        long m = Integer.parseInt(input.next());
        long a = Integer.parseInt(input.next());

        System.out.println(Math.round(Math.ceil((double)m/a)*Math.ceil((double)n/a)));
    }
}