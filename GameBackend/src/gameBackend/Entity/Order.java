package gameBackend.Entity;

import java.util.Date;

public class Order extends BaseEntity {
	
	Campaign myCampaign;
	User myUser;
	Game myGame;
	Date orderDate;
	public Order(long id, User myUser, Game myGame, Date orderDate,Object...args) {
		super(id);
		this.myUser = myUser;
		this.myGame = myGame;
		this.orderDate = orderDate;
	}
	public Campaign getMyCampaign() {
		return myCampaign;
	}
	public void setMyCampaign(Campaign myCampaign) {
		this.myCampaign = myCampaign;
	}
	public User getMyUser() {
		return myUser;
	}
	public void setMyUser(User myUser) {
		this.myUser = myUser;
	}
	public Game getMyGame() {
		return myGame;
	}
	public void setMyGame(Game myGame) {
		this.myGame = myGame;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	
}
