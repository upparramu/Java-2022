package com.xworkz.interfacerules;

public class ITRulesFollower implements HRRules,SecurityRules,ManagerRules {

	@Override
	public boolean informLeave() {
		
		System.out.println("--Waiting Approval from MR.Omkar--");
		
		return true;
	}

	@Override
	public boolean workFromHome() {
		
		System.out.println("--Waiting Approval from Work From Home--");
		return true;
	}

	@Override
	public boolean swipeCard() {
		
		System.out.println("--Waiting for swiping card--");
		return true;
	}

  @Override
	public boolean parkingApproval() {
		
	  System.out.println("--waiting from parking place--");
		return true;
	}

   @Override
	public boolean applyLeaves() {
		
	   System.out.println("--applying leave for festival--");
		return true;
	}

	@Override
	public boolean harrasment() {
		
		System.out.println("--harrasment on girl to avoiding me--");
		
		return true;
	}
	
	

}
