/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Lab Informatika
 */
public class Modeltable extends AbstractTableModel{
    
    List<data>dt;
    public Modeltable(List<data>dt){
        this.dt = dt;
    }

    @Override
    public int getRowCount() {
        return dt.size();
    }

    @Override
    public int getColumnCount() {
       return 7;
    }

    public String getColumnName(int row, int column) {
       return switch(column){
           case 0 -> "costumer";
           case 1 -> "barang";
           case 2 -> "harga";
           case 3 -> "cicilan";
           case 4 -> "bunga";
           case 5 -> "angsuran";
           case 6 -> "total";
           default -> null;       
       };
    }
    
    @Override
    public Object getValueAt(int row, int column) {
       return switch(column){
           case 0 -> dt.get(row).getCustomer();
           case 1 -> dt.get(row).getBarang();
           case 2 -> dt.get(row).getHarga();
           case 3 -> dt.get(row).getCicilan();
           case 4 -> dt.get(row).getBunga();
           case 5 -> dt.get(row).getAngsuran();
           case 6 -> dt.get(row).getTotal();
           default -> null;       
       };
    }
    
}
