/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOImplement;

import java.util.List;
import model.*;

/**
 *
 * @author Lab Informatika
 */
public interface dataimplement {
    public void insert(data d);
    public void update(data d);
    public void delete(String Costumer);
    public List<data> getALL();
}
