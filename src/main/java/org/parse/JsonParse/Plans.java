package org.parse.JsonParse;

public class Plans {
	
	int paymentAmount ;

    String planId ;

    String planName ;
    
    public int getPaymentAmount() {
        return paymentAmount;
    }

    public String getPlanId() {
        return planId;
    }

    public String getPlanName() {
        return planName;
    }
    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }
    
    public String toString() {
    	return  "paymentAmount: "+paymentAmount+ "\t planId: "+planId+ "\tplanName: " + planName ;
    }

}
