package javaChap2;

import java.util.ArrayList;
import java.util.Scanner;

public class everland {
	
	public static void main(String[] args) {
		everlandProcess everProcess = new everlandProcess();
		arrayListClass arrayData = new arrayListClass();
		inputProcess inputProcess = new inputProcess();
		
		arrayData.allClear();
		do {
			inputProcess.inputDate();
			inputProcess.inputID();
			everProcess.ageClassify(inputProcess.birthDate, inputProcess.date);
			inputProcess.inputPreferential();
			everProcess.checkPreferential(inputProcess.number, inputProcess.ticketType);
			inputProcess.inputcount(everProcess.price);
			inputProcess.inputAddOrder();
			arrayData.addArrayList(inputProcess.ticketType, everProcess.ageClassify, inputProcess.count, 
					everProcess.price, everProcess.preferential);
		} while(inputProcess.addOrder == 1);
		arrayData.totalPrice();
		arrayData.checkFinalTicket();		
		}			
	
}