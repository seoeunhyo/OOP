package report_0324;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BankService {
	//final은 고정값= 값변경불가 (반드시 초기화 필수)
	final int ACCOUNT_SIZE = 10; /**계좌 최대개수*/
	final int USER_SIZE = 5;/**고객 최대개수 */
	
	int ACCOUNT_CURRENT_SIZE; /** 현재계좌의 개수 */
	int USER_CURRENT_SIZE; /**현재 고객의 개수 */
	
	
	ArrayList<AccountDto> accountList = new ArrayList<>();
	ArrayList<UserDto> userList = new ArrayList<>();
	
	/**
	 * 생성자에서 테스트를 위한 고객 및 계좌 객체를 생성하고 배열에 저장한다
	 * */
	public BankService() {

		// 각 배열방에 고객과 계좌를 생성한다.
		 //고객 4명
		 userList.add( new UserDto(100, "장희정", "8253jang@daum.net", "010-8875-8253", false));
		 userList.add( new UserDto(200, "이효리", "lee@daum.net", "010-2222-3333", false));
		 userList.add( new UserDto(300, "송중기", "song@naver.com", "010-5554-2222", false));
		 userList.add( new UserDto(400, "삼순이", "sam@daum.com", "010-2222-2222", false));
		 
		 //계좌는 6개 정도
		 accountList.add( new InstallAccount(1, "1111-11111", 1000000, 100, 200000, 20));
		 accountList.add( new SavingAccountDto(2, "2222-22222", 250000, 100, 10000000));
		 accountList.add( new LoanAccountDto(3, "3333-33333", 350000, 100,"30year"));
		 
		 accountList.add( new AccountDto(4, "4444-44444", 150000, 200));
		 accountList.add( new AccountDto(5, "5555-55555", 250000, 200));
		 
		 accountList.add( new AccountDto(6, "6666-66666", 350000, 300));
		 
	}//생성자 끝
	
    /**
	  특정 사용자의 계좌 목록을 배열로 리턴 하는 메소드를 작성한다
	*/
	public ArrayList<AccountDto> getAccountList(int userSeq) {
		int cnt = 0;
		ArrayList<AccountDto> tmparr = new ArrayList<>();
		
		for(AccountDto a : accountList) {
			if(a.getUserSeq() == userSeq) {
				tmparr.add(a);
				cnt++;
			}
		}
		if(cnt == 0) {
			System.out.println(userSeq+"의 계좌 정보가 없네요.\n");
		}
	
		return tmparr;
	}
	
	/**
	   특정 사용자의 고객 정보를 리턴 하는 메소드를 작성한다
	   
	   @param : 고객의 sequence
	   @return : null이면 고객의정보없다 
	**/
	public ArrayList<UserDto> getUserDetail(int userSeq) {
		int cnt = 0;
		ArrayList<UserDto> tmparr = new ArrayList<>();
		
		for(UserDto a : userList) {
			if(a.getUserSeq() == userSeq) {
				tmparr.add(a);
				cnt++;
			}
		}
		if(cnt == 0) {
			System.out.println(userSeq+"의 계좌 정보가 없네요.");
		}
	
		return tmparr;
		
	}
	
	/**
	 * 모든 계좌의 목록 반환 
	 * @return
	 */
	public ArrayList<AccountDto> getAccountList(){
		return accountList;
	}
	
	
	/**
	 * 잔액 수만큼 정렬된 배열 반환 
	 * @return
	 */
	public ArrayList<AccountDto> getAccountListSortByBalance(){
		ArrayList<AccountDto> arr = new ArrayList<>();
		for(AccountDto x : accountList) {
			arr.add(x);
		}
		Collections.sort(arr);
		return arr;
		
	}

	public ArrayList<AccountDto> getAccountListSortByUserSeq(){
		ArrayList<AccountDto> arr = new ArrayList<>();
		for(AccountDto x : accountList) {
			arr.add(x);
		}
		Collections.sort(arr, new Comparator<AccountDto>() {
				@Override
				public int compare(AccountDto o1,AccountDto o2 ) {
					return (o1.getUserSeq() - o2.getUserSeq()) ==0 ? o1.getBalance() - o2.getBalance() : o1.getUserSeq() - o2.getUserSeq();
				}});
		
		return arr;
	}

//	public static List<Student> getSortByAge(List<Student> list){
//		//인수로 전달된 데이터를 직접 정렬하면 원본이 변경되기 때문에
//		//복사본이 필요하다 
//		List<Student> sortedStudentList = new ArrayList<>();
//		for(Student st : list) {
//			sortedStudentList.add(st);
//		}
//		Collections.sort(sortedStudentList, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//			
//				return o1.getAge() - o1.getAge();
//			}
//			
//		});
		
//		return sortedStudentList;
//	}


		


}
