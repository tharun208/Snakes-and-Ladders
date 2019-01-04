package zomato;
import java.util.*;
public class GamePlay {
	private static Scanner scanner = new Scanner(System.in);
	private static Random random = new Random();
	private static int noOfPlayers;
	// Method to get count of no . of Player's playing
	public int initiateNoOfPlayers() {
		int players = 0;
		try {
			players = scanner.nextInt();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return players;
	}
	// Method to determine players to play in sequential order based on their initial Die Throw
	private static List<Player> whichPlayertoStart(int noOfPlayers) {
		TreeMap<Integer,List<Player>> playersMap = new TreeMap<Integer,List<Player>>(Collections.reverseOrder());
		for(int i=1;i<=noOfPlayers; i++) {
			int chance = random.nextInt(6) + 1;
			Player player = new Player();
			player.setId(i);
			player.setPosition(1);
			if(! playersMap.containsKey(chance)){
				playersMap.put(chance, new ArrayList<Player>());
			}
			playersMap.get(chance).add(player);
			System.out.println("Player "+i+" rolls die scoring "+chance);
		}
		Iterator<?> it = playersMap.entrySet().iterator();
		List<Player> playersList = new ArrayList<Player>();
		while(it.hasNext()){
			playersList.addAll(((Map.Entry<Integer,List<Player>>) it.next()).getValue());
		}
		return playersList;
	}
	// Method for GamePlay
	private static void startGamePlay(List<Player> player2,Map<Integer, Integer> ladderandSnakePosition) {
		System.out.println("Enter the No.Of Throws");
		int noOfThrows = scanner.nextInt();
		for(int i=0; i<noOfThrows; i++) {
		  for(int j=1;j<=player2.size(); j++) {
		   int dicethrow = random.nextInt(6) + 1;
		   System.out.println("Player "+j+" throws "+dicethrow);
		   Player player = player2.get(j-1);
		   player.oldPosition = player.getPosition();
		if(ladderandSnakePosition.containsKey(dicethrow)) { // checks for a snake or ladder is found
			   player.currentPosition = ladderandSnakePosition.get(dicethrow); // get the position of ladder tail or snake head
			   player.setPosition(player.currentPosition);
		   } else {
			   player.currentPosition = player.getPosition() + dicethrow; // update the position
			   player.setPosition(player.currentPosition);
		   }
	     }
		}
	}
  public static void main(String args[]) {
	  GameBoard.initializeSnakeandLadderPositions();
	  GamePlay play = new GamePlay();
	  noOfPlayers = play.initiateNoOfPlayers();
	  System.out.println("The game started with "+noOfPlayers+" players");
	  List<Player> player = whichPlayertoStart(noOfPlayers);
	  System.out.println("Player "+player.get(0).id+" gets to start");
	  startGamePlay(player, GameBoard.ladderandSnakePosition);
	  System.out.println("The Position after the sequence of throws");
	  for(int i=1;i<=player.size();i++) {
		  System.out.println("Player"+i+" - "+player.get(i-1).getPosition());
	  }
  }
}

