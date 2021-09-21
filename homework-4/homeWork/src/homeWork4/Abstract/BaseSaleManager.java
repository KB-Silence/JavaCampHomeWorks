package homeWork4.Abstract;



import homeWork4.Entities.Game;
import homeWork4.Entities.User;
import homeWork4.Interfaces.SaleService;

public abstract class BaseSaleManager implements SaleService{
	
	@Override
	public void addToCart(User user, Game game) {
		System.out.println(user.getNickname() + " " + game.getGameName() + " oyununu sepete ekledin.");
	}

	@Override
	public void deleteFromCart(User user, Game game) {
		System.out.println(user.getNickname() + " " + game.getGameName() + " oyununu sepetten sildin.");
	}
}
