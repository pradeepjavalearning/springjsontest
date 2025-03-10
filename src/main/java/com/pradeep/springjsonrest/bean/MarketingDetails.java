package com.pradeep.springjsonrest.bean;

public class MarketingDetails extends DepartmentDetails {
	private String campaignName;

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }
}
