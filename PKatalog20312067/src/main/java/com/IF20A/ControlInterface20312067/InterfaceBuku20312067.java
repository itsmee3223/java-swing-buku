/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.IF20A.ControlInterface20312067;

import com.IF20A.Model20312067.MBuku20312067;
import com.IF20A.Model20312067.MKategori20312067;
import com.IF20A.Model20312067.MPenagarang20312067;
import com.IF20A.Model20312067.MPenerbit20312067;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ramanda
 */
public interface InterfaceBuku20312067  {
    MBuku20312067 simpanBuku_20312067(MBuku20312067 o) throws SQLException;
    void hapus_20312067(String ISBN) throws SQLException;
    
    List<MBuku20312067> tampilBuku_20312067() throws SQLException;
    List<MKategori20312067> tampilKategori_20312067() throws SQLException;
    List<MPenerbit20312067> tampilPenerbit_20312067() throws SQLException;
    List<MPenagarang20312067> tampilPengarang_20312067() throws SQLException;
}
