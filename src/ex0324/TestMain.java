package ex0324;

import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		
		System.out.println("===spiderMan3명, Student 3명===");
		Service service = new Service();
		
		List<Person> list= service.selectAll();
 		

		//등록하기
		service.insert(new SpiderMan("name" , 23, true));
		//-> Student나 SpiderMan만 가능, Person은 abstract라 호출할 수 없음 
		EndView.printList(list);
		
		
		//Person p = service.selectByName("name");
		boolean d = service.deleteByName("name");
		System.out.println(d);
		EndView.printList(list);
		
		System.out.println();
		System.out.println("==========나이순으로 정렬==========");
		service.sortByAge();
		EndView.printList(list);
		
		System.out.println("--정렬 호출하자 ---");
		list = service.sortByAge(); //나이기준 정렬
		EndView.printList(list);
		
		
		System.out.println("-- 정렬 후 ---");
		EndView.printList(list);
		System.out.println();
		
		System.out.println("\n--1. 등록하기 -------------");
		service.insert(new Student("희정", 22, 10));
		service.insert(new SpiderMan("sp나영", 21, false));
		
		
		System.out.println("\n--2. 이름으로 찾기----------");
		Person p = service.selectByName("학생8");
		if(p == null) {
			EndView.printMessage("정보가 없습니다.");
		}else {
			EndView.printPerson(p);
		}
		
		
		System.out.println("\n--3. 삭제하기--------------");
		if(service.deleteByName("학생9"))
			EndView.printMessage("삭제 성공하셨습니다.");
		else
			EndView.printMessage("삭제 실패하셨습니다.");

		
		System.out.println("**전체검색 호출해보자****");
		EndView.printList(service.selectAll());
		
		//p.219 ~ p295 인터페이스 전까지 (singleton 안 함)
		//수정 기능, 입력받으면서 해보기 
		
		
	}

}
