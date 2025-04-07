public class Temperature {
    public static void main(String[] args) {
        double farenheit = 0;
        double celsious = 0;

        double temperatureF = (celsious * 1.8) + 32;
        double temperatureC = (farenheit - 32) * 0.5555555;
        int temperatureFInt = (int) temperatureF;
        int temperatureCInt = (int) temperatureC;
        System.out.println(temperatureFInt);
        System.out.println(temperatureCInt);

    }
}
