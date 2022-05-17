/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import view.Cadastro;

/**
 *
 * @author rober
 */
public class CadastroTableModel extends AbstractTableModel {
    
    private List<Cad> list = new ArrayList<>();
    private final String[] columnNames = {"Número", "Email","Estado","Cidade","End"};

public void setList(List<Cad> list) {
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
            return list.get(rowIndex).getNome();
        case 1:
            return list.get(rowIndex).getEmail();
        case 2:
            return list.get(rowIndex).getEstado();
        case 3:
            return list.get(rowIndex).getCidade();
        case 4:
            return list.get(rowIndex).getEnd();
        default:
            return null;
            
        }
    }
 
}
