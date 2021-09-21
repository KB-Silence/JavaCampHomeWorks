package homeWork4.Interfaces;

import homeWork4.Entities.Campaign;
import homeWork4.Entities.Game;

public interface CampaignCalculateService {
	public double getPriceAfterCampaign(Campaign campaign, Game game);
}
