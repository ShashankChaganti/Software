import java.util.Scanner;

public class Weatherprediction3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Data set " + (i + 1));
            System.out.print("Enter t value: ");
            double t = scanner.nextDouble();

            System.out.print("Enter h value: ");
            double h = scanner.nextDouble();

            System.out.print("Enter w value: ");
            double w = scanner.nextDouble();

            processInput(t, h, w);
        }

        scanner.close();
    }

    private static void processInput(double t, double h, double w) {
        double W = 0.5 * Math.pow(t, 2) - 0.2 * h - 0.1 * w - 15;
        System.out.println(W);

        if (W > 300) {
            System.out.println("Sunny");
        } else if (200 < W && W <= 300) {
            System.out.println("Cloudy");
        } else if (100 < W && W <= 200) {
            System.out.println("Rainy");
        } else {
            System.out.println("Stormy");
        }
    }
}
