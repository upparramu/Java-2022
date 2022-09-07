package com.xworkz.interfaces2.pub;

public class PubRuleRunner {

	public static void main(String[] args) {

		PubRule pubRule= new CustomerPubRule();
		
		DownTownPub gym = new DownTownPub(pubRule);
		
		gym.check();
		
		

}
}