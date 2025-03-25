package util;

/*
 * DB 설정 정보에 해당하는 상수 필드를 관리
 */

public interface DBProperties {
    public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    String URL = "jdbc:mysql://localhost:3306/exam?serverTimezone=Asia/Seoul";
    String USER_ID = "root";
    String USER_PW = "admin";

}
