/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rober
 */
public class AgendaTableModel extends AbstractTableModel{
    
   private List<Age> list = new ArrayList<>();
    private final String[] columnNames = {"ID", "Servicos","Marcas","Pais","Descricao"};
    
     public void setList(List<Age> list) {
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column]; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
        case 0:
            return list.get(rowIndex).getID();
        case 1:
            return list.get(rowIndex).getServicos();
        case 2:
            return list.get(rowIndex).getMarcas();
        case 3:
            return list.get(rowIndex).getPais();
        case 4:
            return list.get(rowIndex).getDescricao();
        default:
            return null;
            
        }
    }
 
}
