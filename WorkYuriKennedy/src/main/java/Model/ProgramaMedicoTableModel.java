/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.ProgramaMedico;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Professor
 */
public class ProgramaMedicoTableModel extends AbstractTableModel {
 
    private List<ProgramaMedico> list = new ArrayList<>();
    private final String[] columnNames = {"RM", "Nome", "Endereco"};
    
    public void setList(List<ProgramaMedico> list) {
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
            return list.get(rowIndex).getRm();
        case 1:
            return list.get(rowIndex).getNome();
        case 2:
            return list.get(rowIndex).getEndereco();
        default:
            return null;
        }
    }
    

    
    
}
