package gameBackend.Entity;

public class Campaign extends BaseEntity {
		private String campaignName;
		private String campaignDescription;
		public Campaign(long id, String campaignName, String campaignDescription) {
			super(id);
			this.campaignName = campaignName;
			this.campaignDescription = campaignDescription;
		}
		public String getCampaignName() {
			return campaignName;
		}
		public void setCampaignName(String campaignName) {
			this.campaignName = campaignName;
		}
		public String getCampaignDescription() {
			return campaignDescription;
		}
		public void setCampaignDescription(String campaignDescription) {
			this.campaignDescription = campaignDescription;
		}
		
		
}
