package ex0327.interfaceExboard;

import java.util.ArrayList;
import java.util.List;

public class TestMainApp {

	BoardService service; //null--> 필드를 이용한 다형성 
	Board board;//종류 3가지 가능 
	
	
	public static void main(String[] args) {
		new TestMainApp();
		//static이어서 service와 board 접근 불가능, 때문에 생성자에서 사용
	}
	
	public TestMainApp() { 
		System.out.println("************** QABoard TEST ********************");
		service = new QABoardServiceImpl();
		board = new QABoard(1, "제목", "작성자", "내용", true);
		
		//test 메소드를 호출해보자 
		this.test(service, board);
		System.out.println("\n************** FreeBoard TEST ********************");
		service = new FreeBoardImpl();
		board = new FreeBoard(10, "Free제목","free 작성자" , "free 내용");
		this.test(service, board);
	
		System.out.println("\n************** uploadBoard TEST ********************");
		service = new UploadBoardImpl();
		board = new UploadBoard(2, "upload 제목","upload 작성자" , "upload 내용", "upload 파일");
		this.test(service, board);
	
		////////////////////익명 구현 클래스//////////////////////////////////////////
		service = new BoardService() {
			
			@Override
			public boolean update(Board board) {
				System.out.println("PhotoSrivce... insert");
				return false;
			}
			
			@Override
			public Board selectByBno(int bno) {
				System.out.println("PhotoSrivce... update");
				return null;
			}
			
			@Override
			public List<Board> selectAll() {
				System.out.println("PhotoSrivce... selectByBno");
				return new ArrayList<>();
			}
			
			@Override
			public int insert(Board board) {
				System.out.println("PhotoSrivce... selectAll");
				return 0;
			}
		}; 
	
		this.test(service, board);
		
		
		
	}//생성자 끝 
	
	
	/**
	 * 인수로 전달된 BoardService를 이용해서 각 메소드(XxxService)를 호출해보자.
	 * */

	public void test(BoardService service, Board board) { //QA, Free, Upload 가능 
		service.insert(board);
		service.update(board);
		
		Board searchBoard =  service.selectByBno(1);
		System.out.println("searchBoard = " + searchBoard);
		
		List<Board> list = service.selectAll();
		System.out.println("검색된 레코드 : " + list.size());
		
		for(Board b: list) {
			System.out.println(b);
		}
		System.out.println("----------------추가된 메소드 호출해보자-----------------");
		
		service.replyInsert();
		BoardService.selectBySubject(); // static 메소드 
		
		
	}
}
