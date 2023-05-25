public class employee implements payable {
    private int registrationNumber;
    private String name;
    private int salary;
    private invoice[] inv;
    employee(int registrationNumber, String name, int salary, invoice[] inv){
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salary = salary;
        this.inv = inv;
    }
    public invoice[] getInv() {
        return inv;
    }
    @Override
    public double getPayableAmount(){
        double totalInv = 0;
        for (invoice invoice : inv) {
            totalInv += invoice.getPayableAmount();
        }
        return this.salary - totalInv;
    }
    public void show(){
        System.out.println("\n\nNama Karyawan\t\t: " + this.name);
        System.out.println("Nomor Registrasi\t: " + this.registrationNumber);
        System.out.println("Gaji\t\t\t\t: " + this.salary);
        System.out.println("=====================================================================");
        System.out.println("Nama produk\t\t|\t\tjumlah\t\t|\tharga per item\t|\tsubtotal\t|");
        for(invoice inv: getInv()){
            System.out.println("_________________________________________________________________________");
            System.out.println(inv.getProductName()+"\t\t\t\t\t\t"+inv.getQuantity()+"\t\t\t\t"+inv.getPricePerItem()+"\t\t\t\t"+inv.getQuantity()*inv.getPricePerItem());
        }
        System.out.println();
        System.out.println("Setelah potong gaji\t: "+ this.getPayableAmount());
        System.out.println("=====================================================================");
    }
}