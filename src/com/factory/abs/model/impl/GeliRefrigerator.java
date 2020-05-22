package com.factory.abs.model.impl;

import com.factory.abs.model.Refrigerator;

public class GeliRefrigerator implements Refrigerator{

	@Override
	public void saleRefrigerator() {
		System.out.println("出售格力冰箱");
	}

}
