/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klinik.entity;

/**
 *
 * @author ASUS
 */
public class transaksi {
    private int id_transaksi;
    private int id_dokter;
    private int id_pasien;
    private int id_obat;
    private int harga_obat;
    private int total_harga;
    private String nama_pasien;
    private int qty;
    
    public transaksi() {
    }

    public transaksi(int id_dokter, int id_pasien, int id_obat, int harga_obat, int total_harga, String nama_pasien, int qty) {
        this.id_dokter = id_dokter;
        this.id_pasien = id_pasien;
        this.id_obat = id_obat;
        this.harga_obat = harga_obat;
        this.total_harga = total_harga;
        this.nama_pasien = nama_pasien;
        this.qty = qty;
    }

    public int getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public int getId_dokter() {
        return id_dokter;
    }

    public void setId_dokter(int id_dokter) {
        this.id_dokter = id_dokter;
    }

    public int getId_pasien() {
        return id_pasien;
    }

    public void setId_pasien(int id_pasien) {
        this.id_pasien = id_pasien;
    }

    public int getId_obat() {
        return id_obat;
    }

    public void setId_obat(int id_obat) {
        this.id_obat = id_obat;
    }

    public int getHarga_obat() {
        return harga_obat;
    }

    public void setHarga_obat(int harga_obat) {
        this.harga_obat = harga_obat;
    }

    public int getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(int total_harga) {
        this.total_harga = total_harga;
    }

    public String getNama_pasien() {
        return nama_pasien;
    }

    public void setNama_pasien(String nama_pasien) {
        this.nama_pasien = nama_pasien;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "transaksi{" + "id_transaksi=" + id_transaksi + ", id_dokter=" + id_dokter + ", id_pasien=" + id_pasien + ", id_obat=" + id_obat + ", harga_obat=" + harga_obat + ", total_harga=" + total_harga + ", nama_pasien=" + nama_pasien + ", qty=" + qty + '}';
    }

    
}
