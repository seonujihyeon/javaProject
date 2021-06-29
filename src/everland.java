package javaChap2;

import java.util.ArrayList;
import java.util.Scanner;

public class everland {

	public static void main(String[] args) {
		
		int date, birthDate, count, number;
		int price = 0;
		char ticketType = 0;
		String preferential = null;
		String ageClassify = null;
		int addOrder;
	
		
		ArrayList<Character> arrayTicketType = new ArrayList<Character>();
		ArrayList<String> arrayAgeClassify = new ArrayList<String>();
		ArrayList<Integer> arrayCount = new ArrayList<Integer>();
		ArrayList<Integer> arrayPrice = new ArrayList<Integer>();
		ArrayList<String> arrayPreferential = new ArrayList<String>();
			
		
		Scanner myInput = new Scanner(System.in);
		
		arrayTicketType.clear();
		arrayAgeClassify.clear();
		arrayCount.clear();
		arrayPrice.clear();
		arrayPreferential.clear();
		
		do {
		System.out.println("이용날짜를 입력해주세요.");
		date = myInput.nextInt();
		
		System.out.println("\n주민번호 앞자리를 입력해주세요.");
		birthDate = myInput.nextInt();
		System.out.println("\n몇개를 주문하시겠습니까?");
		count = myInput.nextInt();
		System.out.println("\n우대사항을 선택하세요.\n1. 없음(나이 우대는 자동처리)\n"
				+ "2. 장애인\n3. 국가유공자\n4. 다자녀\n5. 임산부 ");
		number = myInput.nextInt();
		
		// ABC캘린더 티켓종류
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
		

	
		//만나이 계산	
		int baseYear;
		int birthYear;
		int age;
		
		baseYear = date/10000;
		birthYear = birthDate/10000;
		
		if (birthYear <= 21 && birthYear >= 0) {
			birthYear = birthYear + 2000;
		}else {
			birthYear = birthYear + 1900;
		}
		
		age = baseYear - birthYear;
		
		if (date - baseYear * 10000 < birthDate + ((int)birthYear/100)*1000000 - birthYear * 10000) {
			age = age - 1;
		}
		
		
		// 연령 구분 (경로:만65세~/소인:36개월~만12세/청소년:만13세~만18세/36개월 미만: 무료)
		if(age >= 65) {
			ageClassify = "경로";
		}
		if(age < 65 && age >= 19) {
			ageClassify = "대인";
		}
		if(age >= 13 && age <= 18 ) {
			ageClassify = "청소년";
		}
		if(age >= 3 && age <= 12) {
			ageClassify = "소인";
		}
		if(age < 3) {
			ageClassify = "36개월미만";
		}

		// 우대사항 없음
		if(number == 1 && (ageClassify == "대인" || ageClassify == "청소년")) {
			switch(ticketType) {
			case 'A' : price = 60000;
			break;
			case 'B' : price = 56000;
			break;
			case 'C': price = 50000;
			break;
			default :	
			}
			preferential = "없음";
		}
		if(number == 1 && (ageClassify == "소인" || ageClassify == "경로")) {
			switch(ticketType) {
			case 'A' : price = 48000;
			break;
			case 'B' : price = 44000;
			break;
			case 'C': price = 40000;
			break;
			default :
			}
			preferential = "없음";
		}
		if(age < 3) {
			price = 0;
			preferential = "없음";
		}	
		
		// 장애인
		if(number == 2 && ageClassify == "대인") {
			switch(ticketType) {
			case 'A' : price = 36000;
			break;
			case 'B' : price = 33000;
			break;
			case 'C': price = 30000;
			break;
			default :
			}
			preferential = "장애인";
		}
		if(number == 2 && (ageClassify == "소인" || ageClassify == "청소년" || ageClassify == "경로")) {
			switch(ticketType) {
			case 'A' : price = 28000;
			break;
			case 'B' : price = 26000;
			break;
			case 'C': price = 24000;
			break;
			default :
			}
			preferential = "장애인";
		}	
		
		// 국가유공자
		if(number == 3 && ageClassify == "대인") {
			switch(ticketType) {
			case 'A' : price = 30000;
			break;
			case 'B' : price = 28000;
			break;
			case 'C': price = 25000;
			break;
			default :
			}
			preferential = "국가유공자";
		}
		if(number == 3 && (ageClassify == "소인" || ageClassify == "청소년" || ageClassify == "경로")) {
			switch(ticketType) {
			case 'A' : price = 24000;
			break;
			case 'B' : price = 22000;
			break;
			case 'C': price = 20000;
			break;
			default :
			}
			preferential = "국가유공자";
		}
		
		// 다자녀
		if(number == 4 && (ageClassify == "대인" || ageClassify == "청소년")) {
			switch(ticketType) {
			case 'A' : price = 48000;
			break;
			case 'B' : price = 44000;
			break;
			case 'C': price = 40000;
			break;
			default :
			}
			preferential = "다자녀";
		}
		if(number == 4 && (ageClassify == "소인" || ageClassify == "경로")) {
			switch(ticketType) {
			case 'A' : price = 38000;
			break;
			case 'B' : price = 35000;
			break;
			case 'C': price = 32000;
			break;
			default :
			}
			preferential = "다자녀";
		}
		// 임산부
		if(number == 5 && ageClassify == "대인") {
			switch(ticketType) {
			case 'A' : price = 51000;
			break;
			case 'B' : price = 47000;
			break;
			case 'C': price = 42000;
			break;
			default :
			}
			preferential = "임산부";
		}			
		
		price = price * count;
		
		System.out.println("\n1. 추가구매, 2. 구매종료 : ");
		addOrder = myInput.nextInt();
		

		arrayTicketType.add(ticketType);
		arrayAgeClassify.add(ageClassify);
		arrayCount.add(count);
		arrayPrice.add(price);
		arrayPreferential.add(preferential);
	
		
		} while(addOrder == 1);
		
		int total = 0;
		for(int index = 0; index < arrayPrice.size(); index++) {
			total += arrayPrice.get(index);			
		}
		System.out.printf("\n가격은 %d원 입니다.\n감사합니다.", total);
		System.out.println("\n");
		System.out.println("===================에버랜드===================");
		for(int index = 0; index < arrayCount.size(); index++) {
			System.out.printf("%s티켓 %s X %d  %d원  *%s우대적용\n", 
					arrayTicketType.get(index), arrayAgeClassify.get(index), 
					arrayCount.get(index), arrayPrice.get(index), arrayPreferential.get(index));	
		}
		
		System.out.println("============================================\n");
		
		}
			
	
}
