package shipment;

import shipment.impl.air.AirShippingFactory;
import shipment.impl.land.LandShippingFactory;

public class ShippingFactory {

    public static Shipping create(ShipmentModeEnum shipmentModeEnum, DeliveryTimeEnum deliveryTimeEnum) {
        ShippingModeFactory shippingModeFactory = null;

        if (shipmentModeEnum.equals(ShipmentModeEnum.LAND)) {
            shippingModeFactory = new LandShippingFactory();
        } else if (shipmentModeEnum.equals(ShipmentModeEnum.AIR)) {
            shippingModeFactory = new AirShippingFactory();
        }

        return shippingModeFactory.create(deliveryTimeEnum);
    }
}
