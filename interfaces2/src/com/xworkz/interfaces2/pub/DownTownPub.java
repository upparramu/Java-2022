package com.xworkz.interfaces2.pub;

public class DownTownPub {

	private PubRule pubRule;

	public DownTownPub(PubRule pubRule) {

		System.out.println("constructor of PubRule");

		this.pubRule = pubRule;

	}

	public void check() {

		boolean dressCodeFollowed = pubRule.dressCodeFollowed();
		int age = pubRule.age();
		boolean validProof = pubRule.validProof();

		if (dressCodeFollowed && validProof && age > 20) {
			System.out.println("Pub Rules are following");
		} else {
			System.out.println("pub rules are not following");
		}
	}

}
