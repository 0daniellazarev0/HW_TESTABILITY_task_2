public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMetres = 1.87;
        double weightKilos = 98;
        int bodyMassIndex = (int) service.calculate(heightMetres, weightKilos);
        System.out.println("Your BMI is " + bodyMassIndex);
    }
}
