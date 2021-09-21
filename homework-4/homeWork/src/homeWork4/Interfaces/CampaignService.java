package homeWork4.Interfaces;

import homeWork4.Entities.Campaign;

public interface CampaignService {
	public void newCampaign(Campaign campaign);
	public void deleteCampaign(Campaign campaign);
	public void updateCampaign(Campaign campaign);
	public void listCampaigns(Campaign[] campaigns);
}
