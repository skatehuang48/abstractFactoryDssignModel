package com.factory.abs.model.impl;

import com.factory.abs.model.AirCondition;

public class HaierAirCondition implements AirCondition{

	@Override
	public void saleAirCondition() {
		System.out.println("出售海尔空调");
	}

}
