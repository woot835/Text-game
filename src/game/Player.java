package game;

import game.Util;
public class Player {

	int Hero1Health = Util.randomIntInclusive(200, 400); // Hero Health and Damage, randomized at the start
	int Hero1Dmg = Util.randomIntInclusive(20, 80);
	
	int Hero2Health = Util.randomIntInclusive(200, 400);
	int Hero2Dmg = Util.randomIntInclusive(20, 80);
	
	int Hero3Health = Util.randomIntInclusive(200, 400);
	int Hero3Dmg = Util.randomIntInclusive(20, 80);
	
	int Hero4Health = Util.randomIntInclusive(200, 400);
	int Hero4Dmg = Util.randomIntInclusive(20, 80);
	
	int numHP = 5; // Number of healing potions
	int HPHeal = 100; //How much it heals for
	
}
