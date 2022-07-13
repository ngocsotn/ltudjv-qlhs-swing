/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20424056;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author NGOC
 */
public class customTableModel extends AbstractTableModel {
    
    List <Object>colName = Arrays.asList("MHS", "Tên HS", "Điểm", "Hình ảnh", "Địa chỉ", "Ghi chú");
    ArrayList<hocsinh> data = new ArrayList<hocsinh>();

    
    public customTableModel(ArrayList<hocsinh> data_in)
    {
        data = data_in;
    }
    
    @Override
    public String getColumnName(int column)
    {
        return (String) colName.get(column);
    }
    
    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return colName.size();
    }

    @Override
    public Object getValueAt(int rowId, int columnId) {
        if(columnId == 0)
            return data.get(rowId).getMHS();
        else if(columnId == 1)
            return data.get(rowId).getTenHS();
        else if(columnId == 2)
            return data.get(rowId).getDiem();
        else if(columnId == 3)
            return data.get(rowId).getHinhAnh();
        else if(columnId == 4)
            return data.get(rowId).getDiaChi();
        return data.get(rowId).getGhiChu();
    }
    
    @Override
    public boolean isCellEditable(int row, int column){  
          return false;  
      }
}
