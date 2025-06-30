
public class Transaction {

    private final int idTransaksi;
    private User pelanggan;
    private Product produk;
    private int jumlahPembelian;
    private double totalHarga;

    public Transaction(int idTransaksi, User pelanggan, Product produk, int jumlahPembelian) {
        this.idTransaksi = idTransaksi;
        this.pelanggan = pelanggan;
        this.produk = produk;
        if (jumlahPembelian > produk.getStock()) {
            System.out.println("Stock tidak cukup");
        } else {
            this.jumlahPembelian = jumlahPembelian;
        }
        totalHarga(jumlahPembelian, produk);
    }

    public void totalHarga(int jumlahPembelian, Product produk) {
        this.totalHarga = jumlahPembelian * produk.getPrice();
    }

    public void displayTransactionInfo() {
        System.out.println("ID Transaksi: " + idTransaksi);
        System.out.println("Pembeli: " + pelanggan.getName());
        System.out.println("Produk: " + produk.getName());
        System.out.println("Jumlah Pembelian: " + jumlahPembelian);
        System.out.println("Harga total: " + totalHarga);
        System.out.println("========================\n");
    }
}
