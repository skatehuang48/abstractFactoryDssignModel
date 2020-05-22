package com.factory.abs.model.factory;

import com.factory.abs.model.AirCondition;
import com.factory.abs.model.Refrigerator;

/**
 * ���󹤳� �����콢�� ������������Ϳյ�
 * @author Administrator
 *
 */
public interface SaleShopFactory {
	public AirCondition produceAirCondition();
	public Refrigerator produceRerigerator();
}
