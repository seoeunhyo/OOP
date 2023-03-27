package ws.ws_06;


import java.util.ArrayList;
import java.util.Scanner;

public class TestView {

	static boolean flag = true;
	static int input;
	static BankService service = new BankServiceImpl();
	
	static ArrayList<AccountDto> accountList = service.getAccountList(100);
	static ArrayList<UserDto> userList = service.getUserDetail(100);

	
	public static void main(String[] args) {
		
		while(flag) {
			System.out.println("----------------번호를 입력하세요-------------------");
			System.out.println("***1. 고객 Seq에 해당하는 계좌 정보 검색하기 ************");
			System.out.println("***2. userSeq에 해당하는 고객의 정보 *****************");
			System.out.println("***3. *********모든 계좌 리스트 ********************");
			System.out.println("***4. ************* 유저 넘버로 정렬 ***************");
			System.out.println("***5. **************종료*************************");
			
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
			
			if(input == 5) {
				System.out.println("\n***************종료합니다.********************");
				System.out.println();
				System.out.println();
				flag = false;
			}
			if(input == 1) {
				System.out.print("\n UserSeq를 입력하세요: ");
				int in = sc.nextInt();
				
				System.out.println(service.getAccountList(in)+"\n");
				
			}
			if(input == 2) {
				System.out.print("\n UserSeq를 입력하세요: ");
				int in = sc.nextInt();
				
				System.out.println(service.getUserDetail(in)+"\n");
	
			}
			
			if(input == 3) {
				
				for(AccountDto x : service.getAccountList()) {
					System.out.println(x+"]");
				}
				System.out.println("\n\n");
				
			}
			
			if(input == 4) {
				
				
				ArrayList<AccountDto> tmparr = service.getAccountListSortByUserSeq();
				for(AccountDto x : tmparr) {
					System.out.println(x);
				}
				System.out.println("\n\n");
			}
			
		}
		


	}

}
