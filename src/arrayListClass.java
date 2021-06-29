package javaChap2;

import java.util.ArrayList;

public class arrayListClass {

	public static ArrayList<Character> arrayTicketType = new ArrayList<Character>();
	public static ArrayList<String> arrayAgeClassify = new ArrayList<String>();
	public static ArrayList<Integer> arrayCount = new ArrayList<Integer>();
	public static ArrayList<Integer> arrayPrice = new ArrayList<Integer>();
	public static ArrayList<String> arrayPreferential = new ArrayList<String>();
	
	public static void allClear() {
		arrayTicketType.clear();
		arrayAgeClassify.clear();
		arrayCount.clear();
		arrayPrice.clear();
		arrayPreferential.clear();	
	}
	
	public static void addArrayList(char ticketType, String ageClassify, int count, int price, String preferential) {
		arrayTicketType.add(ticketType);
		arrayAgeClassify.add(ageClassify);
		arrayCount.add(count);
		arrayPrice.add(price);
		arrayPreferential.add(preferential);
	}
	
	public static void totalPrice() {
		int total = 0;
		for(int index = 0; index < arrayPrice.size(); index++) {
			total += arrayPrice.get(index);			
		}
		System.out.printf("\n가격은 %d원 입니다.\n감사합니다.", total);
	}
	
	public static void checkFinalTicket() {
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
