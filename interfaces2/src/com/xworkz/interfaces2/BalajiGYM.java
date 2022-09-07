package com.xworkz.interfaces2;

public class BalajiGYM implements GymRule {
	


@Override
public boolean wearingShoe() {
 System.out.println("Wearing Shoes mandatory while entering the GYM");
	return true;
}

@Override
public boolean uniSex() {
	System.out.println("allow both Male/Female to GYM");
	return true;
}

@Override
public double montlyFees() {
	System.out.println("on montly basis payed the fees");
	return 500;
}

}
