package ex0324;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * SpiderMan or Person 객체를 관리 (CRUD = 등록, 수정, 삭제, 조회)
 *
 */

public class Service {


	List<Person> list = new ArrayList<>();


	/**
	 * 샘플 데이터 추가 기능
	 */
	public Service() {
		//객체를 생성해서 list 추가해보자 
		list.add(new SpiderMan("spiderMan01", 20, true));
		list.add(new SpiderMan("spiderMan02", 15, false));
		list.add(new SpiderMan("spiderMan03", 23, true));

		list.add(new Student("학생1", 32,1));
		list.add(new Student("학생2", 10, 5));
		list.add(new Student("학생3", 40, 3));
	}

	/**
	 * 전체조회 (등록된 순)
	 */
	public List<Person> selectAll(){
		return list;
	}



	/**
	 * 등록하기 
	 **/
	public void insert(Person person) {
			list.add(person);
	}

	/**
	 * 인수로 전달된 name에 해당하는 사람의 정보 조회하기(name은 중복 안 됨)
	 */
	public Person selectByName(String name) {
		
		Person a = null;
		for(Person p : list) {
			if(p.getName().equals(name)) {
				return p;
				
			}
		}
		return null;
		
	}


	/**
	 * 인수로 전달된 name에 해당하는 정보 삭제하기 
	 * @return : true이면 삭제 성공, false이면 삭제 실패 
	 */
	public boolean deleteByName(String name) {
		
		Person p = this.selectByName(name);
		boolean flag = list.remove(p);
		return flag;
		
//		boolean flag = false;
//		
//		for(Person p : list) {
//			if(p.getName().equals(name)) {
//				flag  = true;
//				list.remove(p);
//				break;
//			}
//		}
//		return flag;
	}


	/**
	 * 나이를 기준으로 정렬해서 조회하기 
	 * 
	 */
	public List<Person> sortByAge( ){
		
		Collections.sort(list);
		return list;
		 
//		Collections.sort(list, new Comparator<Person>() {
//
//			
//			
//			@Override
//			public int compare(Person o1, Person o2) {
//				
//				return o1.getAge() - o2.getAge();
//			}
//		});
//		return list;
	}



}
