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
import klinik.entity.obat;

/**
 *
 * @author ASUS
 */
public class ExecuteObat {
    public List<obat> getobt(){
        List<obat> listobt = new ArrayList<>();
        String query = "select * from obat";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
      try {
          Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
         while(rs.next()){
           obat obt = new obat();
            obt.setId_obat(rs.getInt("id_obat"));
            obt.setNama_obat(rs.getString("nama_obat"));
            obt.setJenis_obat(rs.getString("jenis_obat"));
            obt.setHarga(rs.getInt("harga"));
            listobt.add(obt);
    }
        } catch (SQLException ex) {
        Logger.getLogger(ExecutePsn.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listobt;
    }

    public int insertobt(obat obt){
        int hasil = 0;
        String query = "Insert into obat(nama_obat, jenis_obat,harga)"
        + "value('"+obt.getNama_obat()+"','"+obt.getJenis_obat()+"',"+obt.getHarga()+")";
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

 public int deleteobt(String delId_obat){
    int hasil = 0;
    String query = "delete from obat where Id_obat="+ delId_obat+"";
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

 public int updateobat(obat newobt){
    int hasil = 0;
    String query = "update obat set nama_obat='"+newobt.getNama_obat()+"',jenis_obat='"+
    newobt.getJenis_obat()+"',harga ="+ newobt.getHarga()+" where id_obat = "+newobt.getId_obat()+" ";
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
