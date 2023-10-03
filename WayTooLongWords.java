import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = Integer.parseInt(input.nextLine());
        String[] arr = new String[total];

        for (int i = 0; i < total; ++i) {
            arr[i] = input.nextLine();
        }
        input.close();

        for (int i = 0; i < total; ++i) {
            int length = arr[i].length();
            if (length > 10) {
                String str = arr[i];
                System.out.println(str.charAt(0) + Integer.toString(length-2) + str.charAt(length-1)); 
            } else {
                System.out.println(arr[i]);
            }
        }
    }
}