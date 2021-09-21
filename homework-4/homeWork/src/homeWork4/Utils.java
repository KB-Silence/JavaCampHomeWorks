package homeWork4;

import homeWork4.Entities.Campaign;
import homeWork4.Entities.Game;

public class Utils {

	public static void getGamesList(Game[] games) {
		for (Game game : games) {
			System.out.println(game.getId() + ". " + game.getGameName() + " " + game.getGamePrice() + " TL");
		}
	}
	
	public static void getCampaignList(Campaign[] campaigns) {
		for (Campaign campaign : campaigns) {
			System.out.println(campaign.getId() + ". " + campaign.getName() + " ---Kampanya Açıklaması: " + campaign.getDescription());
		}
	}
}
