/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ASUS
 */

import java.util.Scanner;
import model.Hewan;
import model.PerawatanHewan;
import service.PengelolaHewan;

public class Main {
    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      PengelolaHewan pengelola = new PengelolaHewan();
      
      int pilihan;
      
      do {
          System.out.println("\n=========================================");
          System.out.println("  SISTEM PENDATAAN HEWAN KEBUN BINATANG  ");
          System.out.println("=========================================");
          System.out.println("1. Tambah Data Hewan");
          System.out.println("2. Lihat Data Hewan");
          System.out.println("3. Ubah Data Hewan");
          System.out.println("4. Hapus Data Hewan");
          System.out.println("5. Keluar");
          System.out.println("==========================================");
          System.out.print("Pilih menu: ");
          pilihan = input.nextInt();
          input.nextLine();
          
          switch (pilihan) {
                case 1:
                    System.out.println("\n=== TAMBAH DATA HEWAN ===");

                    System.out.print("Masukkan ID hewan: ");
                    int idBaru = input.nextInt();
                    input.nextLine();

                    System.out.print("Masukkan nama hewan: ");
                    String namaBaru = input.nextLine();

                    System.out.print("Masukkan jenis hewan: ");
                    String jenisBaru = input.nextLine();

                    System.out.print("Masukkan umur hewan: ");
                    int umurBaru = input.nextInt();
                    input.nextLine();

                    System.out.print("Masukkan habitat hewan: ");
                    String habitatBaru = input.nextLine();

                    System.out.println("\n=== DATA PERAWATAN ===");

                    System.out.print("Masukkan ID perawatan: ");
                    int idPerawatanBaru = input.nextInt();
                    input.nextLine();

                    System.out.print("Masukkan jenis perawatan: ");
                    String jenisPerawatanBaru = input.nextLine();

                    System.out.print("Masukkan tanggal perawatan (dd-mm-yyyy): ");
                    String tanggalBaru = input.nextLine();

                    PerawatanHewan perawatanBaru = new PerawatanHewan(
                            idPerawatanBaru,
                            jenisPerawatanBaru,
                            tanggalBaru
                    );

                    Hewan hewanBaru = new Hewan(
                            idBaru,
                            namaBaru,
                            jenisBaru,
                            umurBaru,
                            habitatBaru,
                            perawatanBaru
                    );

                    pengelola.tambahHewan(hewanBaru);

                    System.out.println("\nData hewan dan perawatan berhasil ditambahkan!");
                    break;

                case 2:
                     System.out.println("\n=== DATA HEWAN ===");

                    if (pengelola.getDaftarHewan().isEmpty()) {

                        System.out.println("Belum ada data hewan.");

                    } else {

                        for (Hewan dataHewan : pengelola.getDaftarHewan()) {

                            System.out.println("\n--------------------------");
                            System.out.println(dataHewan);
                            System.out.println("--------------------------");
                        }
                    }

                    break;

                case 3:
                   System.out.println("\n=== UBAH DATA HEWAN ===");

                    System.out.print("Masukkan ID hewan yang ingin diubah: ");
                    int idUbah = input.nextInt();
                    input.nextLine();

                    System.out.print("Masukkan nama hewan baru: ");
                    String namaUbah = input.nextLine();

                    System.out.print("Masukkan jenis hewan baru: ");
                    String jenisUbah = input.nextLine();

                    System.out.print("Masukkan umur hewan baru: ");
                    int umurUbah = input.nextInt();
                    input.nextLine();

                    System.out.print("Masukkan habitat hewan baru: ");
                    String habitatUbah = input.nextLine();

                    System.out.println("\n=== DATA PERAWATAN BARU ===");

                    System.out.print("Masukkan ID perawatan baru: ");
                    int idPerawatanUbah = input.nextInt();
                    input.nextLine();

                    System.out.print("Masukkan jenis perawatan baru: ");
                    String jenisPerawatanUbah = input.nextLine();

                    System.out.print("Masukkan tanggal perawatan baru: ");
                    String tanggalUbah = input.nextLine();

                    PerawatanHewan perawatanUbah = new PerawatanHewan(
                            idPerawatanUbah,
                            jenisPerawatanUbah,
                            tanggalUbah
                    );

                    boolean berhasilUbah = pengelola.ubahHewan(
                            idUbah,
                            namaUbah,
                            jenisUbah,
                            umurUbah,
                            habitatUbah,
                            perawatanUbah
                    );

                    if (berhasilUbah) {
                        System.out.println("\nData hewan berhasil diubah!");
                    } else {
                        System.out.println("\nID hewan tidak ditemukan.");
                    }

                    break;

                case 4:
                     System.out.println("\n=== HAPUS DATA HEWAN ===");

                    System.out.print("Masukkan ID hewan yang ingin dihapus: ");
                    int idHapus = input.nextInt();
                    input.nextLine();

                    boolean berhasilHapus = pengelola.hapusHewan(idHapus);

                    if (berhasilHapus) {
                        System.out.println("\nData hewan berhasil dihapus!");
                    } else {
                        System.out.println("\nID hewan tidak ditemukan.");
                    }

                    break;

                case 5:
                    System.out.println("\nProgram selesai. Terima kasih!");
                    break;

                default:
             System.out.println("\nPilihan menu tidak tersedia.");
                    break;
                   }

        } while (pilihan != 5);

        input.close();
    }
}
