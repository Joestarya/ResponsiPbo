/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOdata;

import java.sql.*;
import java.util.*;
import koneksi.connector;
import model.*;
import DAOImplement.dataimplement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lab Informatika
 */
public class Daodata implements dataimplement{
    Connection connection;
    
    final String select = "SELECT * FROM `toko`;";
    final String insert = "INSERT INTO `toko` (`costumer`, `barang`, `harga`, `cicilan`, `bunga`, `angsuran`, `total`) VALUES ('?', '?', '?', '?', '?', '?', '?');";
    final String update = "UPDATE `toko` SET customer=?, barang=?, harga=?, cicilan=?, bunga=?, angsuran=?, total=? total=?;";

    @Override
    public void insert(data d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(data d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String Costumer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    public List<data>getALL(){
        {
            List<data> dt = null;
            try {
                dt = new ArrayList<data>();
                Statement st = connection.createStatement();
                ResultSet rs = st.executeQuery(select);
                while(rs.next()){
                    data Data = new data();
                    Data.setCustomer(rs.getString("customer"));
                    Data.setBarang(rs.getString("baramg"));
                    
                    Data.setHarga(rs.getFloat("harga"));
                    Data.setCicilan(rs.getFloat("cicilan"));
                    Data.setBunga(rs.getFloat("bunga"));
                    Data.setAngsuran(rs.getFloat("harga"));
                    Data.setTotal(rs.getFloat("harga"));
                    dt.add(Data);
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(data.class.getName()).log(Level.SEVERE, null, ex);
            }
            return dt;
        }
    }
}
