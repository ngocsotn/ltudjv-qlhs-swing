/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20424056;

//import oracle.jdbc.driver.OracleDriver;
//import com.microsoft.sqlserver.jdbc.SQLServerConnection;
//import com.mysql.jdbc.Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author NGOC
 */
public class controller {
    public ArrayList<hocsinh>selectAll() throws SQLException
    {
        ArrayList<hocsinh> rs = new ArrayList<hocsinh>();

        Connection conn = (Connection) myConnection.reConnect();

        ResultSet rst = null;
        String query= "SELECT mhs,tenhs,diem,hinhanh,diachi,ghichu FROM hocsinh";
        
        if(conn != null)
        {
            Statement st = conn.createStatement();
            
            rst = st.executeQuery(query);
            while(rst.next())
            {
                hocsinh tmp = new hocsinh();
                tmp.setMHS(rst.getInt("mhs"));
                tmp.setTenHS(rst.getString("tenhs"));
                tmp.setDiem(rst.getDouble("diem"));
                tmp.setHinhAnh(rst.getString("hinhanh"));
                tmp.setDiaChi(rst.getString("diachi"));
                tmp.setGhiChu(rst.getString("ghichu"));
                
                rs.add(tmp);
            }
        }
        
        myConnection.forceClose();
        return rs;
    }
    
    public int reInsertAll(ArrayList<hocsinh> ls) throws SQLException
    {
        Connection conn = (Connection) myConnection.reConnect();
        
        int rowsAffected = 0;
        String query = "DELETE FROM hocsinh";
        
        if(conn != null)
        {
            PreparedStatement pre = conn.prepareStatement(query);
            rowsAffected = pre.executeUpdate();
        }
        
        query = "INSERT INTO hocsinh(mhs,tenhs,diem,hinhanh,diachi,ghichu) values(?,?,?,?,?,?)";
        
        if(conn != null)
        {
            for(hocsinh hs : ls)
            {
                PreparedStatement pre = conn.prepareStatement(query);
                pre.setInt(1, hs.getMHS());
                pre.setString(2, hs.getTenHS());
                pre.setDouble(3, hs.getDiem());
                pre.setString(4, hs.getHinhAnh());
                pre.setString(5, hs.getDiaChi());
                pre.setString(6, hs.getGhiChu());
                
                rowsAffected += pre.executeUpdate();
            }
        }
        
        myConnection.forceClose();
        
        return rowsAffected;
    }
    
    public int insertNew(hocsinh hs) throws SQLException
    {
        Connection conn = (Connection) myConnection.reConnect();
        
        int rowsAffected = 0;
        String query = "INSERT INTO hocsinh(mhs,tenhs,diem,hinhanh,diachi,ghichu) values(?,?,?,?,?,?)";
        
        if(conn != null)
        {
            PreparedStatement pre = conn.prepareStatement(query);
            pre.setInt(1, hs.getMHS());
            pre.setString(2, hs.getTenHS());
            pre.setDouble(3, hs.getDiem());
            pre.setString(4, hs.getHinhAnh());
            pre.setString(5, hs.getDiaChi());
            pre.setString(6, hs.getGhiChu());
            
            rowsAffected = pre.executeUpdate();
        }
        
        myConnection.forceClose();
        
        return rowsAffected;
    }
    
    public int deleteRow(int mhs) throws SQLException
    {
        Connection conn = (Connection) myConnection.reConnect();
        
        int rowsAffected = 0;
        String query = "DELETE FROM hocsinh WHERE mhs = ?";
        
        if(conn != null)
        {
            PreparedStatement pre = conn.prepareStatement(query);
            pre.setInt(1, mhs);
            
            rowsAffected = pre.executeUpdate();
        }
        
        myConnection.forceClose();
        
        return rowsAffected;
    }
    
    public int updateRow(hocsinh hs) throws SQLException
    {
        Connection conn = (Connection) myConnection.reConnect();
        
        int rowsAffected = 0;
        
        String query = "UPDATE hocsinh SET tenhs = ? , diem = ? , hinhanh = ? , diachi = ? , ghichu = ? WHERE mhs = ?";
        
        if(conn != null)
        {
            PreparedStatement pre = conn.prepareStatement(query);
            pre.setString(1, hs.getTenHS());
            pre.setDouble(2, hs.getDiem());
            pre.setString(3, hs.getHinhAnh());
            pre.setString(4, hs.getDiaChi());
            pre.setString(5, hs.getGhiChu());
            
            pre.setInt(6, hs.getMHS());
            
            rowsAffected = pre.executeUpdate();
        }
        myConnection.forceClose();
        
        return rowsAffected;
    }
}
