package javaChap2;

import java.util.Scanner;

public class inputProcess {
	
	public int date, birthDate, count, number, addOrder;
	public char ticketType = 0;
	public Scanner myInput = new Scanner(System.in);
	
	public void inputDate() {
		System.out.println("이용날짜를 입력해주세요.");
		date = myInput.nextInt();
		
		if (date == 20210904 || date == 20210905 || date == 20210911 || date == 20210912
			|| date == 20210918 || date == 20210919 || date == 20210920 || date == 20210921
			|| date == 20210922 || date == 20210925 || date == 20210926 || date == 20211002 
			|| date == 20211003 || date == 20211009 || date == 20211010 || date == 20211016 
			|| date == 20211017 || date == 20211023 || date == 20211024 || date == 20211030 
			|| date == 20211031 || date == 20211106 || date == 20211107) {
				ticketType = 'A';
				
		}else if (date == 20210614 || date == 20210615 || date == 20210616 || date == 20210617
			|| date == 20210618 || date == 20210621 || date == 20210622 || date == 20210623
			|| date == 20210624 || date == 20210625 || date == 20210628 || date == 20210629
			|| date == 20210630 || date == 20210701 || date == 20210702 || date == 20210705
			|| date == 20210706 || date == 20210707 || date == 20210708 || date == 20210709
			|| date == 20210712 || date == 20210713 || date == 20210714 || date == 20210715
			|| date == 20210716 || date == 20210719 || date == 20210720 || date == 20210721
			|| date == 20210722 || date == 20210723 || date == 20210726 || date == 20210727
			|| date == 20210728 || date == 20210804 || date == 20210805 || date == 20210806
			|| date == 20210809 || date == 20210810 || date == 20210811 || date == 20210812
			|| date == 20210813 || date == 20210816 || date == 20210817 || date == 20210818
			|| date == 20210819 || date == 20210820 || date == 20210823 || date == 20210824
			|| date == 20210825 || date == 20210826 || date == 20210827 || date == 20210830
			|| date == 20210831 || date == 20210901 || date == 20210902 || date == 20211115
			|| date == 20211116 || date == 20211117 || date == 20211118 || date == 20211119
			|| date == 20211122 || date == 20211123 || date == 20211124 || date == 20211125
			|| date == 20211126 || date == 20211129 || date == 20211130) {
				ticketType = 'C';
			
		}else {
				ticketType = 'B';					
		}
		
	}
	
	public void inputID() {
		System.out.println("\n주민번호 앞자리를 입력해주세요.");
		birthDate = myInput.nextInt();
	}
	
	public void inputPreferential() {
		System.out.println("\n우대사항을 선택하세요.\n1. 없음(나이 우대는 자동처리)\n"
				+ "2. 장애인\n3. 국가유공자\n4. 다자녀\n5. 임산부 ");
		number = myInput.nextInt();
	}
	
	public void inputcount(int price) {
		System.out.println("\n몇개를 주문하시겠습니까?");
		count = myInput.nextInt();
		price = price * count;
	}
			
	public void inputAddOrder() {
		System.out.println("\n1. 추가구매, 2. 구매종료 : ");
		addOrder = myInput.nextInt();
	}
}
