package main.shipment;

import main.shipment.impl.air.AirShippingFactory;
import main.shipment.impl.land.LandShippingFactory;

public class ShippingFactory {

    public static Shipping create(ShipmentModeEnum shipmentModeEnum, DeliveryTimeEnum deliveryTimeEnum) {
        ShippingModeFactory shippingModeFactory = null;

        if (shipmentModeEnum.equals(ShipmentModeEnum.LAND)) {
            shippingModeFactory = LandShippingFactory.getInstance();
        } else if (shipmentModeEnum.equals(ShipmentModeEnum.AIR)) {
            shippingModeFactory = AirShippingFactory.getInstance();
        }

        return shippingModeFactory.create(deliveryTimeEnum);
    }
}