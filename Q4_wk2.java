package lab02;
import java.util.Scanner;

public class Q4_wk2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] zodiacs = {"monkey","rooster","dog","pig","rat","ox","tiger","rabbit","dragon","snake", "horse","sheep"};

        System.out.println("Enter a year: ");
        int year = input.nextInt();
        System.out.println(zodiacs[year%12]);
        input.close();
    }
}
