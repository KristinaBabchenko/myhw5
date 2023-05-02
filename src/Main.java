public class Main {
    public static void main(String[] args) {
        {
            BmiService service = new BmiService();

        int kilograms = 107;
        double meters = 1.84;
        int index = service.calculate((int) kilograms,meters); // должно получиться 31
        System.out.println(index);

        }
    }
}