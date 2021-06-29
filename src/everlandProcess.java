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
	 
	}
	
	public void checkPreferential(int number, char ticketType) {
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
		
	}
	
	
	
	
}
