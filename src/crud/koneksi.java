/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection;
import java.sql.DriverManager; //menghubungkan ke mysql
import java.sql.PreparedStatement; //untuk CRUD

/**
 *
 * @author NUR AL BAR BASKORO
 */
public class koneksi {
    private String database_name = "2210010483_nur_al_bar_baskoro";
    private String username = "root";
    private String password = "";
    public Connection koneksiDB;
    
    public koneksi(){
    
        try {  
            String lokasi = "jdbc:mysql://localhost/" + database_name;
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksiDB = DriverManager.getConnection(lokasi, username, password);
            
            System.out.println("Database Terkoneksi");
        } catch (Exception e) {
            System.out.println(e.getMessage());          
        }
        
    }
    
    
    //TABEL DAFTAR KEBUTUHAN FUNGSIONAL PERANGKAT LUNAK
    public void Simpan(int NO, String Kebutuhan){
        try {
            String sql = "INSERT INTO daftar_kebutuhan_fungsional_perangkat_lunak (NO, Kebutuhan) VALUE (?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setInt(1, NO);
            perintah.setString(2, Kebutuhan);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void Ubah(int NO, String Kebutuhan){
        try {
            String sql = "UPDATE daftar_kebutuhan_fungsional_perangkat_lunak SET Kebutuhan=? where NO=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setString(1, Kebutuhan);
            perintah.setInt(2, NO);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Diubah");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void Hapus(int NO){
        try {
            String sql = "DELETE FROM daftar_kebutuhan_fungsional_perangkat_lunak where NO=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);

            perintah.setInt(1, NO);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Dihapus");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    
    //TABEL DAFTAR KEBUTUHAN NON FUNGSIONAL PERANGKAT LUNAK
    public void Simpan2(int NO,String Jenis, String Kebutuhan){
        try {
            String sql = "INSERT INTO daftar_kebutuhan_non_fungsional_perangkat_lunak (NO, Jenis, Kebutuhan) VALUE (?,?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setInt(1, NO);
            perintah.setString(2, Jenis);
            perintah.setString(3, Kebutuhan);
            
            
            perintah.executeUpdate();
            System.out.println("Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void Ubah2(int NO,String Jenis, String Kebutuhan){
        try {
            String sql = "UPDATE daftar_kebutuhan_non_fungsional_perangkat_lunak SET Jenis=?, Kebutuhan=? where NO=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setString(1, Jenis);
            perintah.setString(2, Kebutuhan);
            perintah.setInt(3, NO);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Diubah");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void Hapus2(int NO){
        try {
            String sql = "DELETE FROM daftar_kebutuhan_non_fungsional_perangkat_lunak where NO=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);

            perintah.setInt(1, NO);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Dihapus");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    
    //TABEL IDENTIFIKASI AKTOR
    public void Simpan3(String Aktor, String Deskripsi){
        try {
            String sql = "INSERT INTO identifikasi_aktor (Aktor, Deskripsi) VALUE (?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setString(1, Aktor);
            perintah.setString(2, Deskripsi);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void Ubah3(String Aktor, String Deskripsi){
        try {
            String sql = "UPDATE identifikasi_aktor SET Deskripsi=? where Aktor=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setString(1, Deskripsi);
            perintah.setString(2, Aktor);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Diubah");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void Hapus3(String Aktor){
        try {
            String sql = "DELETE FROM identifikasi_aktor where Aktor=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);

            perintah.setString(1, Aktor);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Dihapus");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    //TABEL DAFTAR KETERUNUTAN USE CASE
    public void Simpan4(int NO, String Use_Case, String No_Kebutuhan){
        try {
            String sql = "INSERT INTO keterunutan_use_case (NO, Use_Case, No_Kebutuhan) VALUE (?,?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setInt(1, NO);
            perintah.setString(2, Use_Case);
            perintah.setString(3, No_Kebutuhan);
            
            
            perintah.executeUpdate();
            System.out.println("Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void Ubah4(int NO, String Use_Case, String No_Kebutuhan){
        try {
            String sql = "UPDATE keterunutan_use_case SET Use_Case=?, No_Kebutuhan=? where NO=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setString(1, Use_Case);
            perintah.setString(2, No_Kebutuhan);
            perintah.setInt(3, NO);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Diubah");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void Hapus4(int NO){
        try {
            String sql = "DELETE FROM keterunutan_use_case where NO=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);

            perintah.setInt(1, NO);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Dihapus");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
}
