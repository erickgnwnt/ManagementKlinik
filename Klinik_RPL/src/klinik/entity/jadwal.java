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
public class jadwal {
    private String nama_dokter;
    private String id_jadwal;
    private int id_dokter;
    private String tanggal_praktek;
    private String spesialis;

    public jadwal() {
    }

    public jadwal(String nama_dokter, String id_jadwal, String tanggal_praktek, String spesialis) {
        this.nama_dokter = nama_dokter;
        this.id_jadwal = id_jadwal;
        this.tanggal_praktek = tanggal_praktek;
        this.spesialis = spesialis;
    }
    
    
    

    public jadwal(String nama_dokter, String id_jadwal, int id_dokter, String tanggal_praktek, String spesialis) {
        this.nama_dokter = nama_dokter;
        this.id_jadwal = id_jadwal;
        this.id_dokter = id_dokter;
        this.tanggal_praktek = tanggal_praktek;
        this.spesialis = spesialis;
    }

    public String getNama_dokter() {
        return nama_dokter;
    }

    public void setNama_dokter(String nama_dokter) {
        this.nama_dokter = nama_dokter;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }
    
    

    public String getId_jadwal() {
        return id_jadwal;
    }

    public void setId_jadwal(String id_jadwal) {
        this.id_jadwal = id_jadwal;
    }

    public int getId_dokter() {
        return id_dokter;
    }

    public void setId_dokter(int id_dokter) {
        this.id_dokter = id_dokter;
    }

    public String getTanggal_praktek() {
        return tanggal_praktek;
    }

    public void setTanggal_praktek(String tanggal_praktek) {
        this.tanggal_praktek = tanggal_praktek;
    }

    @Override
    public String toString() {
        return "jadwal{" + "nama_dokter=" + nama_dokter + ", id_jadwal=" + id_jadwal + ", id_dokter=" + id_dokter + ", tanggal_praktek=" + tanggal_praktek + ", spesialis=" + spesialis + '}';
    }
    
    
    


    
    
    
}
