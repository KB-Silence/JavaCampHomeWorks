package homeWork4.Adapters;


import homeWork4.Entities.Campaign;
import homeWork4.Entities.Game;
import homeWork4.Interfaces.CampaignCalculateService;

public class CampaignCalculateManager implements CampaignCalculateService{

	private double calculate;
	
	@Override
	public double getPriceAfterCampaign(Campaign campaign, Game game) {
		this.calculate = game.getGamePrice() - (game.getGamePrice() * campaign.getDiscount() / 100);
		return Math.floor(calculate);
	}

}
