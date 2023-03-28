package ex0328.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExam { //528p

	
	Map<Integer,String> map = new HashMap<>();
	//Map<Integer,String> map = new TreeMap<>(); //key를 정렬
	
	
	public HashMapExam() {
		//추가
		//상속이라면 super.put
		map.put(10, "은효"); //key는 중복 안 되고, value는 중복 가능(key가 같으면 update)
		map.put(10, "길동"); //key가 동일했기 때문에 길동이 은효를 덮어쓰게 됨 
		map.put(20, "세종");
		map.put(60, "을지");
		map.put(30, "은효");
		map.put(40, "문덕");
		
		System.out.println("개수 : " + map.size());
		System.out.println(map);
	
		map.remove(30); //key 제거 
		
		System.out.println("개수 : " + map.size());
		System.out.println(map);
		
		System.out.println("----조회 하기-----");
		
		//모든 key의 정보를 가져온다.
		Set<Integer> keySet = map.keySet(); // 모든 key들의 정보를 가져옴, return type: set 
		Iterator<Integer> it =  keySet.iterator();
		
		while(it.hasNext()) {
			int key = it.next();
			String value = map.get(key);
			System.out.println(key + " = "+ value );
		}
		
		System.out.println("----개선된 for 변경----");
		for(Integer key :map.keySet()) {
			String value = map.get(key);
		}
		
		System.out.println("\n== Map.Entry<K,V> 가져오기================= ");
		
		//outername. innername
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		Iterator<Map.Entry<Integer, String>> iter = set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<Integer, String> entry = iter.next();
			System.out.println(entry.getKey()+ " = "+entry.getValue());
			
		}
	
		System.out.println(set);
	}
	
	public static void main(String[] args) {
		new HashMapExam();
		
	}

}
