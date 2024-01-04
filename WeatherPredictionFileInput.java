import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WeatherPredictionFileInput {
    public static void main(String[] args) {
        String fileName = "file.txt";
        
        processFileInput(fileName);
    }

    private static void processFileInput(String fileName) {
        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextDouble()) {
                double t = fileScanner.nextDouble();
                double h = fileScanner.nextDouble();
                double w = fileScanner.nextDouble();

                processInput(t, h, w);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Exiting.");
        }
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
