package com.IF20A.ControlImplement20312067;

import com.IF20A.Connection20312067.KoneksiDatabase;
import com.IF20A.ControlInterface20312067.InterfaceBuku20312067;
import com.IF20A.Model20312067.MBuku20312067;
import com.IF20A.Model20312067.MKategori20312067;
import com.IF20A.Model20312067.MPenagarang20312067;
import com.IF20A.Model20312067.MPenerbit20312067;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ramanda
 */
public class ImplementBuku20312067 implements InterfaceBuku20312067 {

    @Override
    public MBuku20312067 simpanBuku_20312067(MBuku20312067 o) throws SQLException {
        PreparedStatement st = (PreparedStatement) KoneksiDatabase.sambung().prepareStatement("INSERT INTO tbl_buku_20312067 VALUES(?,?,?,?,?,?,?,?)");
        st.setString(1, o.getISBN20312067());
        st.setString(2, o.getJudul20312067());
        st.setString(3, o.getIDPengarang20312067());
        st.setString(4, o.getIDPenerbit20312067());
        st.setString(5, o.getIDKategori20312067());
        st.setInt(6, o.getHarga20312067());
        st.setString(7, o.getTahun20312067());
        st.setInt(8, o.getStok20312067());
        st.executeUpdate();
        return o;
    }

    @Override
    public void hapus_20312067(String ISBN) throws SQLException {
        PreparedStatement st = (PreparedStatement) KoneksiDatabase.sambung().prepareStatement("DELETE FROM tbl_buku_20312067 WHERE ISBN_20312067 = ?");
        st.setString(1, ISBN);
        st.executeUpdate();
    }

    @Override
    public List<MBuku20312067> tampilBuku_20312067() throws SQLException {
        Statement stm = (Statement) KoneksiDatabase.sambung().createStatement();
        ResultSet rst = stm.executeQuery("SELECT * FROM tbl_buku_20312067\n" +
                                        "INNER JOIN `tbl_pengarang_20312067`\n" +
                                        "	ON `tbl_buku_20312067`.`ID_Pengarang_20312067`=`tbl_pengarang_20312067`.`ID_Pengarang_20312067`\n" +
                                        "INNER JOIN `tbl_penerbit_20312067`\n" +
                                        "	ON `tbl_buku_20312067`.`ID_Penerbit_20312067`=`tbl_penerbit_20312067`.`ID_Penerbit_20312067`\n" +
                                        "INNER JOIN `tbl_kategori_20312067`\n" +
                                        "	ON `tbl_buku_20312067`.`ID_Kategori_20312067`=`tbl_kategori_20312067`.`ID_Kategori_20312067`");
        List<MBuku20312067> listbuku = new ArrayList<>();
        while(rst.next()){
            MBuku20312067 buku = new MBuku20312067();
            buku.setISBN20312067(rst.getString("ISBN_20312067"));
            buku.setJudul20312067(rst.getString("Judul_Buku_20312067"));
            buku.setIDPengarang20312067(rst.getString("ID_Pengarang_20312067"));
            buku.setIDPenerbit20312067(rst.getString("ID_Penerbit_20312067"));
            buku.setIDKategori20312067(rst.getString("ID_Kategori_20312067"));
            buku.setHarga20312067(rst.getInt("Harga_20312067"));
            buku.setTahun20312067(rst.getString("Tahun_Terbit_20312067"));
            buku.setStok20312067(rst.getInt("Stok_20312067"));
            buku.setNamaPengarang20312067(rst.getString("Nama_Pengarang_20312067"));
            buku.setNamaPenerbit20312067(rst.getString("Nama_Penerbit_20312067"));
            buku.setNamaKategori20312067(rst.getString("Nama_Kategori_20312067"));
            listbuku.add(buku);
        }
        return listbuku;
        }

    @Override
    public List<MKategori20312067> tampilKategori_20312067() throws SQLException {
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

    @Override
    public List<MPenerbit20312067> tampilPenerbit_20312067() throws SQLException {
        Statement stm = (Statement) KoneksiDatabase.sambung().createStatement();
        ResultSet rst = stm.executeQuery("SELECT * FROM tbl_penerbit_20312067");
        List<MPenerbit20312067> listpenerbit = new ArrayList<>();
        while(rst.next()){
            MPenerbit20312067 penerbit = new MPenerbit20312067();
            penerbit.setPenerbitId20312067(rst.getString("ID_Penerbit_20312067"));
            penerbit.setPenerbitNama20312067(rst.getString("Nama_Penerbit_20312067"));
            listpenerbit.add(penerbit);
        }
        return listpenerbit;
        }

    @Override
    public List<MPenagarang20312067> tampilPengarang_20312067() throws SQLException {
        Statement stm = (Statement) KoneksiDatabase.sambung().createStatement();
        ResultSet rst = stm.executeQuery("SELECT * FROM tbl_pengarang_20312067");
        List<MPenagarang20312067> listpengarang = new ArrayList<>();
        while(rst.next()){
            MPenagarang20312067 pengarang = new MPenagarang20312067();
            pengarang.setPengarangId20312067(rst.getString("ID_Pengarang_20312067"));
            pengarang.setPengarangNama20312067(rst.getString("Nama_Pengarang_20312067"));
            listpengarang.add(pengarang);
        }
        return listpengarang;
    }
    
}
