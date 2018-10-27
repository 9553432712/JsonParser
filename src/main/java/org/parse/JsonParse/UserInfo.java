package org.parse.JsonParse;

import java.util.List;

public class UserInfo {
	
	boolean billableUser;
    BillingAddress billingAddress;
    List<Plans> plans;
    String subscriberId;

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getSubscriberId() {
        return subscriberId;
    }

    public void setBillableUser(boolean billableUser) {
        this.billableUser = billableUser;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setPlans(List<Plans> plans) {
        this.plans = plans;
    }

    public List<Plans> getPlans() {
        return plans;
    }

    public boolean isBillableUser() {
        return billableUser;
    }

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }
}
