package javaChap2;

import java.util.ArrayList;
import java.util.Scanner;

public class everland {
	
	public static void main(String[] args) {
		everlandProcess everProcess = new everlandProcess();
		arrayListClass everlandData = new arrayListClass();
		
		everlandData.allClear();
		do {
			everProcess.inputDate();
			everProcess.inputID();
			everProcess.ageClassify();
			everProcess.inputPreferential();
			everProcess.checkPreferential();
			everProcess.inputcount();
			everProcess.inputAddOrder();
			everlandData.addArrayList(everProcess.ticketType, everProcess.ageClassify, everProcess.count, 
									everProcess.price, everProcess.preferential);
		} while(everProcess.addOrder == 1);
		everlandData.totalPrice();
		everlandData.checkFinalTicket();		
		}			
	
}