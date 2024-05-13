public class BmiService {
    public int calculate(double heightMetres, double weightKilos) {
        double index;
        index = weightKilos / (heightMetres * heightMetres);
        return (int) index;
    }
}
