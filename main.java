public class main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("================== << NV Meneer >> =================== ");
        invoice inv1 = new invoice("J.co", 5, 15);
        invoice inv2 = new invoice("Coffee", 3, 20);
        invoice[] invA = {inv1, inv2};
        employee employee1 = new employee(001, "Jack", 3000, invA);
        employee1.show();
        invoice inv3 = new invoice("liquid", 3, 15);
        invoice inv4 = new invoice("pods", 1, 100);
        invoice[] invB = {inv3, inv4};
        employee employee2 = new employee(002, "Henry", 3500, invB);
        employee2.show();
    }
}