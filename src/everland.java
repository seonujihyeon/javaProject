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
		System.out.println("�̿볯¥�� �Է����ּ���.");
		date = myInput.nextInt();
		
		System.out.println("\n�ֹι�ȣ ���ڸ��� �Է����ּ���.");
		birthDate = myInput.nextInt();
		System.out.println("\n��� �ֹ��Ͻðڽ��ϱ�?");
		count = myInput.nextInt();
		System.out.println("\n�������� �����ϼ���.\n1. ����(���� ���� �ڵ�ó��)\n"
				+ "2. �����\n3. ����������\n4. ���ڳ�\n5. �ӻ�� ");
		number = myInput.nextInt();
		
		// ABCĶ���� Ƽ������
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
		

	
		//������ ���	
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
		
		
		// ���� ���� (���:��65��~/����:36����~��12��/û�ҳ�:��13��~��18��/36���� �̸�: ����)
		if(age >= 65) {
			ageClassify = "���";
		}
		if(age < 65 && age >= 19) {
			ageClassify = "����";
		}
		if(age >= 13 && age <= 18 ) {
			ageClassify = "û�ҳ�";
		}
		if(age >= 3 && age <= 12) {
			ageClassify = "����";
		}
		if(age < 3) {
			ageClassify = "36�����̸�";
		}

		// ������ ����
		if(number == 1 && (ageClassify == "����" || ageClassify == "û�ҳ�")) {
			switch(ticketType) {
			case 'A' : price = 60000;
			break;
			case 'B' : price = 56000;
			break;
			case 'C': price = 50000;
			break;
			default :	
			}
			preferential = "����";
		}
		if(number == 1 && (ageClassify == "����" || ageClassify == "���")) {
			switch(ticketType) {
			case 'A' : price = 48000;
			break;
			case 'B' : price = 44000;
			break;
			case 'C': price = 40000;
			break;
			default :
			}
			preferential = "����";
		}
		if(age < 3) {
			price = 0;
			preferential = "����";
		}	
		
		// �����
		if(number == 2 && ageClassify == "����") {
			switch(ticketType) {
			case 'A' : price = 36000;
			break;
			case 'B' : price = 33000;
			break;
			case 'C': price = 30000;
			break;
			default :
			}
			preferential = "�����";
		}
		if(number == 2 && (ageClassify == "����" || ageClassify == "û�ҳ�" || ageClassify == "���")) {
			switch(ticketType) {
			case 'A' : price = 28000;
			break;
			case 'B' : price = 26000;
			break;
			case 'C': price = 24000;
			break;
			default :
			}
			preferential = "�����";
		}	
		
		// ����������
		if(number == 3 && ageClassify == "����") {
			switch(ticketType) {
			case 'A' : price = 30000;
			break;
			case 'B' : price = 28000;
			break;
			case 'C': price = 25000;
			break;
			default :
			}
			preferential = "����������";
		}
		if(number == 3 && (ageClassify == "����" || ageClassify == "û�ҳ�" || ageClassify == "���")) {
			switch(ticketType) {
			case 'A' : price = 24000;
			break;
			case 'B' : price = 22000;
			break;
			case 'C': price = 20000;
			break;
			default :
			}
			preferential = "����������";
		}
		
		// ���ڳ�
		if(number == 4 && (ageClassify == "����" || ageClassify == "û�ҳ�")) {
			switch(ticketType) {
			case 'A' : price = 48000;
			break;
			case 'B' : price = 44000;
			break;
			case 'C': price = 40000;
			break;
			default :
			}
			preferential = "���ڳ�";
		}
		if(number == 4 && (ageClassify == "����" || ageClassify == "���")) {
			switch(ticketType) {
			case 'A' : price = 38000;
			break;
			case 'B' : price = 35000;
			break;
			case 'C': price = 32000;
			break;
			default :
			}
			preferential = "���ڳ�";
		}
		// �ӻ��
		if(number == 5 && ageClassify == "����") {
			switch(ticketType) {
			case 'A' : price = 51000;
			break;
			case 'B' : price = 47000;
			break;
			case 'C': price = 42000;
			break;
			default :
			}
			preferential = "�ӻ��";
		}			
		
		price = price * count;
		
		System.out.println("\n1. �߰�����, 2. �������� : ");
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
		System.out.printf("\n������ %d�� �Դϴ�.\n�����մϴ�.", total);
		System.out.println("\n");
		System.out.println("===================��������===================");
		for(int index = 0; index < arrayCount.size(); index++) {
			System.out.printf("%sƼ�� %s X %d  %d��  *%s�������\n", 
					arrayTicketType.get(index), arrayAgeClassify.get(index), 
					arrayCount.get(index), arrayPrice.get(index), arrayPreferential.get(index));	
		}
		
		System.out.println("============================================\n");
		
		}
			
	
}
