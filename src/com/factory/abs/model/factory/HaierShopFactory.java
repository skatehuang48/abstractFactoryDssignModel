package com.factory.abs.model.factory;

import com.factory.abs.model.AirCondition;
import com.factory.abs.model.Refrigerator;
import com.factory.abs.model.impl.HaierAirCondition;
import com.factory.abs.model.impl.HaierRefrigerator;

/**
 * 海尔旗舰店负责生产售卖海尔空调和海尔冰箱
 * @author Administrator
 *
 */
public class HaierShopFactory implements SaleShopFactory{

	@Override
	public AirCondition produceAirCondition() {
		return new HaierAirCondition();
	}

	@Override
	public Refrigerator produceRerigerator() {
		return new HaierRefrigerator();
	}

}
