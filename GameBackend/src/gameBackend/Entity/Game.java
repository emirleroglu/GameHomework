package gameBackend.Entity;

public class Game extends BaseEntity{
		private String gameName;
		private String gameDescription;
		private double price;
		public Game(long id, String gameName, String gameDescription, double price) {
			super(id);
			this.gameName = gameName;
			this.gameDescription = gameDescription;
			this.price = price;
		}
		public String getGameName() {
			return gameName;
		}
		public void setGameName(String gameName) {
			this.gameName = gameName;
		}
		public String getGameDescription() {
			return gameDescription;
		}
		public void setGameDescription(String gameDescription) {
			this.gameDescription = gameDescription;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		
		
}
