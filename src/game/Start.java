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
		System.out.println("Now," + Partyname + ", You just walked into the first room of the dungeon and are besiged by a foul monster!");
		
		boolean runs = true;
		
		GAME:
		while (runs) {
			System.out.println("----------------------------------------------------------");
			int enemyHealth = rand.nextInt(BadGuys.MaxEnemyHealth) + 1;
			String enemy = BadGuys.enemies[rand.nextInt(BadGuys.enemies.length)];
			System.out.println(enemy + " has appeard! \n");
			
			int EncounterRate = player.RandomEncounter + 1; 
			System.out.println(enemyHealth);
		
			while (enemyHealth > 0) {
				
				
				System.out.println("You can FIGHT, use an HEAL, check your PARTY or RUN");
				
				
			}
		
				
		}
		
		

		
	}
}
