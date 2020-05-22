package com.factory.abs.model.factory;

import com.factory.abs.model.AirCondition;
import com.factory.abs.model.Refrigerator;
import com.factory.abs.model.impl.GeliAirCondition;
import com.factory.abs.model.impl.GeliRefrigerator;

/**
 * 格力旗舰店生产格力空调和格力冰箱来售卖
 * @author Administrator
 *
 */
public class GeliShopFactory implements SaleShopFactory{

	@Override
	public AirCondition produceAirCondition() {
		return new GeliAirCondition();
	}

	@Override
	public Refrigerator produceRerigerator() {
		return new GeliRefrigerator();
	}

}
