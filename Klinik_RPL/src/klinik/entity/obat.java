/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klinik.entity;

/**
 *
 * @author HP
 */
public class obat {
    private int id_obat;
    private String nama_obat;
    private String jenis_obat;
    private int harga;

    public obat() {
    }

    public obat(int id_obat, String nama_obat, String jenis_obat, int harga) {
        this.id_obat = id_obat;
        this.nama_obat = nama_obat;
        this.jenis_obat = jenis_obat;
        this.harga = harga;
    }

    public obat(String nama_obat, String jenis_obat, int harga) {
        this.nama_obat = nama_obat;
        this.jenis_obat = jenis_obat;
        this.harga = harga;
    }

    public int getId_obat() {
        return id_obat;
    }

    public void setId_obat(int id_obat) {
        this.id_obat = id_obat;
    }

    public String getNama_obat() {
        return nama_obat;
    }

    public void setNama_obat(String nama_obat) {
        this.nama_obat = nama_obat;
    }

    public String getJenis_obat() {
        return jenis_obat;
    }

    public void setJenis_obat(String jenis_obat) {
        this.jenis_obat = jenis_obat;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "obat{" + "id_obat=" + id_obat + ", nama_obat=" + nama_obat + ", jenis_obat=" + jenis_obat + ", harga=" + harga + '}';
    }
    
    
    }
    
    

