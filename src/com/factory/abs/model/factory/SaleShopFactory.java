package com.factory.abs.model.factory;

import com.factory.abs.model.AirCondition;
import com.factory.abs.model.Refrigerator;

/**
 * 抽象工厂 抽象处旗舰店 负责售卖冰箱和空调
 * @author Administrator
 *
 */
public interface SaleShopFactory {
	public AirCondition produceAirCondition();
	public Refrigerator produceRerigerator();
}
