import java.io.*;
import java.util.*;
import java.util.Scanner;

public class activity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first player name : ");
        String Kname = scanner.nextLine();
        System.out.println("Enter the second player name : ");
        String Nname = scanner.nextLine();
        String[] a1 = Kname.split(" ");
        String[] a2 = Nname.split(" ");
        String M1 = a1[1];
        String M2 = a2[1];
        {

            System.out.println("Output: ");
            if (name.equals(M1)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}