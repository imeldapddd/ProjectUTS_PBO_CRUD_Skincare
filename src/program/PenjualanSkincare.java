/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

/**
 *
 * @author imeld
 */
// Import package yang diperlukan
import java.util.ArrayList;
import java.util.List;

// Kelas PenjualanSkincare untuk mengelola data penjualan produk skincare
public class PenjualanSkincare {
    private List<Skincare> daftarSkincare;

    public PenjualanSkincare() {
        daftarSkincare = new ArrayList<>();
    }

    // Metode untuk menambahkan produk skincare
    public void addSkincare(String nama, double harga, int stok) {
        int id = daftarSkincare.size() + 1;
        Skincare skincare = new Skincare(id, nama, harga, stok);
        daftarSkincare.add(skincare);
    }

    // Metode untuk menampilkan daftar produk skincare
    public void showSkincare() {
        System.out.println("Daftar Skincare:");
        for (Skincare skincare : daftarSkincare) {
            System.out.println("ID  : " + skincare.getId() + "\nNama    : " + skincare.getNama() +
                    "\nHarga    : " + skincare.getHarga() + "\nStok     : " + skincare.getStok() + "\n");
        }
    }

    // Metode untuk mengupdate produk skincare
    public void updateSkincare(int id, String nama, double harga, int stok) {
        String namaProduk = ""; // Untuk menyimpan nama produk yang diupdate

        for (Skincare skincare : daftarSkincare) {
            if (skincare.getId() == id) {
                skincare.setNama(nama);
                skincare.setHarga(harga);
                skincare.setStok(stok);
                namaProduk = skincare.getNama(); // Mengambil nama produk yang diupdate
                break; // Keluar dari loop setelah menemukan produk
            }
        }

        if (!namaProduk.isEmpty()) {
            System.out.println(namaProduk + " berhasil diupdate.");
        } else {
            System.out.println("Skincare dengan ID " + id + " tidak ditemukan.");
        }
    }

    // Metode untuk menghapus produk skincare
    public void hapusSkincare(int id) {
        String namaProduk = ""; // Untuk menyimpan nama produk yang dihapus

        for (int i = 0; i < daftarSkincare.size(); i++) {
            if (daftarSkincare.get(i).getId() == id) {
                namaProduk = daftarSkincare.get(i).getNama(); // Mengambil nama produk yang dihapus
                daftarSkincare.remove(i);
                System.out.println(namaProduk + " berhasil dihapus.");
                return;
            }
        }

        System.out.println("Skincare dengan ID " + id + " tidak ditemukan.");
    }

    // Metode untuk menambahkan produk skincare dengan diskon
    public void addSkincareDiskon(String nama, double harga, int stok, double diskon) {
        int id = daftarSkincare.size() + 1;
        ProdukDiskon diskonSkincare = new ProdukDiskon(id, nama, harga, stok, diskon);
        daftarSkincare.add(diskonSkincare);
    }
}