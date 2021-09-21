package homeWork4.Abstract;

import homeWork4.Utils;
import homeWork4.Entities.Campaign;
import homeWork4.Interfaces.CampaignService;

public abstract class BaseCampaignManager implements CampaignService{

	@Override
	public void newCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyası sisteme eklendi.");
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyası sistemden silindi.");
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyası güncellendi.");
	}
	
	@Override
	public void listCampaigns(Campaign[] campaigns) {
		System.out.println("\nSistemdeki Kampanyaların Listesi: \n");
		Utils.getCampaignList(campaigns);
	}
}
