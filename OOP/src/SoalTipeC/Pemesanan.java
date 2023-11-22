package SoalTipeC;

// Kelas Pemesanan
public class Pemesanan {
    private String idPemesanan;
    private String namaPembeli;
    private String jenisKendaraan;
    private String tanggalPemesanan;
    private String tanggalPenyewaan;
    private Integer lamaSewa;
    private Double hargaTotal;

    public Pemesanan(String idPemesanan, String namaPembeli, String jenisKendaraan, String tanggalPemesanan, String tanggalPenyewaan, Integer lamaSewa) {
        this.idPemesanan = idPemesanan;
        this.namaPembeli = namaPembeli;
        this.jenisKendaraan = jenisKendaraan;
        this.tanggalPemesanan = tanggalPemesanan;
        this.tanggalPenyewaan = tanggalPenyewaan;
        this.lamaSewa = lamaSewa;

        // Hitung harga total
        hargaTotal = hargaSewaPerHari(jenisKendaraan) * lamaSewa;
    }

    public String getIdPemesanan() {
        return idPemesanan;
    }

    public void setIdPemesanan(String idPemesanan) {
        this.idPemesanan = idPemesanan;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getTanggalPemesanan() {
        return tanggalPemesanan;
    }

    public void setTanggalPemesanan(String tanggalPemesanan) {
        this.tanggalPemesanan = tanggalPemesanan;
    }

    public String getTanggalPenyewaan() {
        return tanggalPenyewaan;
    }

    public void setTanggalPenyewaan(String tanggalPenyewaan) {
        this.tanggalPenyewaan = tanggalPenyewaan;
    }

    public Integer getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(Integer lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

    public Double getHargaTotal() {
        return hargaTotal;
    }

    public void setHargaTotal(Double hargaTotal) {
        this.hargaTotal = hargaTotal;
    }

    public Double hargaSewaPerHari(String jenisKendaraan) {
        if (jenisKendaraan.equals("Airplane")) {
            return 1000000;
        } else if (jenisKendaraan.equals("Helicopter")) {
            return 500000;
        } else if (jenisKendaraan.equals("Boat")) {
            return 200000;
        } else {
            return 0;
        }
    }

    public void cetakPemesanan() {
        System.out.println("ID Pemesanan: " + idPemesanan);
        System.out.println("Nama Pembeli: " + namaPembeli);
        System.out.println("Jenis Kendaraan: " + jenisKendaraan);
        System.out.println("Tanggal Pemesanan: " + tanggalPemesanan);
        System.out.println("Tanggal Penyewaan: " + tanggalPenyewaan);
        System.out.println("Lama Sewa: " + lamaSewa);
        System.out.println("Harga Total: " + hargaTotal);
    }
}
