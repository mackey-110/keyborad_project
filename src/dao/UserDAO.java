package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dto.User;
import util.DBConnector;

public class UserDAO {
    public int insertUser(User user){
        String sql ="INSERT INTO user (user_id, name, email) VALUES(?,?,?)";

        try(Connection conn = DBConnector.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setInt(1, user.getUserId());
                pstmt.setString(2, user.getName());
                pstmt.setString(3, user.getEmail());


                return pstmt.executeUpdate();// 성공시 1 반환
            }catch (SQLException e){
                e.printStackTrace();
                return 0;
            }
    }

}
