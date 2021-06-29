package javaChap2;

import java.util.ArrayList;
import java.util.Scanner;

public class everlandProcess {

	
	public String preferential = null;
	public String ageClassify = null;
	public int age, price;
	public Scanner myInput = new Scanner(System.in);


	public void ageClassify(int birthDate, int date) {
		int baseYear, birthYear;
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
	 
	}
	
	public void checkPreferential(int number, char ticketType) {
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
		
	}
	
	
	
	
}
