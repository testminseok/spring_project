package com.springbook.ioc.injection;

import java.util.Set;

public class CollectionBean {
	
	private Set<String> addressList;
	
	public Set<String> getAddressList() {
		return addressList;
	}
	
	public void setAddressList(Set<String> addressList) {
		this.addressList = addressList;
	}
//	private List<String> addressList;

//	public List<String> getAddressList() {
//		return addressList;
//	}
//
//	public void setAddressList(List<String> addressList) {
//		this.addressList = addressList;
//	}

	
}
