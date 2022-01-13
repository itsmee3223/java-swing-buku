/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.IF20A.ControlImplement20312067;
import com.IF20A.Connection20312067.KoneksiDatabase;
import com.IF20A.ControlInterface20312067.InterfaceLogin20312067;
import com.IF20A.Model20312067.MLogin20312067;
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
public class ImplementLogin20312067 implements InterfaceLogin20312067 {

    @Override
    public List<MLogin20312067> tampil_20312067() throws SQLException {
       Statement stm = (Statement) KoneksiDatabase.sambung().createStatement();
        ResultSet rst = stm.executeQuery("SELECT * FROM tbl_login_20312067");
        List<MLogin20312067> listlogin = new ArrayList<>();
        while(rst.next()){
            MLogin20312067 login = new MLogin20312067();
            login.setUsername2012067(rst.getString("Username_20312067"));
            login.setPassword20312067(rst.getString("Password_20312067"));
            listlogin.add(login);
        }
        return listlogin;
        }
}
