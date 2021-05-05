package gameBackend.Manager;

import gameBackend.Entity.Campaign;
import gameBackend.Entity.Order;

public class OrderManager implements BaseService<Order>{

	@Override
	public void add(Order object) {
		System.out.println(object.getMyUser().getFirstName()+" adlı kullanıcı "+object.getMyGame().getGameName()+" adlı oyunu sipariş etti.");
		
	}

	@Override
	public void update(long id, Order object) {
		
		
	}

	@Override
	public void delete(long id, Order object) {
		System.out.println(object.getMyUser().getFirstName()+" adlı kullanıcı "+object.getMyGame().getGameName()+" adlı oyunu iptal etti.");
		
	}
	
	public void addCampaign(Campaign myCampaign,Order object) {
		object.setMyCampaign(myCampaign);
		System.out.println(myCampaign.getCampaignName()+" adlı kampanya "+object.getMyGame()+" adlı ürüne uygulandı.");
	}

}
