package homeWork4;

import java.time.LocalDate;

import homeWork4.Abstract.BaseCampaignManager;
import homeWork4.Abstract.BaseGameManager;
import homeWork4.Abstract.BaseSaleManager;
import homeWork4.Abstract.BaseUserManager;
import homeWork4.Adapters.CampaignCalculateManager;
import homeWork4.Adapters.MernisServiceManager;
import homeWork4.Entities.Campaign;
import homeWork4.Entities.Game;
import homeWork4.Entities.User;
import homeWork4.Managers.CampaignManager;
import homeWork4.Managers.GameManager;
import homeWork4.Managers.SaleManager;
import homeWork4.Managers.UserManager;

public class Main {

	public static void main(String[] args) {
		
		BaseUserManager userManager = new UserManager(new MernisServiceManager());
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Berkcan");
		user1.setLastName("Serbest");
		user1.setEmail("berkcanserbest5@gmail.com");
		user1.setPassword("12345678");
		user1.setNickname("Silence");
		user1.setNationalityId("40465546712");
		user1.setBirthDate(LocalDate.of(1997, 2, 14));
		
		userManager.add(user1);
		userManager.update(user1);
		userManager.remove(user1);
		
		System.out.println("---------------------------------------------------------------");
		
		BaseCampaignManager campaignManager = new CampaignManager();
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setName("ProductDal Günleri");
		campaign1.setDescription("Bir oyun alana ikinci oyun %50 indirimli fiyata. Son gün 20 Mayıs. Unutma sen bir IProductDalsın.");
		campaign1.setDiscount(50);
		
		campaignManager.newCampaign(campaign1);
		campaignManager.updateCampaign(campaign1);
		campaignManager.deleteCampaign(campaign1);
		
		Campaign campaign2 = new Campaign();
		campaign2.setId(2);
		campaign2.setName("Öğrenci Çıldırdı!");
		campaign2.setDescription("Öğrenciler Çıldırdı! Önümüzdeki 3 saat içerisinde ne alırsan %75 indirimli fiyata. Çabuk ol, fırsatları kaçırma.");
		campaign2.setDiscount(75);
		
		campaignManager.newCampaign(campaign2);
		campaignManager.updateCampaign(campaign2);
		campaignManager.deleteCampaign(campaign2);
		
		System.out.println("---------------------------------------------------------------");
		
		BaseGameManager gameManager = new GameManager();
		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("The Elder Scrolls V: Skyrim");
		game1.setGamePrice(114.99);
		Game game2 = new Game();
		game2.setId(2);
		game2.setGameName("The Witcher 3: Wild Hunt");
		game2.setGamePrice(59.99);
		
		gameManager.add(game1);
		gameManager.update(game1);
		gameManager.delete(game1);
		
		gameManager.add(game2);
		gameManager.update(game2);
		gameManager.delete(game2);
		
		
		
		System.out.println("-----------------------------------------------------------------------");
		
		BaseSaleManager saleManager = new SaleManager(new CampaignCalculateManager());
		saleManager.addToCart(user1, game1);
		saleManager.deleteFromCart(user1, game1);
		saleManager.buy(user1, game1, campaign1);
		
		saleManager.addToCart(user1, game2);
		saleManager.deleteFromCart(user1, game2);
		saleManager.buy(user1, game2, campaign2);
		
		System.out.println("-----------------------------------------------------------------------");
		
		Game[] games = new Game[] {game1, game2};
		gameManager.listGames(games);
		Campaign[] campaigns = new Campaign[] {campaign1, campaign2};
		campaignManager.listCampaigns(campaigns);
	}

}
