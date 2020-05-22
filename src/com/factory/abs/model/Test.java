package com.factory.abs.model;

import com.factory.abs.model.factory.GeliShopFactory;
import com.factory.abs.model.factory.SaleShopFactory;

public class Test {

	public static void main(String[] args) {
		// ���Ը����콢�������յ��ͱ���
		SaleShopFactory shop = new GeliShopFactory();
		AirCondition air = shop.produceAirCondition();
		air.saleAirCondition();
		Refrigerator refri = shop.produceRerigerator();
		refri.saleRefrigerator();
	}

}
