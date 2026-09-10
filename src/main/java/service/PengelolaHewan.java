/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author ASUS
 */

import java.util.ArrayList;
import model.Hewan;
import model.PerawatanHewan;

public class PengelolaHewan {

    private ArrayList<Hewan> daftarHewan;
    
    //Constructor
    public PengelolaHewan() {
        daftarHewan = new ArrayList<>();
    }
    
    
    //C
    public void tambahHewan(Hewan hewan) {
        daftarHewan.add(hewan);
    }
    
    //R
    public ArrayList<Hewan> getDaftarHewan() {
        return daftarHewan;
    }
    
    //U
    public boolean ubahHewan(int id, String nama, String jenis, int umur, String habitat, model.PerawatanHewan perawatan) {
        for (Hewan hewan : daftarHewan) {
            if (hewan.getId() == id) {
                hewan.setNama(nama);
                hewan.setJenis(jenis);
                hewan.setUmur(umur);
                hewan.setHabitat(habitat);
                hewan.setPerawatan(perawatan);
                return true;
            }
        }
        return false;
    }
    
    //D
    public boolean hapusHewan(int id) {
        for (Hewan hewan : daftarHewan) {
            if (hewan.getId() == id) {
                daftarHewan.remove(hewan);
                return true;
            }
        }
        return false;
    }
}

