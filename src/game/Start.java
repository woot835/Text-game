package game;

import java.util.Random;

import library.TextIO;

public class Start {
	public static void main(String[] args) {
		Player player = new Player();
		BadGuys monsters = new BadGuys();
		Random rand = new Random();

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

		GAME: while (runs) {
			System.out.println("----------------------------------------------------------");
			int enemyHealth = rand.nextInt(BadGuys.MaxEnemyHealth) + 1;
			String enemy = BadGuys.enemies[rand.nextInt(BadGuys.enemies.length)];
			System.out.println(enemy + " has appeard! \n");

			int EncounterRate = player.RandomEncounter + 1;
			System.out.println(enemyHealth);

			while (enemyHealth > 0) {

				System.out.println("You can FIGHT, use an HEAL, check your PARTY or RUN");

				String answer = TextIO.getlnString();
				if (answer.equals("FIGHT")) {
					
					int dmgDone1 = rand.nextInt(player.Hero1Dmg);
					int dmgDone2 = rand.nextInt(player.Hero2Dmg);
					int dmgDone3 = rand.nextInt(player.Hero3Dmg);
					int dmgDone4 = rand.nextInt(player.Hero4Dmg);
					int dmgTotal = dmgDone1 + dmgDone2 + dmgDone3 + dmgDone4;
					int dmgTaken = rand.nextInt(monsters.enemyDmg);
					
					enemyHealth = enemyHealth - dmgTotal;
					System.out.println(Hero1 + " strikes the enemy for " + dmgDone1 + "damage! \n");
					System.out.println(Hero2 + " strikes the enemy for " + dmgDone2 + "damage! \n");
					System.out.println(Hero3 + " strikes the enemy for " + dmgDone3 + "damage! \n");
					System.out.println(Hero4 + " strikes the enemy for " + dmgDone4 + "damage! \n");
					if (enemyHealth < 0 ) {
						System.out.println("The foul " + enemy + " has been slain");
					}

				} else if (answer.equals("HEAL")) {
					if (player.numHP > 0) {
						System.out.println("You heal your entire party with one healing potion");
						player.Hero1Health = player.Hero1Health + rand.nextInt(player.HPHeal);
						player.Hero2Health = player.Hero2Health + rand.nextInt(player.HPHeal);
						player.Hero3Health = player.Hero3Health + rand.nextInt(player.HPHeal);
						player.Hero4Health = player.Hero4Health + rand.nextInt(player.HPHeal);
						player.numHP = player.numHP - 1;
					} else {
						System.out.println("You have no potions to use!");
					}
				} else if (answer.equals("PARTY")) {
					System.out.println(Hero1 + "'s health is " + player.Hero1Health + ".");
					System.out.println(Hero2 + "'s health is " + player.Hero2Health + ".");
					System.out.println(Hero3 + "'s health is " + player.Hero3Health + ".");
					System.out.println(Hero4 + "'s health is " + player.Hero4Health + ".");
				} else if (answer.equals("RUN")) {
					int Encounterrate = player.RandomEncounter - 1;
					if (Encounterrate < 0) {
						System.out.println(
								"The Party of " + Partyname + " is too frightened by the dungeon and have fled.");
						System.out.println("You lose \n");
						return;
					}
				} else {
					System.out.println("Incorrect Command, please try again. /n");
				}
			}
		}

	}

}
