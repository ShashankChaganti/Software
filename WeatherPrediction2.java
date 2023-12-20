public class WeatherPrediction2 {
    public static void main(String[] args) {
        int n = 1; 

        for (int i = 0; i < n; i++) {
            double t = 28;  
            double h = 65;  
            double w = 20; 

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
}
