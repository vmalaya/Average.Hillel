import java.util.Scanner;

/**
 * Created by Валентина on 16.05.2017.
 */
public class Average {
    public static void main(String[] arg) {

       System.out.println("Please input first number: ");
        Scanner scanner = new Scanner(System.in);
        double first = scanner.nextDouble();
        System.out.println("Please input second number: ");
        Scanner in = new Scanner(System.in);
        double second = in.nextDouble();
        double sum = first+second;
        System.out.println(sum);
        System.out.println("Average:" + (sum) / 2);


    }
}

