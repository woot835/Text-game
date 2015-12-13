package game;

import java.util.Random;

import library.TextIO;

public class Start {

	public static void main(String[] args) {
		Player player = new Player();
		BadGuys monsters = new BadGuys();
		Random rand = new Random();
		int RandomEncounter = 0;
		int Killcount = 0;

		System.out.println("Welcome to this text based game made by me, Meelis Hass from C11");
		System.out.println("You have entered the Dungeon of Adventure, please give me name of your party.");
		String Partyname = TextIO.getlnString();
		System.out.println(Partyname + ", what a fine name.");
		System.out.println("Now tell me, what are the name of the four heroes in your party?");
		System.out.println("Enter the first name");
		String Hero1 = TextIO.getlnString();
		System.out.println("Enter the second name");
		String Hero2 = TextIO.getlnString();
		System.out.println("Enter the third name");
		String Hero3 = TextIO.getlnString();
		System.out.println("Enter the fourth name");
		String Hero4 = TextIO.getlnString();
		System.out.println("Now, " + Partyname
				+ ", You just walked into the first room of the dungeon and are besiged by a foul monster!");

		boolean runs = true;

		while (runs) {

			int enemyHealth = rand.nextInt(BadGuys.MaxEnemyHealth) + 1;
			String enemy = BadGuys.enemies[rand.nextInt(BadGuys.enemies.length)];
			if (RandomEncounter == 3) {
				enemyHealth = monsters.bossHealth;
				monsters.enemyDmg = monsters.bossDmg;
				enemy = monsters.Boss;
			}
			System.out.println("----------------------------------------------------------");
			System.out.println(enemy + " has appeard! \n");

			while (enemyHealth > 0) {
				RandomEncounter = RandomEncounter + 1;
				if (areAllPlayersDead(player)) {
					System.out.println("The Dungeon consumes another party");
					System.out.println("You killed " + Killcount + " while playing.");
					return;
				}

				System.out.println("You can FIGHT, use an HEAL, check your PARTY or RUN");

				String answer = TextIO.getlnString();
				if (answer.equals("FIGHT")) { // Lets heroes fight.

					int dmgDone1 = player.Hero1Dmg <= 0 ? 0 : rand.nextInt(player.Hero1Dmg);
					int dmgDone2 = player.Hero2Dmg <= 0 ? 0 : rand.nextInt(player.Hero2Dmg);
					int dmgDone3 = player.Hero3Dmg <= 0 ? 0 : rand.nextInt(player.Hero3Dmg);
					int dmgDone4 = player.Hero4Dmg <= 0 ? 0 : rand.nextInt(player.Hero4Dmg);
					int dmgTotal = dmgDone1 + dmgDone2 + dmgDone3 + dmgDone4;
					int dmgTaken = rand.nextInt(monsters.enemyDmg);
					int target = Util.randomIntInclusive(0, 3);

					if (target == 0 && player.Hero1Health > 0) { // Checks if
																	// hero is
																	// chosen by
																	// RNG and
																	// is alive
						player.Hero1Health = player.Hero1Health - dmgTaken;
						System.out.println(Hero1 + " has taken " + dmgTaken + " amount of damage! \n");
					} else if (target == 1 && player.Hero2Health > 0) {
						player.Hero2Health = player.Hero2Health - dmgTaken;
						System.out.println(Hero2 + " has taken " + dmgTaken + " amount of damage! \n");
					} else if (target == 2 && player.Hero3Health > 0) {
						player.Hero3Health = player.Hero3Health - dmgTaken;
						System.out.println(Hero3 + " has taken " + dmgTaken + " amount of damage! \n");
					} else if (target == 3 && player.Hero4Health > 0) {
						player.Hero4Health = player.Hero4Health - dmgTaken;
						System.out.println(Hero4 + " has taken " + dmgTaken + " amount of damage! \n");
					} else {
					}
					if (player.Hero1Health < 0) { // Yells if player is not
													// alive
						System.out.println("----------------------------------------------------------");
						System.out.println(Hero1 + " has died");
						System.out.println("----------------------------------------------------------");
						player.Hero1Health = 0;
						player.Hero1Dmg = 0;
					}
					if (player.Hero2Health < 0) {
						System.out.println("----------------------------------------------------------");
						System.out.println(Hero2 + " has died");
						System.out.println("----------------------------------------------------------");
						player.Hero2Health = 0;
						player.Hero2Dmg = 0;
					}
					if (player.Hero3Health < 0) {
						System.out.println("----------------------------------------------------------");
						System.out.println(Hero3 + " has died");
						System.out.println("----------------------------------------------------------");
						player.Hero3Health = 0;
						player.Hero3Dmg = 0;
					}
					if (player.Hero4Health < 0) {
						System.out.println("----------------------------------------------------------");
						System.out.println(Hero4 + " has died");
						System.out.println("----------------------------------------------------------");
						player.Hero4Dmg = 0;
						player.Hero4Health = 0;
					}

					enemyHealth = enemyHealth - dmgTotal;

					if (player.Hero1Health > 0) { // Yells who did how much
													// damage , or if they are
													// dead
						System.out.println(Hero1 + " strikes the enemy for " + dmgDone1 + " damage! \n");
					} else {
						System.out.println(Hero1 + " is dead \n");
					}
					if (player.Hero2Health > 0) {
						System.out.println(Hero2 + " strikes the enemy for " + dmgDone2 + " damage! \n");
					} else {
						System.out.println(Hero2 + " is dead \n");
					}
					if (player.Hero3Health > 0) {
						System.out.println(Hero3 + " strikes the enemy for " + dmgDone3 + " damage! \n");
					} else {
						System.out.println(Hero3 + " is dead \n");
					}
					if (player.Hero4Health > 0) {
						System.out.println(Hero4 + " strikes the enemy for " + dmgDone4 + " damage! \n");
					} else {
						System.out.println(Hero4 + " is dead \n");
					}
					if (enemyHealth < 0) {
						System.out.println("The foul " + enemy + " has been slain");
						Killcount = Killcount + 1;
					}

				} else if (answer.equals("HEAL")) { // Lets the party heal if
													// they have healing
													// potions.
					if (player.numHP > 0) {
						System.out.println("You heal your entire party with one healing potion \n");
						player.Hero1Health = player.Hero1Health + rand.nextInt(player.HPHeal);
						player.Hero2Health = player.Hero2Health + rand.nextInt(player.HPHeal);
						player.Hero3Health = player.Hero3Health + rand.nextInt(player.HPHeal);
						player.Hero4Health = player.Hero4Health + rand.nextInt(player.HPHeal);
						player.numHP = player.numHP - 1;
						System.out.println("You have " + player.numHP + " health potions left");
					} else {
						System.out.println("You have no potions to use! \n");
					}
				} else if (answer.equals("PARTY")) { // Shows how much health
														// the party has.
					System.out.println(Hero1 + "'s health is " + player.Hero1Health + ".");
					System.out.println(Hero2 + "'s health is " + player.Hero2Health + ".");
					System.out.println(Hero3 + "'s health is " + player.Hero3Health + ".");
					System.out.println(Hero4 + "'s health is " + player.Hero4Health + ".");
				} else if (answer.equals("RUN")) {
					RandomEncounter = RandomEncounter - 1;
					if (RandomEncounter < 0) {
						System.out.println( // Happens if you RUN too many
											// times, ends the program
								"The Party of " + Partyname + " is too frightened by the dungeon and have fled.");
						System.out.println("You lose \n");
						return;
					}
				} else { // If given command is incorrect, asks for the person
							// to retry.
					System.out.println("Incorrect Command, please try again. \n");
				}

			}

		}

	}

	public static boolean areAllPlayersDead(Player player) { // to check if all
																// players are
																// dead
		return player.Hero1Health <= 0 && player.Hero2Health <= 0 && player.Hero3Health <= 0 && player.Hero4Health <= 0;
	}

}
