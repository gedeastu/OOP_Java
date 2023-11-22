package SoalTipeC;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Pemesanan
        Pemesanan pemesanan = new Pemesanan("Pemesanan1", "John Doe", "Airplane", "2023-11-22", "2023-11-25", 3);

        // Menambahkan pemesanan ke daftar pemesanan
        List<Pemesanan> daftarPemesanan = new ArrayList<>();
        daftarPemesanan.add(pemesanan);

        // Membuat objek Pegawai
        Pegawai pegawai1 = new Pegawai("Pegawai1", "Bandung", "081234567890");
        Pegawai pegawai2 = new Pegawai("Pegawai2", "Jakarta", "082234567890");

        // Menambahkan pemesanan ke daftar pemesanan masing-masing pegawai
        pegawai1.addPemesanan(pemesanan);

        // Menampilkan daftar pemesanan masing-masing pegawai
        System.out.println("Pegawai 1");
        pegawai1.cetakPemesanan();

        System.out.println("Pegawai 2");
        pegawai2.cetakPemesanan();
    }
}