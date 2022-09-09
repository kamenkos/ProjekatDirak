import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import LuckySix.Ball;
import java.io.File;
public class ProjektniZadatak {

	public static void main(String[] args) {

		Worker worker = new Worker("Srecko");
		String username;
		double accountMoney;

		System.out.println("Recite nam ime: ");
		Scanner sc = new Scanner(System.in);
		username = sc.next();
		System.out.println("Dobrodosli " + username + ",ja sam " + worker.getUsername());

		System.out.println("Koliki je ulog?");
		accountMoney = Double.parseDouble(sc.next());

		Player player = new Player(username,accountMoney);
		System.out.println("Uspesno ste kreirali profil");

		String nadimak = username.substring(0,3);
		System.out.println("Dacemo vam nadimak: " + nadimak );

		System.out.println("Da biste napravili kombinaciju unesite 6 brojeva za redom");
		ArrayList<Ball> combination = new ArrayList<>();

		for(int i = 1;i < 7; i++){
			System.out.println("Unesite " + i + " broj:");

				int number = Integer.parseInt(sc.next());
				if(number < 48) {
				Ball combinationNumber = new Ball(number);
				combination.add(combinationNumber);
			}
			else {
				System.out.println("Samo brojevi od 1 do 48");
				i-=1;
			}
		}


		BettingTicketLuckySix ticket1 = new BettingTicketLuckySix(accountMoney, null, combination);
		player.addTicket(ticket1);
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(player);
		LuckySix luckySix = new LuckySix();
		luckySix.createGame();
		luckySix.printGame();
		Results results = new Results();
		results.addLuckySix(luckySix);
		results.addPlayers(players);
		results.checkIfPlayersGotPrize();
		results.printWinners();
		results.printLosers();
		File myObj = new File("Rezultati.txt");
		try {
			FileWriter myWriter = new FileWriter("Rezultati.txt");
			myWriter.write(nadimak + " " + accountMoney);
			myWriter.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		System.out.println("Dokument sa stanjem mozete preuzeti u folderu projekta podm naziv je Rezulati.txt");
	}

}
