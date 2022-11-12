//DataAccessObj : Create Read

package bulletinboard;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class PostingDAO {
	ArrayList<PostingVO> list = new ArrayList<>(); //Read할 때 DB역할
	
	// 1.전체리스트 Read
	public void getList() {
		System.out.println("== 게시물 리스트 ==");
		System.out.println("  no             title              date ");
		
		if (list.size() == 0) {
			System.out.println("           게시물이 없습니다.");
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.print("  " + list.get(i).no + "             ");
				System.out.print(list.get(i).title + "         ");
				System.out.println(list.get(i).date);
			}
		}
	}
	// 2.등록 Create
	public void createPosting() {
		Scanner key = new Scanner(System.in);
		PostingVO vo = new PostingVO();
		// 글번호
		vo.no = list.size() + 1;
		// 제목
		System.out.print("제목 : ");
		vo.title = key.next();
		// 작성자
		System.out.print("작성자 : ");
		vo.writer = key.next();
		// 날짜
		SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = new Date();
		String day_str = sdformat.format(d);
		vo.date = day_str;
		
		list.add(vo);
		
		System.out.println("글이 추가 되었습니다.");
		//key.close();
	}
}
