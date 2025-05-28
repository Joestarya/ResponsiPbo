/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import DAOImplement.dataimplement;
import DAOdata.Daodata;
import model.*;
import view.MainView;
import javax.swing.*;
import java.sql.*;
import koneksi.connector;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Lab Informatika
 */
public class Datacontroller {
    MainView frame;
    dataimplement impldt;
    List<data>dt;

    public Datacontroller(MainView frame){
        this.frame = frame;
        impldt =  new Daodata();
        dt = impldt.getALL();
    }
   

public void isitable(){
      dt = impldt.getALL();
      Modeltable mb = new Modeltable(dt);
      frame.getjTable1().setModel(mb);
}
}