/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klinik.exec;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import klinik.db.ConnectionManager;
import klinik.entity.transaksi;

/**
 *
 * @author ASUS
 */
public class ExecuteTransaksi {
   public List<transaksi> gettransaksi(){
        List<transaksi> listtransaksi = new ArrayList<>();
        String query = "select * from transaksipasien";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
      try {
          Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
         while(rs.next()){
           transaksi tf = new transaksi();
            tf.setId_transaksi(rs.getInt("id_transaksipasien"));
            tf.setId_dokter(rs.getInt("id_dokter"));
            tf.setId_pasien(rs.getInt("id_pasien"));
            tf.setNama_pasien(rs.getString("nama_pasien"));
            tf.setId_obat(rs.getInt("id_obat"));
            tf.setQty(rs.getInt("qty"));
            tf.setHarga_obat(rs.getInt("harga_obat"));
            tf.setTotal_harga(rs.getInt("total_harga"));
            listtransaksi.add(tf);
    }
        } catch (SQLException ex) {
        Logger.getLogger(ExecutePsn.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listtransaksi;
    }

    public int inserttf(transaksi tf){
        int hasil = 0;
        String query = "Insert into transaksipasien(id_dokter, id_pasien, nama_pasien, id_obat,qty,harga_obat, total_harga)"
        + "value("+ tf.getId_dokter()+","+tf.getId_pasien()+",'"+tf.getNama_pasien()+"',"+tf.getId_obat()+","+tf.getQty()+","
        +tf.getHarga_obat()+","+tf.getTotal_harga()+")";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
     try {
     Statement stm = conn.createStatement();
    hasil = stm.executeUpdate(query);
    } catch (SQLException ex) {
    Logger.getLogger(ExecutePsn.class.getName()).log(Level.SEVERE, null, ex);
    }
    conMan.logOff();

    return hasil;
 }

 public int deletetf(String delId_pasien){
    int hasil = 0;
    String query = "delete from transaksipasien where id_transaksipasien="+ delId_pasien+"";
    ConnectionManager conMan = new ConnectionManager();
    Connection conn = conMan.logOn();
    try {
    Statement stm = conn.createStatement();
    hasil = stm.executeUpdate(query);
    } catch (SQLException ex) {
     Logger.getLogger(ExecutePsn.class.getName()).log(Level.SEVERE, null, ex);
    }
     conMan.logOff();
 return hasil;
 }
 
}
