import java.util.Scanner;

public class MakeGreat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        // Initialize StringBuilder with the input string
        StringBuilder sb = new StringBuilder(str);
        int i = 0;

        while (i < sb.length() - 1) {
            int check = Math.abs(sb.charAt(i) - sb.charAt(i + 1));
            if (check == 32) {
                sb.delete(i, i + 2);
                if (i > 0) {
                    i--; // Move back to recheck previous character after deletion
                }
            } else {
                i++;
            }
        }

        System.out.println("After making string great it becomes: " + sb.toString());
    }
}
