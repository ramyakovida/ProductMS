package com.infy.ordermanagement.ProductMS.utility;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("serial")
public class CustomPK implements Serializable{
	protected Integer buyerId;
	protected Integer prodId;
	public CustomPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomPK(Integer buyerId, Integer prodId) {
		super();
		this.buyerId = buyerId;
		this.prodId = prodId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(buyerId, prodId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomPK other = (CustomPK) obj;
		return Objects.equals(buyerId, other.buyerId) && Objects.equals(prodId, other.prodId);
	}
	

}
