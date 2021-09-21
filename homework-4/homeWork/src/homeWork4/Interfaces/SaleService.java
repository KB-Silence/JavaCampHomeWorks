package homeWork4.Interfaces;

import homeWork4.Entities.Campaign;
import homeWork4.Entities.Game;
import homeWork4.Entities.User;

public interface SaleService {
	public void addToCart(User user, Game game);
	public void deleteFromCart(User user, Game game);
	public void buy(User user, Game game, Campaign campaign);
}
