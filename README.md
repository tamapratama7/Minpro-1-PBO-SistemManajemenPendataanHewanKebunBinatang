# Minpro-1-PBO-SistemManajemenPendataanHewanKebunBinatang  
Nama  : Noor Hamsyah Pratama  
NIM  : 2509116046  
Kelas  : B'2025  

## 1. Deskripsi Singkat Program
Program ini adalah aplikasi sederhana berbasis Java yang digunakan untuk mengelola data hewan di sebuah kebun binatang, beserta data perawatannya. Program ini menerapkan konsep CRUD (Create, Read, Update, Delete), sehingga pengguna dapat menambah, melihat, mengubah, dan menghapus data hewan secara interaktif melalui menu di terminal.

Setiap data hewan memiliki relasi dengan data perawatan, yang mencatat jenis perawatan dan tanggal perawatan hewan tersebut.  

### Struktur Program  
| File | Package | Fungsi |
|---|---|---|
| `Main.java` | main | Titik masuk program (entry point), menampilkan menu dan menangani input pengguna |
| `Hewan.java` | model | Kelas model yang merepresentasikan data hewan |
| `PerawatanHewan.java` | model | Kelas model yang merepresentasikan data perawatan hewan |
| `PengelolaHewan.java` | service | Kelas service yang mengelola logika CRUD terhadap koleksi data hewan |  

## 2. Penjelasan Alur Program  
1) Tampilan Menu Program menampilkan menu utama berulang kali (menggunakan struktur `do-while`) hingga pengguna memilih opsi Keluar (5).
   Menu yang tersedia:
   ```text
   =========================================
    SISTEM PENDATAAN HEWAN KEBUN BINATANG  
    =========================================
    1. Tambah Data Hewan
    2. Lihat Data Hewan
    3. Ubah Data Hewan
    4. Hapus Data Hewan
    5. Keluar
    ==========================================
   ```
2) Proses Tiap Menu
   - **Tambah Data Hewan (1)** Pengguna memasukkan data hewan (ID, nama, jenis, umur, habitat) beserta data perawatannya (ID perawatan, jenis perawatan, tanggal). Data ini dibungkus menjadi objek `PerawatanHewan`, lalu dimasukkan ke dalam objek `Hewan` baru, dan disimpan melalui `pengelola.tambahHewan()`.
   -  **Lihat Data Hewan (2)** Program memanggil `pengelola.getDaftarHewan()` untuk mengambil seluruh data, lalu menampilkannya satu per satu menggunakan method `toString()` pada kelas `Hewan`. Jika daftar kosong, program menampilkan pesan bahwa belum ada data.
   - **Ubah Data Hewan (3)** Pengguna memasukkan ID hewan yang ingin diubah beserta data baru (nama, jenis, umur, habitat, dan data perawatan baru). Data ini diproses oleh `pengelola.ubahHewan()`, yang mencari hewan berdasarkan ID; jika ditemukan, data akan diperbarui dan mengembalikan `true`, jika tidak ditemukan mengembalikan `false`.
   - **Hapus Data Hewan (4)** Pengguna memasukkan ID hewan yang ingin dihapus. Method `pengelola.hapusHewan()` mencari hewan dengan ID tersebut di dalam `ArrayList`; jika ditemukan, data dihapus dan mengembalikan `true`, jika tidak mengembalikan `false`.
   - Keluar (5) Program menampilkan pesan penutup, lalu perulangan
