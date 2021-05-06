package CBSEBoardsCalculator;
import java.util.Scanner;

public class CBSEBoardsPercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Result 1 : ");
        double a = sc.nextDouble();
        System.out.print("Result 2 : ");
        double b = sc.nextDouble();
        System.out.print("Result 3 : ");
        double c = sc.nextDouble();
        System.out.print("Result 4 : ");
        double d = sc.nextDouble();
        System.out.print("Result 5 : ");
        double e = sc.nextDouble();

        double num = a+b+c+d+e;
        System.out.println("\nYour Result Percentage is "+num/500*100);
    }
}
