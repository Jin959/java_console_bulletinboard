// BulletinApp Controller

package bulletinboard;

import java.util.Scanner;

public class BulletinApp {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		PostingDAO dao = new PostingDAO(); // Data Access Obj
		
		// controlling
		while(true) {
			System.out.print("1.전체리스트  2.등록  0.종료>");
			
			int command = key.nextInt();
			
			// 1.전체리스트
			if(command == 1) {
				dao.getList();
			}
			
			// 2.등록
			if (command == 2) {
				dao.createPosting();
			}
			
			// 0.종료
			if(command == 0) {
				System.out.print("프로그램이 종료 되었습니다.");
				break;
			}
		}
		key.close();
	}
}
