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
		System.out.printf("\n������ %d�� �Դϴ�.\n�����մϴ�.", total);
	}
	
	public static void checkFinalTicket() {
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
