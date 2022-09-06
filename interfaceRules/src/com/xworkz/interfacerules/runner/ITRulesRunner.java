package com.xworkz.interfacerules.runner;

import com.xworkz.interfacerules.HRRules;
import com.xworkz.interfacerules.ITRulesFollower;
import com.xworkz.interfacerules.ManagerRules;
import com.xworkz.interfacerules.SecurityRules;

public class ITRulesRunner {

	public static void main(String[] args) {
		
		ITRulesFollower rules = new ITRulesFollower();
		rules.applyLeaves();
		rules.harrasment();
		rules.swipeCard();
		rules.parkingApproval();
		rules.informLeave();
		rules.workFromHome();
		
		System.out.println("----- *-----");
		
		HRRules rules2 =(ITRulesFollower) rules;
		rules2.applyLeaves();
		rules2.harrasment();
		
		System.out.println("----- *-----");
		
		SecurityRules rules3 = (ITRulesFollower) rules;
		rules3.swipeCard();
		rules3.parkingApproval();
		
		System.out.println("----- *-----");
		
		ManagerRules rules4 = (ITRulesFollower) rules;
		rules4.informLeave();
		rules4.workFromHome();
		
		
			
		
		
				

	}

}
