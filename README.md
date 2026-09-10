# Minpro-1-PBO-SistemManajemenPendataanHewanKebunBinatang  
Nama  : Noor Hamsyah Pratama  
NIM  : 2509116046  
Kelas  : B'2025  

## 1. Deskripsi Singkat Program
Program ini adalah aplikasi sederhana berbasis Java yang digunakan untuk mengelola data hewan di sebuah kebun binatang, beserta data perawatannya. Program ini 
menerapkan konsep CRUD (Create, Read, Update, Delete), sehingga pengguna dapat menambah, melihat, mengubah, dan menghapus data hewan secara interaktif melalui 
menu di terminal.

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
   - **Tambah Data Hewan (1)** Pengguna memasukkan data hewan (ID, nama, jenis, umur, habitat) beserta data perawatannya (ID perawatan, jenis perawatan, tanggal).
     Data ini dibungkus menjadi objek `PerawatanHewan`, lalu dimasukkan ke dalam objek `Hewan` baru, dan disimpan melalui `pengelola.tambahHewan()`.
   -  **Lihat Data Hewan (2)** Program memanggil `pengelola.getDaftarHewan()` untuk mengambil seluruh data, lalu menampilkannya satu per satu menggunakan method
     `toString()` pada kelas `Hewan`. Jika daftar kosong, program menampilkan pesan bahwa belum ada data.
   - **Ubah Data Hewan (3)** Pengguna memasukkan ID hewan yang ingin diubah beserta data baru (nama, jenis, umur, habitat, dan data perawatan baru). Data ini
     diproses oleh `pengelola.ubahHewan()`, yang mencari hewan berdasarkan ID; jika ditemukan, data akan diperbarui dan mengembalikan `true`, jika tidak ditemukan
     mengembalikan `false`.
   - **Hapus Data Hewan (4)** Pengguna memasukkan ID hewan yang ingin dihapus. Method `pengelola.hapusHewan()` mencari hewan dengan ID tersebut di dalam
     `ArrayList`; jika ditemukan, data dihapus dan mengembalikan `true`, jika tidak mengembalikan `false`.
   - **Keluar (5)** Program menampilkan pesan penutup, lalu perulangan `do-while` berhenti dan objek `Scanner` ditutup (`input.close()`).

4) `Perulangan` Setelah setiap aksi (kecuali keluar) selesai diproses, program kembali menampilkan menu utama sampai pengguna memilih untuk keluar.


## 3. Demo Program
Berikut simulasi tampilan program saat dijalankan di terminal, mulai dari menambah data, melihat data, mengubah data, menghapus data, hingga keluar dari program
1) **Tampilan Utama**
   
   <img width="412" height="217" alt="image" src="https://github.com/user-attachments/assets/ff757f7e-e7f3-42f7-bb16-0dcb6e1fd029" />

2) **Tambah Data Hewan**

   <img width="482" height="275" alt="image" src="https://github.com/user-attachments/assets/dad4fbd5-66a7-4be3-be2c-88c4b6fe4ecf" />

3) **Lihat Data Hewan**

   <img width="433" height="220" alt="image" src="https://github.com/user-attachments/assets/10c324b7-bfeb-4887-81ff-7c7801d6b262" />

4) **Ubah Data Hewan**
   
   <img width="496" height="293" alt="image" src="https://github.com/user-attachments/assets/3d14cfbd-5ca6-4bc3-8480-a9d286786b6e" />
  
6) **Hapus Data Hewan**

   <img width="378" height="96" alt="image" src="https://github.com/user-attachments/assets/328fe718-ccce-458f-9bad-e10d4867f8d6" />

   Jika ID tidak ditemukan:
   
   <img width="448" height="107" alt="image" src="https://github.com/user-attachments/assets/d23a67de-fa33-4f5c-a238-00cd6210f8cb" />
 
7) **Keluar Program**

   <img width="301" height="22" alt="image" src="https://github.com/user-attachments/assets/a8390707-2e7b-4fd4-a4b2-90a7fd9fb3ee" />

## 4. Nilai Tambah  
a. Access Modifier  
Penerapan access modifier terlihat di seluruh kelas model dan service:  
Pada `Hewan.java` dan `PerawatanHewan.java`, seluruh atribut dideklarasikan dengan modifier private, contoh:

<img width="432" height="202" alt="Screenshot 2026-09-10 171334" src="https://github.com/user-attachments/assets/b60ce2e0-d877-4a6f-8545-b372a9fbd8a2" />

Ini memastikan atribut tidak dapat diakses langsung dari luar kelas, melainkan hanya melalui method yang disediakan.

b. Encapsulation  
Enkapsulasi diterapkan dengan menggabungkan atribut private bersama getter dan setter public pada kelas `Hewan.java` dan `PerawatanHewan.java`, misalnya:  

<img width="407" height="177" alt="image" src="https://github.com/user-attachments/assets/bb369b41-7f3b-4f25-a8be-3b6d7111c33e" />

Dengan pola ini, perubahan data hewan (termasuk objek `PerawatanHewan` yang menjadi bagian dari `Hewan`) hanya dapat dilakukan melalui method yang telah 
disediakan, bukan langsung memanipulasi atribut. Hal ini juga terlihat pada relasi antar objek: `Hewan` memiliki referensi ke `PerawatanHewan` yang diakses 
melalui `getPerawatan()` dan `setPerawatan()`, sehingga struktur data tetap terkontrol dan konsisten.

c. Validasi Input  
Validasi input diterapkan pada proses Ubah dan Hapus data di `PengelolaHewan.java`, di mana program memvalidasi terlebih dahulu apakah ID yang dimasukkan pengguna 
benar-benar ada di dalam data sebelum melakukan perubahan:

<img width="1485" height="357" alt="image" src="https://github.com/user-attachments/assets/5467d6da-e991-40f7-96ab-8a7329a08b76" />

Hasil validasi ini (true/false) kemudian digunakan di Main.java untuk menampilkan pesan yang sesuai kepada pengguna: 

<img width="602" height="117" alt="image" src="https://github.com/user-attachments/assets/5b45e8c6-6458-4372-8c43-9e4aa80377ad" />


Pola yang sama juga diterapkan pada method `hapusHewan()`, sehingga program tidak akan menghapus atau mengubah data secara sembarangan jika ID yang dimasukkan 
tidak valid/tidak ditemukan.
