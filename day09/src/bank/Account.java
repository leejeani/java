package bank;

public class Account {
	private String accNo;
	private String name;
	private String accHolder;
	private double balance;
	// Constructor - 음수 예외 상황
	public Account() {
		
	}

	public Account(String accNo, String name, String accHolder, double balance) throws Exception {
		if(balance < 0) {
			throw new Exception("A001");
		}
		this.accNo = accNo;
		this.name = name;
		this.accHolder = accHolder;
		this.balance = balance;
	}

	// 계좌 정보 조회 
	
	// 잔액 조회 
	
	// 입금 - 음수 예외 상황
	public void deposit(double money) {
		if(money <= 0) {
			System.out.println("입금 금액을 확인 하세요");
			return;
		}
		this.balance += money;
	}
	// 출금 - 잔액 부족 예외 상황, 음수 예외 상황
	public void withdraw(double money) {
		if(money <= 0) {
			System.out.println("출금 금액을 확인 하세요");
			return;
		}
		if(this.balance < money ) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		this.balance -= money;
	}
}




