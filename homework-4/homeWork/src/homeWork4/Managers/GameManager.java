package homeWork4.Managers;

import homeWork4.Utils;
import homeWork4.Abstract.BaseGameManager;
import homeWork4.Entities.Game;


public class GameManager extends BaseGameManager{

	@Override
	public void listGames(Game[] games) {
		System.out.println("Sistemdeki Oyunların Listesi: \n");
		Utils.getGamesList(games);
	}
}
