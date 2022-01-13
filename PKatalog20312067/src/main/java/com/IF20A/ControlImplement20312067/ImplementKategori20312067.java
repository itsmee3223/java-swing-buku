/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.IF20A.ControlImplement20312067;

import com.IF20A.Connection20312067.KoneksiDatabase;
import com.IF20A.ControlInterface20312067.InterfaceKategori20312067;
import com.IF20A.Model20312067.MKategori20312067;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ramanda
 */
public class ImplementKategori20312067 implements InterfaceKategori20312067  {

    @Override
    public MKategori20312067 simpan_20312067(MKategori20312067 o) throws SQLException {
        PreparedStatement st = (PreparedStatement) KoneksiDatabase.sambung().prepareStatement("INSERT INTO tbl_kategori_20312067 VALUES(?,?)");
        st.setString(1, o.getKategoriId20312067());
        st.setString(2, o.getKategoriNama20312067());
        st.executeUpdate();
        return o;
    }

    @Override
    public void ubah_20312067(MKategori20312067 o) throws SQLException {
        PreparedStatement st = (PreparedStatement) KoneksiDatabase.sambung().prepareStatement("UPDATE tbl_kategori_20312067 set Nama_Kategori_20312067 = ? WHERE ID_Kategori_20312067 = ?");
        st.setString(1, o.getKategoriNama20312067());
        st.setString(2, o.getKategoriId20312067());
        st.executeUpdate();
    }

    @Override
    public void hapus_20312067(String idKategori) throws SQLException {
        PreparedStatement st = (PreparedStatement) KoneksiDatabase.sambung().prepareStatement("DELETE FROM tbl_kategori_20312067 WHERE ID_Kategori_20312067 = ?");
        st.setString(1, idKategori);
        st.executeUpdate();
    }

    @Override
    public List<MKategori20312067> tampil_20312067() throws SQLException {
        Statement stm = (Statement) KoneksiDatabase.sambung().createStatement();
        ResultSet rst = stm.executeQuery("SELECT * FROM tbl_kategori_20312067");
        List<MKategori20312067> listkategori = new ArrayList<>();
        while(rst.next()){
            MKategori20312067 kategori = new MKategori20312067();
            kategori.setKategoriId20312067(rst.getString("ID_Kategori_20312067"));
            kategori.setKategoriNama20312067(rst.getString("Nama_Kategori_20312067"));
            listkategori.add(kategori);
        }
        return listkategori;
        }
    
}
