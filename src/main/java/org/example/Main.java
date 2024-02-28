import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // String bersifat immutable (tidak dapat diubah)
        Scanner input = new Scanner(System.in); //deklarasi dan inisialisasi objek dari kelas

        System.out.println("Selamat datang!"); //println menampilkan teks garis baru pd akhir teks
        System.out.println("Silakan login sebagai:");
        System.out.println("1. Mahasiswa");
        System.out.println("2. Admin");
        System.out.print("Pilih jenis user (1/2): "); //print menampilkan teks apa adanya
        int userType = input.nextInt();
        input.nextLine();  // Clear the buffer

        if (userType == 1) {
            // Mahasiswa Login
            System.out.print("Masukkan NIM (maksimal 15 karakter): ");
            String nim = input.nextLine();
            if (nim.length() <= 15) {
                System.out.println("Login mahasiswa berhasil!");
            } else {
                System.out.println("NIM melebihi 15 karakter. Coba lagi.");
            }
        } else if (userType == 2) {
            // Admin Login
            System.out.print("Masukkan username: ");
            String username = input.nextLine();
            System.out.print("Masukkan password: ");
            String password = input.nextLine();

            // Cek admin credentials
            if (username.equals("admin") && password.equals("admin123")) {
                System.out.println("Login admin berhasil!");
            } else {
                System.out.println("Username atau password admin salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}
