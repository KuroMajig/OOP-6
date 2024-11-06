public class Main {
    public static void main(String[] args) {
        System.out.println();

        Manager manager = new Manager("KuroMajig", 3000000, 1000000);
        manager.cetakInfo();
        System.out.println();

        Programmer programmer = new Programmer("Keera", 5000000, 1000000);
        programmer.cetakInfo();
        System.out.println();
    }
}