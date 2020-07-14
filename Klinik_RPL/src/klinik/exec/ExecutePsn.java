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
import klinik.entity.pasien;

/**
 *
 * @author HP
 */
public class ExecutePsn {
    
    public List<pasien> getpsn(){
        List<pasien> listpsn = new ArrayList<>();
        String query = "select * from pasien";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
      try {
          Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
         while(rs.next()){
           pasien psn = new pasien();
            psn.setId_pasien(rs.getInt("id_pasien"));
            psn.setNama_pasien(rs.getString("nama"));
            psn.setAlamat(rs.getString("Alamat"));
            psn.setGender(rs.getString("Gender"));
            psn.setNo_hp(rs.getString("no_hp"));
            psn.setPekerjaan(rs.getString("pekerjaan"));
            psn.setTanggal_cekup(rs.getString("Tanggal_cekup"));
            listpsn.add(psn);
    }
        } catch (SQLException ex) {
        Logger.getLogger(ExecutePsn.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listpsn;
    }

    public int insertpsn(pasien psn){
        int hasil = 0;
        String query = "Insert into pasien(id_pasien, nama, alamat,gender,no_hp,pekerjaan,tanggal_cekup)"
        + "value("+ psn.getId_pasien()+",'"+
        psn.getNama_pasien()+"','"+psn.getAlamat()+"','"+psn.getGender()+"','"+psn.getNo_hp()+"','"+psn.getPekerjaan()+"','"+psn.getTanggal_cekup()+"')";
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

 public int deletepsn(String delId_pasien){
    int hasil = 0;
    String query = "delete from pasien where Id_pasien="+ delId_pasien+"";
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

 public int updatepsn(pasien newpsn){
    int hasil = 0;
    String query = "update pasien set nama='"+newpsn.getNama_pasien()+"',alamat='"+
    newpsn.getAlamat()+"',no_hp ='"+ newpsn.getNo_hp()+"',pekerjaan ='"+newpsn.getPekerjaan()+"',tanggal_cekup ='"+newpsn.getTanggal_cekup()+"' where id_pasien = "+
    newpsn.getId_pasien()+" ";
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
    
