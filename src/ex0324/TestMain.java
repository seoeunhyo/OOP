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
		
		
		
	}

}
