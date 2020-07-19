/**
 * 
 */
package com.cts.dtos;

/**
 * @author HP
 *
 */
public class PaymentDto {
	
	private long paymentId;
	
	private double amount;

	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	

}
