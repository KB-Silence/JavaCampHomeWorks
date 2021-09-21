package homeWork4.Interfaces;

import homeWork4.Entities.Game;

public interface GameService {
	public void add(Game game);
	public void update(Game game);
	public void delete(Game game);
	public void listGames(Game[] games);

}
