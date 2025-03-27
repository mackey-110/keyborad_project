package mainview;
import java.sql.Date;

import dao.KeyboardDAO;
import dto.Keyboard;

public class Main {

	public static void main(String[] args) {
		Keyboard keyboard = new Keyboard(
				"SN123456" , "keychron", "K2", Date.valueOf("2025-3-25"), "정상",1001);
		
		KeyboardDAO dao = new KeyboardDAO();
		int result = dao.insertKeyboard(keyboard);
		
		if(result > 0 ) {
			System.out.println("키보드 등록 완료");
		}else {
			System.out.println("키보드 등록 실패");
		}

	}

}
