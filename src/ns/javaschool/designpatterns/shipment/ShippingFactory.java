package ns.javaschool.designpatterns.shipment;

import ns.javaschool.designpatterns.shipment.impl.air.AirShippingFactory;
import ns.javaschool.designpatterns.shipment.impl.land.LandShippingFactory;

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
