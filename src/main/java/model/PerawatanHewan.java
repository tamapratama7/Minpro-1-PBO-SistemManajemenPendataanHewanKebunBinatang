/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class PerawatanHewan {
    
    //Atribut
    private int idPerawatan;
    private String jenisPerawatan;
    private String tanggal;
    
    //Constructor
    public PerawatanHewan(int idPerawatan, String jenisPerawatan, String tanggal) {
        this.idPerawatan = idPerawatan;
        this.jenisPerawatan = jenisPerawatan;
        this.tanggal = tanggal;
    }
    
    //Getter dan Setter
    public int getIdPerawatan() {
        return idPerawatan;
    }
    
    public void setIdPerawatan(int idPerawatan) {
        this.idPerawatan = idPerawatan; 
    }
    
    public String getJenisPerawatan() {
        return jenisPerawatan;
    }
    
    public void setJenisPerawatan(String jenisPerawatan) {
        this.jenisPerawatan = jenisPerawatan;
    }
    
    public String getTanggal() {
        return tanggal;
    }
    
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
    @Override
    public String toString() {
        return jenisPerawatan + " (" + tanggal +")";
    }
}
