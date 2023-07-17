public class Forecast {
    public static void forecast(String[] args) {
        Weather WeatherBox = new Weather();

        System.out.println("Pn: " + "Sunny, " + WeatherBox.pn);
        System.out.println("Wt: " + "Sunny, " + WeatherBox.wt);
        System.out.println("Sr: " + "Thunderstorms in place, " + WeatherBox.sr);
        System.out.println("Ct: " + "Rains, " + WeatherBox.ct);
        System.out.println("Pt: " + "Sunny, " + WeatherBox.pt);
        System.out.println("Sb: " + "Sunny, " + WeatherBox.sb);
        System.out.println("Ws: " + "Heavy rain with thunde, " + WeatherBox.ws);
    }
}
