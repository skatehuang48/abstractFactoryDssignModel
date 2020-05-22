package com.factory.abs.model.impl;

import com.factory.abs.model.AirCondition;

/**
 * 格力空调
 * @author Administrator
 *
 */
public class GeliAirCondition implements AirCondition{

	@Override
	public void saleAirCondition() {
		System.out.println("出售格力空调");
	}

}
