public class BmiService {
    public int calculate(int kilograms, double meters) {
        int index;
        index = (int) (kilograms /Math.pow (meters, 2));

        return index;
    }
}
