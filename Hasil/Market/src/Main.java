public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjangBelanja = new KeranjangBelanja();

        Elektronik elektronik = new Elektronik("Kulkulator", 5000000, 12, 2);
        Pakaian pakaian = new Pakaian("Celana", 200000, 5, "XXL", "Hitam");
        Makanan makanan = new Makanan("Sate", 10000, 20, "2025-01-01");

        // Menambahkan produk dengan jumlah tertentu
        keranjangBelanja.tambahProduk(elektronik, 2);
        keranjangBelanja.tambahProduk(pakaian, 1);
        keranjangBelanja.tambahProduk(makanan, 5);

        keranjangBelanja.displayInfo();
        System.out.println();
    }
}