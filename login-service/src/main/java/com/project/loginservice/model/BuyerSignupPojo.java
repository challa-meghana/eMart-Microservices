package com.project.loginservice.model;

import java.util.*;

public class BuyerSignupPojo {

	private int buyerId;

	private String buyerUsername;

	private String buyerPassword;

	private String buyerEmail;

	private long buyerMobile;

	private Date buyerDate;

	private Set<BillPojo> allBills;

	public Set<BillPojo> getAllBills() {
		return allBills;
	}

	public void setAllBills(Set<BillPojo> allBills) {
		this.allBills = allBills;
	}

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerUsername() {
		return buyerUsername;
	}

	public void setBuyerUsername(String buyerUsername) {
		this.buyerUsername = buyerUsername;
	}

	public String getBuyerPassword() {
		return buyerPassword;
	}

	public void setBuyerPassword(String buyerPassword) {
		this.buyerPassword = buyerPassword;
	}

	public String getBuyerEmail() {
		return buyerEmail;
	}

	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}

	public long getBuyerMobile() {
		return buyerMobile;
	}

	public void setBuyerMobile(long buyerMobile) {
		this.buyerMobile = buyerMobile;
	}

	public Date getBuyerDate() {
		return buyerDate;
	}

	public void setBuyerDate(Date buyerDate) {
		this.buyerDate = buyerDate;
	}

	public BuyerSignupPojo(int buyerId, String buyerUsername, String buyerPassword, String buyerEmail, long buyerMobile,
			Date buyerDate, Set<BillPojo> allBills) {
		super();
		this.buyerId = buyerId;
		this.buyerUsername = buyerUsername;
		this.buyerPassword = buyerPassword;
		this.buyerEmail = buyerEmail;
		this.buyerMobile = buyerMobile;
		this.buyerDate = buyerDate;
		this.allBills = allBills;
	}

	public BuyerSignupPojo() {
		super();

	}

	@Override
	public String toString() {
		return "BuyerSignupPojo [buyerId=" + buyerId + ", buyerUsername=" + buyerUsername + ", buyerPassword="
				+ buyerPassword + ", buyerEmail=" + buyerEmail + ", buyerMobile=" + buyerMobile + ", buyerDate="
				+ buyerDate + ", allBuyers=" + allBills + "]";
	}

}
