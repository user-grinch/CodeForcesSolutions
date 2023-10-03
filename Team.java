import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = Integer.parseInt(input.nextLine());
        String[] arr = new String[total];

        for (int i = 0; i < total; ++i) {
            arr[i] = input.nextLine();
        }
        input.close();

        int solutions = 0;
        for (int i = 0; i < total; ++i) {
            int j = 0;
            for(int k = 0; k < arr[i].length(); k++) {
                if(arr[i].charAt(k) == '1') j++;
            }
            
            if (j > 1) {
                solutions++;
            }
        }

        System.out.println(solutions);
    }
}