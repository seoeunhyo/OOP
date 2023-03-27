package ws.ws_06;

import java.util.ArrayList;

import ws.ws_06.AccountDto;
import ws.ws_06.UserDto;

public interface BankService {


	ArrayList<AccountDto> getAccountList(int userSeq);
	ArrayList<UserDto> getUserDetail(int userSeq);

	ArrayList<AccountDto> getAccountList();
	ArrayList<AccountDto> getAccountListSortByBalance();

	ArrayList<AccountDto> getAccountListSortByUserSeq();
}
