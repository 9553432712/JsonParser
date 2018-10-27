package org.parse.JsonParse;

public class BillingAddress {
	
	String city;

    String state ;

    String streetAddress;

    int zipCode;

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public int getZipCode() {
        return zipCode;
    }
    
    public String toString() {
    	return  "city: "+city+ "\t state: "+state+ "\tstreetAddress: " + streetAddress+"\tzipCode:"+zipCode ;
    }
}
