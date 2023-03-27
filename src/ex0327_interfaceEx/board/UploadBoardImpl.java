package ex0327_interfaceEx.board;

import java.util.ArrayList;
import java.util.List;

public class UploadBoardImpl implements BoardService {

	@Override
	public int insert(Board board) {
		System.out.println("UploadBoardImpl의 insert call ");
		return 1;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("UploadBoardImpl의 update call ");
		return true;
	}

	@Override
	public Board selectByBno(int bno) {
		System.out.println("UploadBoardImpl의 selectByBno call ");
		return new UploadBoard(1, "UploadBoard1", "UploadBoard1", "UploadBoard1", "UploadBoard1");
	}

	@Override
	public List<Board> selectAll() {
		List<Board> list = new ArrayList<>();
		list.add(new UploadBoard(2, "UploadBoard2", "UploadBoard2", "UploadBoard2", "UploadBoard2"));
		list.add(new UploadBoard(3, "UploadBoard3", "UploadBoard3", "UploadBoard3", "UploadBoard3"));
		
		return list;
	}

}
