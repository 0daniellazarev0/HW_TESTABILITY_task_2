public class BmiService {
    public double calculate(double heightMetres, double weightKilos) {
        double index;
        index = weightKilos / (heightMetres * heightMetres);
        int finalIndex = (int) index;
        return finalIndex;
    }
}
