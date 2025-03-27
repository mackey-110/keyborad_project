package dao;

import dto.KeyboardLog;
import util.DBConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class KeyboardLogDAO {
    public int insertLog(KeyboardLog log) {
        String sql = "INSERT INTO keyboard_log (keyboard_id, action, memo) VALUES (?, ?, ?)";

        try (Connection conn = DBConnector.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, log.getKeyboardId());
            pstmt.setString(2, log.getAction());
            pstmt.setString(3, log.getMemo());

            return pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
