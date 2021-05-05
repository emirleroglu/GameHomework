import java.util.Date;

import gameBackend.Entity.Campaign;
import gameBackend.Entity.Game;
import gameBackend.Entity.Order;
import gameBackend.Entity.User;
import gameBackend.Manager.BaseService;
import gameBackend.Manager.CampaignManager;
import gameBackend.Manager.GameManager;
import gameBackend.Manager.OrderManager;
import gameBackend.Manager.UserCheckManager;

import gameBackend.Manager.UserManager;

public class Main {

	public static void main(String[] args) {
		
		Game myGame= new Game(1, "warPath","war game", 20.0);
		User myUser = new User(2, "Murat", "muratyılmaz@", "1234", "Yılmaz", "20170301036278", 1990);
		
		Campaign myCampaign = new Campaign(3, "Yarısı bedava", "%50 indirim uygulanır.");
		
		Order myOrder = new Order(4, myUser, myGame, new Date());
		
		BaseService<Game> myService = new GameManager();
		myService.add(myGame);
		BaseService<Order> myService2 = new OrderManager();
		myService2.add(myOrder);
		BaseService<Campaign> myService3 = new CampaignManager();
		myService3.delete(3, myCampaign);
		BaseService<User> myService4 = new UserManager(new UserCheckManager());
		myService4.add(myUser);
		
	}

}
