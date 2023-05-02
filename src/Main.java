public class Main {
    public static void main(String[] args) {
        {
            BmiService service = new BmiService();

        int kilograms = 107;
        int meters = 2;
        int index = service.calculate(kilograms,meters); // должно получиться 26
        System.out.println(index);

        }
    }
}