public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 60;
        int height = 173;
        double indexweight = service.calculate(weight, height);
        System.out.println("Body Mass index = " + indexweight);
    }
}
