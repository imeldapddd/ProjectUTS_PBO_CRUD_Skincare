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
import java.util.Scanner;

// Kelas PenjualanSkincareView untuk menampilkan interaksi dengan pengguna untuk melakukan CRUD pada produk skincare
public class PenjualanSkincareView {
    private PenjualanSkincare penjualan;
    private Scanner input;

    public PenjualanSkincareView() {
        penjualan = new PenjualanSkincare();
        input = new Scanner(System.in);
    }

    public void menuUtama() {
        while (true) {
            System.out.println("=== Menu Utama ===");
            System.out.println("1. Tambah Skincare");
            System.out.println("2. Lihat Skincare");
            System.out.println("3. Update Skincare");
            System.out.println("4. Hapus Skincare");
            System.out.println("5. Tambah Skincare dengan Diskon");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu (1-6): ");
            int pilihan = input.nextInt();
            input.nextLine(); // Membersihkan newline

            switch (pilihan) {
                case 1:
                    tambahSkincare();
                    break;
                case 2:
                    penjualan.showSkincare();
                    break;
                case 3:
                    updateSkincare();
                    break;
                case 4:
                    hapusSkincare();
                    break;
                case 5:
                    tambahSkincareDiskon();
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private void tambahSkincare() {
        System.out.print("Nama Skincare : ");
        String nama = input.nextLine();
                
        System.out.print("Harga         : ");
        double harga = input.nextDouble();
        System.out.print("Stok          : ");
        int stok = input.nextInt();

        penjualan.addSkincare(nama, harga, stok);

        // Menyimpan nama produk yang berhasil ditambahkan
        String namaProduk = nama; // default menggunakan nama yang dimasukkan

        // Ubah pesan berhasil ditambahkan dengan nama produk yang berhasil ditambahkan
        String pesanBerhasil = namaProduk + " Berhasil Ditambahkan.";
    }

        private void tambahSkincareDiskon() {
        System.out.print("Nama Skincare : ");
        String nama = input.nextLine();
        System.out.print("Harga         : ");
        double harga = input.nextDouble();
        input.nextLine(); // Membersihkan newline yang tersisa di dalam buffer
        System.out.print("Stok          : ");
        int stok = input.nextInt();
        System.out.print("Diskon (%)    : ");
        double diskon = input.nextDouble();

        penjualan.addSkincareDiskon(nama, harga, stok, diskon);

        // Menyimpan nama produk yang berhasil ditambahkan dengan diskon
        String namaProduk = nama; // default menggunakan nama yang dimasukkan

        // Ubah pesan berhasil ditambahkan dengan nama produk yang berhasil ditambahkan dan diskon
        String pesanBerhasil = namaProduk + " dengan diskon berhasil ditambahkan.";
        System.out.println(pesanBerhasil);
    }




    private void updateSkincare() {
        System.out.print("ID Skincare yang akan diupdate: ");
        int id = input.nextInt();
        input.nextLine(); // Membersihkan newline
        System.out.print("Nama Baru     : ");
        String nama = input.nextLine();
        System.out.print("Harga Baru    : ");
        double harga = input.nextDouble();
        System.out.print("Stok Baru: ");
        int stok = input.nextInt();
        penjualan.updateSkincare(id, nama, harga, stok);
    }

    private void hapusSkincare() {
        System.out.print("ID Skincare yang akan dihapus: ");
        int id = input.nextInt();
        penjualan.hapusSkincare(id);
    }

    public static void main(String[] args) {
        PenjualanSkincareView view = new PenjualanSkincareView();
        view.menuUtama();
    }
}
