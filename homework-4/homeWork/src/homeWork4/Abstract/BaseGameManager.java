package homeWork4.Abstract;

import homeWork4.Entities.Game;
import homeWork4.Interfaces.GameService;

public abstract class BaseGameManager implements GameService{
	@Override
	public void add(Game game) {
		System.out.println(game.getGamePrice() + " TL değerindeki " + game.getGameName() + " oyunu sisteme eklendi.");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " oyunu sistemden silindi.");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " oyunu güncellendi.");
	}
}
