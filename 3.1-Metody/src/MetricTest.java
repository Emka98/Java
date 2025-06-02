public class MetricTest {
    public static void main(String[] args) {
        MetricConverter converter = new MetricConverter();
        double m = 2.5;
        System.out.println(m + "m to " + converter.metrsToCm(m) + " cm i " + converter.metersToMm(m) + " mm");
        }
    }