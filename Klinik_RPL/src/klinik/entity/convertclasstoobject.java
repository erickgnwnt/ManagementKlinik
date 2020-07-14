/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klinik.entity;
import klinik.exec.ExecutePsn;
import klinik.exec.ExecuteObat;
import klinik.exec.ExecuteJadwal;
import klinik.exec.ExecuteTransaksi;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author HP
 */
public class convertclasstoobject {
    public String[][] getAllpasien(){
        List<pasien> mypsn = new ArrayList<pasien>();
        ExecutePsn epsn = new ExecutePsn();
        mypsn = epsn.getpsn();
        String[][] datapasien = new String[mypsn.size()][7];
        int i=0;
        for(pasien ps : mypsn){
            datapasien[i][0] = ""+ps.getId_pasien();
            datapasien[i][1] = ps.getNama_pasien();
            datapasien[i][2] = ps.getAlamat();
            datapasien[i][3] = ps.getGender();
            datapasien[i][4] = ps.getNo_hp();
            datapasien[i][5] = ps.getPekerjaan();
            datapasien[i][6] = ps.getTanggal_cekup();
            i++;
        }
        return datapasien;
    }
    public String[][] getAllObat(){
       List<obat> myobat = new ArrayList<obat>();
       ExecuteObat eobt = new ExecuteObat();
       myobat = eobt.getobt();
       String[][] dataobat = new String[myobat.size()][4];
       int i=0;
        for(obat br : myobat){
            dataobat[i][0] = ""+br.getId_obat();
            dataobat[i][1] = br.getNama_obat();
            dataobat[i][2] = br.getJenis_obat();
            dataobat[i][3] = ""+br.getHarga();
           i++;
        }
        return dataobat;  
}
    
    public String[][] getAlljadwal(){
       List<jadwal> myjdw = new ArrayList<jadwal>();
       ExecuteJadwal ejdw = new ExecuteJadwal();
       myjdw = ejdw.getjdw();
       String[][] datajadwal = new String[myjdw.size()][5];
       int i=0;
        for(jadwal jd : myjdw){
            datajadwal[i][0] = jd.getId_jadwal();
            datajadwal[i][1] =""+jd.getId_dokter();
            datajadwal[i][2] = jd.getNama_dokter();
            datajadwal[i][3] = jd.getTanggal_praktek();
            datajadwal[i][4]= jd.getSpesialis();
           i++;
        }
        return datajadwal;  
}
    public String[][] getAllTransaksi(){
       List<transaksi> myjdw = new ArrayList<transaksi>();
       ExecuteTransaksi ejdw = new ExecuteTransaksi();
       myjdw = ejdw.gettransaksi();
       String[][] datatransaksi = new String[myjdw.size()][8];
       int i=0;
        for(transaksi jd : myjdw){
            datatransaksi[i][0] = ""+jd.getId_transaksi();
            datatransaksi[i][1] =""+jd.getId_dokter();
            datatransaksi[i][2] = ""+jd.getId_pasien();
            datatransaksi[i][3] = jd.getNama_pasien();
            datatransaksi[i][4] = ""+jd.getId_obat();
            datatransaksi[i][5] = ""+jd.getQty();
            datatransaksi[i][6] = ""+jd.getHarga_obat();
            datatransaksi[i][7] = ""+jd.getTotal_harga();
           i++;
        }
        return datatransaksi;  
}
    
    
}
   // public String[][] getAlldistributor(){
    //    List<Distributor> mydtb = new ArrayList<Distributor>();
      //  ExecuteDtb edtb = new ExecuteDtb();
     //   mydtb = edtb.getdtb();
     //   String[][] datadistributor = new String[mydtb.size()][4];
     //   int i=0;
      //  for(Distributor dt : mydtb){
        //    datadistributor[i][0] = dt.getId_distributor();
          //  datadistributor[i][1] = dt.getNama_distributor();
            //datadistributor[i][2] = dt.getAlamat();
            //datadistributor[i][3] = dt.getNo_telp();
            //i++;
        //}
        //return datadistributor;  
    
    

        

