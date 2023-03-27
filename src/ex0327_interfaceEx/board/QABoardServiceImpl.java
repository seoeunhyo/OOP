package ex0327_interfaceEx.board;

import java.util.ArrayList;
import java.util.List;

/**
 * QA에 관련된 비즈니스 로직(주요기능)
 * */

public class QABoardServiceImpl implements BoardService {
	
	int bno = 1;
	
	@Override
	public int insert(Board board) {
		System.out.println("QABoardSeriveImpl의 insert call ");
		return 1;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("QABoardSeriveImpl의 update call ");
		return true;
	}

	@Override
	public Board selectByBno(int bno) {
		System.out.println("QABoardSeriveImpl의 selectByBno call ");
		return new Board(this.bno,"찾은 제목 ","찾은 작성자","찾은 내용");
	}

	@Override
	public List<Board> selectAll() {
		System.out.println("QABoardSeriveImpl의 selectAll call ");
		List<Board> list = new ArrayList<>();
		list.add(new QABoard(0, "title1", "writer1", "content1", true));
		list.add(new QABoard(1, "title2", "writer2", "content2", false));
		return list;
	}

}
