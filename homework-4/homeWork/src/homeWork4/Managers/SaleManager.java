package homeWork4.Managers;

import homeWork4.Abstract.BaseSaleManager;
import homeWork4.Entities.Campaign;
import homeWork4.Entities.Game;
import homeWork4.Entities.User;
import homeWork4.Interfaces.CampaignCalculateService;

public class SaleManager extends BaseSaleManager {
	
	private CampaignCalculateService calculateService;

	public SaleManager(CampaignCalculateService calculateService) {
		this.calculateService = calculateService;
	}
	
	@Override
	public void buy(User user, Game game, Campaign campaign) {
		System.out.println(user.getNickname() + " alışveriş başarılı. " + game.getGameName() + " oyununu " + game.getGamePrice() + " TL yerine kampanyadan yararlanarak " + 
							this.calculateService.getPriceAfterCampaign(campaign, game) + " TL'ye satın aldınız. ");
	}

}
