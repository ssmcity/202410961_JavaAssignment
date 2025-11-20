package ch06.sec16;

import java.util.Scanner;

public class BankApplication {
	 private static Account[] accountArray = new Account[100];
	    private static Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean run = true;

	        while (run) {
	            System.out.println("---------------------------------------------");
	            System.out.println("1.계좌생성 | 2.계좌목록 | 3.입금 | 4.출금 | 5.종료");
	            System.out.println("---------------------------------------------");
	            System.out.print("선택> ");

	            int selectNo = Integer.parseInt(scanner.nextLine());

	            switch (selectNo) {
	                case 1:
	                    createAccount();
	                    break;
	                case 2:
	                    accountList();
	                    break;
	                case 3:
	                    deposit();
	                    break;
	                case 4:
	                    withdraw();
	                    break;
	                case 5:
	                    run = false;
	                    break;
	                default:
	                    System.out.println("잘못된 입력입니다.");
	            }
	        }
	        System.out.println("프로그램 종료");
	    }

	    // ------------------------------------------------------
	    // 1. 계좌 생성
	    // ------------------------------------------------------
	    private static void createAccount() {

	        System.out.println("----------");
	        System.out.println("계좌 생성");
	        System.out.println("----------");

	        System.out.print("계좌번호: ");
	        String ano = scanner.nextLine();

	        System.out.print("계좌주: ");
	        String owner = scanner.nextLine();  // nextLine() 요구 사항 반영

	        System.out.print("초기입금액: ");
	        int balance = Integer.parseInt(scanner.nextLine());

	        Account newAccount = new Account(ano, owner, balance);

	        for (int i = 0; i < accountArray.length; i++) {
	            if (accountArray[i] == null) {
	                accountArray[i] = newAccount;
	                System.out.println("결과: 계좌가 생성되었습니다.");
	                break;
	            }
	        }
	    }

	    // ------------------------------------------------------
	    // 2. 계좌 목록
	    // ------------------------------------------------------
	    private static void accountList() {

	        System.out.println("----------");
	        System.out.println("계좌 목록");
	        System.out.println("----------");

	        for (Account account : accountArray) {
	            if (account != null) {
	                System.out.println(account.getAno() + "   " 
	                                   + account.getOwner() + "   " 
	                                   + account.getBalance());
	            }
	        }
	    }

	    // ------------------------------------------------------
	    // 3. 입금
	    // ------------------------------------------------------
	    private static void deposit() {

	        System.out.println("----------");
	        System.out.println("입금");
	        System.out.println("----------");

	        System.out.print("계좌번호: ");
	        String ano = scanner.nextLine();

	        System.out.print("입금액: ");
	        int money = Integer.parseInt(scanner.nextLine());

	        Account account = findAccount(ano);

	        if (account == null) {
	            System.out.println("결과: 계좌가 존재하지 않습니다.");
	            return;
	        }

	        account.setBalance(account.getBalance() + money);
	        System.out.println("결과: 입금이 성공되었습니다.");
	    }

	    // ------------------------------------------------------
	    // 4. 출금
	    // ------------------------------------------------------
	    private static void withdraw() {

	        System.out.println("----------");
	        System.out.println("출금");
	        System.out.println("----------");

	        System.out.print("계좌번호: ");
	        String ano = scanner.nextLine();

	        System.out.print("출금액: ");
	        int money = Integer.parseInt(scanner.nextLine());

	        Account account = findAccount(ano);

	        if (account == null) {
	            System.out.println("결과: 계좌가 존재하지 않습니다.");
	            return;
	        }

	        if (account.getBalance() < money) {
	            System.out.println("결과: 잔액이 부족합니다.");
	            return;
	        }

	        account.setBalance(account.getBalance() - money);
	        System.out.println("결과: 출금이 성공되었습니다.");
	    }

	    // ------------------------------------------------------
	    // 계좌 찾기
	    // ------------------------------------------------------
	    private static Account findAccount(String ano) {

	        for (Account account : accountArray) {
	            if (account != null && account.getAno().equals(ano)) {
	                return account;
	            }
	        }
	        return null;

	}

}
