package game;

import game.Util;
public class Player {

	int Hero1Health = Util.randomIntInclusive(200, 400);
	int Hero1Dmg = Util.randomIntInclusive(20, 80);
	
	int Hero2Health = Util.randomIntInclusive(200, 400);
	int Hero2Dmg = Util.randomIntInclusive(20, 80);
	
	int Hero3Health = Util.randomIntInclusive(200, 400);
	int Hero3Dmg = Util.randomIntInclusive(20, 80);
	
	int Hero4Health = Util.randomIntInclusive(200, 400);
	int Hero4Dmg = Util.randomIntInclusive(20, 80);
	
	int numHP = 5;
	int HPHeal = 100;
	int HPDrop = 20; // 20%
	int RandomEncounter = 0;
	
}
