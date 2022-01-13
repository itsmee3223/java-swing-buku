/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.IF20A.ControlImplement20312067;
import com.IF20A.Connection20312067.KoneksiDatabase;
import com.IF20A.ControlInterface20312067.InterfacePenerbit20312067;
import com.IF20A.Model20312067.MPenerbit20312067;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ramanda
 */
public class ImplementPenerbit20312067 implements InterfacePenerbit20312067 {

    @Override
    public MPenerbit20312067 simpan_20312067(MPenerbit20312067 o) throws SQLException {
        PreparedStatement st = (PreparedStatement) KoneksiDatabase.sambung().prepareStatement("INSERT INTO tbl_penerbit_20312067 VALUES(?,?)");
        st.setString(1, o.getPenerbitId20312067());
        st.setString(2, o.getPenerbitNama20312067());
        st.executeUpdate();
        return o;
    }

    @Override
    public void ubah_20312067(MPenerbit20312067 o) throws SQLException {
        PreparedStatement st = (PreparedStatement) KoneksiDatabase.sambung().prepareStatement("UPDATE tbl_penerbit_20312067 set Nama_Penerbit_20312067 = ? WHERE ID_Penerbit_20312067 = ?");
        st.setString(1, o.getPenerbitNama20312067());
        st.setString(2, o.getPenerbitId20312067());
        st.executeUpdate();
    }

    @Override
    public void hapus_20312067(String IDPenerbit) throws SQLException {
        PreparedStatement st = (PreparedStatement) KoneksiDatabase.sambung().prepareStatement("DELETE FROM tbl_penerbit_20312067 WHERE ID_Penerbit_20312067 = ?");
        st.setString(1, IDPenerbit);
        st.executeUpdate();
    }

    @Override
    public List<MPenerbit20312067> tampil_20312067() throws SQLException {
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
    }
