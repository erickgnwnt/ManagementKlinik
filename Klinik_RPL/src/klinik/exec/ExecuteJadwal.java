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
import klinik.entity.jadwal;

/**
 *
 * @author HP
 */
public class ExecuteJadwal {
    
    public List<jadwal> getjdw(){
        List<jadwal> listjdw = new ArrayList<>();
        String query = "select * from jadwal";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
      try {
          Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
         while(rs.next()){
            jadwal jdw = new jadwal();
            jdw.setId_jadwal(rs.getString("id_jadwal"));
            jdw.setNama_dokter(rs.getString("nama_dokter"));
            jdw.setSpesialis(rs.getString("spesialis"));
            jdw.setId_dokter(rs.getInt("id_dokter"));
            jdw.setTanggal_praktek(rs.getString("Tanggal_praktek"));
            listjdw.add(jdw);
    }
        } catch (SQLException ex) {
        Logger.getLogger(ExecutePsn.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listjdw;
    }

    public int insertjdw(jadwal jdw){
        int hasil = 0;
        String query = "Insert into jadwal(id_jadwal,id_dokter,tanggal_praktek,nama_dokter,spesialis)"
        + "value('"+ jdw.getId_jadwal()+"',"+
        jdw.getId_dokter()+",'"+jdw.getTanggal_praktek()+"','"+jdw.getNama_dokter()+"','"+jdw.getSpesialis()+"')";
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

 public int deletejdw(String delId_jadwal){
    int hasil = 0;
    String query = "delete from jadwal where Id_jadwal='"+ delId_jadwal+"'";
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

 public int updatejdw(jadwal newjdw){
    int hasil = 0;
    String query = "update jadwal set tanggal_praktek ='"+newjdw.getTanggal_praktek()+"',nama_dokter='"+
    newjdw.getNama_dokter()+"',spesialis ='"+ newjdw.getSpesialis()+"',id_dokter ="+newjdw.getId_dokter()+" where id_jadwal = '"+
    newjdw.getId_jadwal()+"' ";
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
    
