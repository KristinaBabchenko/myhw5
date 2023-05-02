public class BmiService {
    public int calculate(int kilograms, int meters) {
        int index;
        index = kilograms /(meters * meters);

        return index;
    }
}
