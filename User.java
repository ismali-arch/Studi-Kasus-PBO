
public class User {

    private final  int userId;
    private String name;
    private String email;
    private static int jumlahPelangggan;

    public User(int userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        jumlahPelangggan++;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.userId;
    }

    public void displayUserInfo() {
        System.out.println("User ID: " + userId);
        System.out.println("Nama: " + name);
        System.out.println("Email: " + email);
        System.out.println("=================\n");
    }
}
