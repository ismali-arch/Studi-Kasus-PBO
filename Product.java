
public class Product {

    private final int id;
    private String name;
    private double price;
    private int stock;
    private static int jumlahProduk;

    public Product(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        setPrice(price);
        setStock(stock);
        jumlahProduk++;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(double harga) {
        if (harga < 0) {
            System.out.println("Harga tidak boleh negatif");
        } else {
            this.price = harga;
        }
    }

    public double getPrice() {
        return this.price;
    }

    public void setStock(int stok) {
        if (stock < 0) {
            System.out.println("Stock tidak boleh negatif");
        } else {
            this.stock = stok;
        }
    }

    public int getStock() {
        return this.stock;
    }

    public void displayProductInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nama: " + name);
        System.out.println("Harga: " + price);
        System.out.println("Stok: " + stock);
        System.out.println("=================\n");
    }
}
