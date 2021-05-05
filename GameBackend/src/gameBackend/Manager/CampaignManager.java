package gameBackend.Manager;

import gameBackend.Entity.Campaign;

public class CampaignManager implements BaseService<Campaign>{

	@Override
	public void add(Campaign object) {
		System.out.println(object.getCampaignName()+" adlı kampanya eklendi.");
		
	}

	@Override
	public void update(long id, Campaign object) {
		System.out.println(object.getId()+" id'li kampanya güncellendi.");
		
	}

	@Override
	public void delete(long id, Campaign object) {
		System.out.println(object.getId()+" id'li kampanya silindi.");
		
	}

}
