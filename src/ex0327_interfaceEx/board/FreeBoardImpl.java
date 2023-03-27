package ex0327_interfaceEx.board;

import java.util.ArrayList;
import java.util.List;

public class FreeBoardImpl implements BoardService {

	@Override
	public int insert(Board board) {
		System.out.println("FreeBoardImpl의 insert call ");
		return 1;
	
	}

	@Override
	public boolean update(Board board) {
		System.out.println("FreeBoardImpl의 update call ");
		return true;
	}

	@Override
	public Board selectByBno(int bno) {
		System.out.println("FreeBoardImpl의 insert call ");
		return new FreeBoard(bno, "freeboard","freeboard", "freeboard");
		
	}

	@Override
	public List<Board> selectAll() {
		List<Board> list = new ArrayList<>();
		list.add(new FreeBoard(1, "freeboard2","freeboard2", "freeboard2"));
		list.add(new FreeBoard(2, "freeboard23","freeboard23", "freeboard23"));
		return list;
	}

	@Override
	public int replyInsert() {
		// TODO Auto-generated method stub
		System.out.println("freeBoardImpl의 replyInsertcall.....");
		return 3;
	}
}
