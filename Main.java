
public class Main {

    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop", 10000000, 7);
        Product p2 = new Product(2, "Smartphone", 5000000, 9);
        Product p3 = new Product(3, "Aksesoris", 50000, 4);

        User u1 = new User(12, "Ismail", "ismail123");
        User u2 = new User(13, "Tegar", "tegar123");
        User u3 = new User(14, "Rwatma", "rwatma123");

        Transaction t1 = new Transaction(1, u3, p3, 2);
        Transaction t2 = new Transaction(2, u1, p2, 2);
        Transaction t3 = new Transaction(3, u2, p1, 2);

        t1.displayTransactionInfo();
        t2.displayTransactionInfo();
        t3.displayTransactionInfo();

        // p1.displayProductInfo();
        // p2.displayProductInfo();
        // p3.displayProductInfo();
        // u1.displayUserInfo();
        // u2.displayUserInfo();
        // u3.displayUserInfo();
    }
}
