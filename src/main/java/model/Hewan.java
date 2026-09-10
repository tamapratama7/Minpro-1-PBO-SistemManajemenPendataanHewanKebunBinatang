/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class Hewan {
    
    //Atribut
    private int id;
    private String nama;
    private String jenis;
    private int umur;
    private String habitat;
    private PerawatanHewan perawatan;
    
    //Constructor
    public Hewan(int id, String nama, String jenis, int umur, String habitat, PerawatanHewan perawatan) {
        this.id = id;
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
        this.habitat = habitat;
        this.perawatan = perawatan;
    }
    
    //Getter dan Setter
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    //Getter dan Setter jenis
    public String getJenis() {
        return jenis;
    }
   
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    public int getUmur() {
        return umur;
    }
        
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public String getHabitat() {
        return habitat;
    }
    
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    public PerawatanHewan getPerawatan() {
        return perawatan;
    }
    
    public void setPerawatan(PerawatanHewan perawatan) {
        this.perawatan = perawatan;
    }
    
    @Override
    public String toString() {
        return "ID: " + id +
               ", Nama: " + nama +
               ", Jenis: " + jenis +
               ", Umur: " + umur +
               ", Habitat: " + habitat;
    }
}
