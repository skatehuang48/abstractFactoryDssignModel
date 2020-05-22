package com.factory.abs.model.factory;

import com.factory.abs.model.AirCondition;
import com.factory.abs.model.Refrigerator;
import com.factory.abs.model.impl.GeliAirCondition;
import com.factory.abs.model.impl.GeliRefrigerator;

/**
 * �����콢�����������յ��͸�������������
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
