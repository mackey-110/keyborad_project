package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    public static Connection getConnection() {
        Connection conn = null;

        try{
            // 드라이버 로딩(생략 가능하지만 호환성을 위해 남겨둠)
        	Class.forName(DBProperties.DRIVER_NAME); // ✅ 대소문자 구분 중요!



            // DB 연결
            conn = DriverManager.getConnection(
                DBProperties.URL, 
                DBProperties.USER_ID, 
                DBProperties.USER_PW);


        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
}
