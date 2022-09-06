package com.xworkz.interfacerules;

public interface HRRules extends ManagerRules, SecurityRules {

	boolean applyLeaves();

	boolean harrasment();
	
	@Override
	default boolean informLeave() {
		
		return false;
	}
	
	@Override
	default boolean workFromHome() {
		
		return false;
	}
	
	@Override
	default boolean parkingApproval() {
		
		return false;
	}
	
	@Override
	default boolean swipeCard() {
	
		return false;
	}

}
