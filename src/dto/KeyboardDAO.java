package dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.DBConnector;

public class KeyboardDAO {
    public int insertKeyboard(Keyboard kb){
        String sql = "INSERT INTO keyboard (serial_numer, brand, model, purchase_date, status, user_id) " +
                      "VALUES ( ?, ?, ?, ?, ?, ?)";
        
        
        try(Connection conn = DBConnector.getConnection();
        	PreparedStatement pstmt = conn.prepareStatement(sql)) {
        	
        	
        	pstmt.setString(1, kb.getSerialNumer());
        	pstmt.setString(2, kb.getBrand());
        	pstmt.setString(3, kb.getModel());
        	pstmt.setDate(4, kb.getPurchaseDate());
        	pstmt.setString(5, kb.getStatusl());
        	pstmt.setInt(6, kb.getUserId());
        	
        	return pstmt.executeUpdate();
        	
        }catch (SQLException e) {
        	e.printStackTrace();
        	return 0;
        }
    }

}
