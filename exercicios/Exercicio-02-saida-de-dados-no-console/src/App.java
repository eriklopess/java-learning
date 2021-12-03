public class App {
    public static void main(String[] args) throws Exception {

        String PRODUCT_1 = "Computer";
        String PRODUCT_2 = "Office desk";

        int AGE = 30;
        int CODE = 5290;
        char GENDER = 'F';

        double PRICE_1 = 2100.0;
        double PRICE_2 = 650.50;
        double MEASURE = 53.234567;

        System.out.printf("%s, which price is $ %.2f\n", PRODUCT_1, PRICE_1);
        System.out.printf("%s, which price is $ %.2f\n", PRODUCT_2, PRICE_2);
        System.out.printf("Record: %d years old, code %d and gender: %c\n", AGE, CODE, GENDER);
        System.out.printf("Measure with eight decimal place: %f\n", MEASURE);
        System.out.printf("Rouded (three decial places): %.3f\n", MEASURE);
    }
}
