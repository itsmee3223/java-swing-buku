/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.IF20A.ControlImplement20312067;
import com.IF20A.Connection20312067.KoneksiDatabase;
import com.IF20A.ControlInterface20312067.InterfacePengarang20312067;
import com.IF20A.Model20312067.MPenagarang20312067;
import java.sql.SQLException;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author ramanda
 */
public class ImplementPengarang20312067 implements InterfacePengarang20312067 {

    @Override
    public MPenagarang20312067 simpan_20312067(MPenagarang20312067 o) throws SQLException {
        PreparedStatement st = (PreparedStatement) KoneksiDatabase.sambung().prepareStatement("INSERT INTO tbl_pengarang_20312067 VALUES(?,?)");
        st.setString(1, o.getPengarangId20312067());
        st.setString(2, o.getPengarangNama20312067());
        st.executeUpdate();
        return o;
    }

    @Override
    public void ubah_20312067(MPenagarang20312067 o) throws SQLException {
        PreparedStatement st = (PreparedStatement) KoneksiDatabase.sambung().prepareStatement("UPDATE tbl_pengarang_20312067 set Nama_Pengarang_20312067 = ? WHERE ID_Pengarang_20312067 = ?");
        st.setString(1, o.getPengarangNama20312067());
        st.setString(2, o.getPengarangId20312067());
        st.executeUpdate();
    }

    @Override
    public void hapus_20312067(String IDPengarang) throws SQLException {
        PreparedStatement st = (PreparedStatement) KoneksiDatabase.sambung().prepareStatement("DELETE FROM tbl_pengarang_20312067 WHERE ID_Pengarang_20312067 = ?");
        st.setString(1, IDPengarang);
        st.executeUpdate();
    }

    @Override
    public List<MPenagarang20312067> tampil_20312067() throws SQLException {
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
