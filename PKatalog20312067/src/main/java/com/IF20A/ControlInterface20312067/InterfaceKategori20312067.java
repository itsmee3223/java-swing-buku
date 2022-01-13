/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.IF20A.ControlInterface20312067;
import java.sql.SQLException;
import java.util.List;
import com.IF20A.Model20312067.MKategori20312067;

/**
 *
 * @author ramanda
 */
public interface InterfaceKategori20312067 {
    MKategori20312067 simpan_20312067(MKategori20312067 o) throws SQLException;
    void ubah_20312067(MKategori20312067 o) throws SQLException;
    void hapus_20312067(String IDPenerbit) throws SQLException;
    List<MKategori20312067> tampil_20312067() throws SQLException;
}
