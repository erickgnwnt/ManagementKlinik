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
public class pasien {
    private int id_pasien;
    private String nama_pasien;
    private String alamat;
    private String gender;
    private String no_hp;
    private String pekerjaan;
    private String tanggal_cekup;

    public pasien() {
    }

    public pasien(String nama_pasien, String alamat, String gender, String no_hp, String pekerjaan) {
        this.nama_pasien = nama_pasien;
        this.alamat = alamat;
        this.gender = gender;
        this.no_hp = no_hp;
        this.pekerjaan = pekerjaan;
    }

    public pasien(int id_pasien, String nama_pasien, String alamat, String gender, String no_hp, String pekerjaan, String tanggal_cekup) {
        this.id_pasien = id_pasien;
        this.nama_pasien = nama_pasien;
        this.alamat = alamat;
        this.gender = gender;
        this.no_hp = no_hp;
        this.pekerjaan = pekerjaan;
        this.tanggal_cekup = tanggal_cekup;
    }

    public pasien(String nama_pasien, String alamat, String gender, String no_hp, String pekerjaan, String tanggal_cekup) {
        this.nama_pasien = nama_pasien;
        this.alamat = alamat;
        this.gender = gender;
        this.no_hp = no_hp;
        this.pekerjaan = pekerjaan;
        this.tanggal_cekup = tanggal_cekup;
    }
    

    public int getId_pasien() {
        return id_pasien;
    }

    public void setId_pasien(int id_pasien) {
        this.id_pasien = id_pasien;
    }

    public String getNama_pasien() {
        return nama_pasien;
    }

    public void setNama_pasien(String nama_pasien) {
        this.nama_pasien = nama_pasien;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getTanggal_cekup() {
        return tanggal_cekup;
    }

    public void setTanggal_cekup(String tanggal_cekup) {
        this.tanggal_cekup = tanggal_cekup;
    }

    @Override
    public String toString() {
        return "pasien{" + "id_pasien=" + id_pasien + ", nama_pasien=" + nama_pasien + ", alamat=" + alamat + ", gender=" + gender + ", no_hp=" + no_hp + ", pekerjaan=" + pekerjaan + ", tanggal_cekup=" + tanggal_cekup + '}';
    }
    


    
    
    
    
    
    
    
    
}
