import java.util.Scanner;

public class Check_Coprime_Integers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int first = scanner.nextInt();
        System.out.println("Enter second integer: ");
        int second = scanner.nextInt();
        int i;
        if (first > second)
            i = first;
        else
            i = second;

        while ((first % i != 0) || (second % i != 0)) {
            i--;
        }
        // System.out.println(i);
        if (i != 1)
            System.out.println("Coprime integers");
        else
            System.out.println("Not-Coprime integers");
    }
}
