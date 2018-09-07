package ns.javaschool.designpatterns.shipment.impl.air;

import ns.javaschool.designpatterns.packing.type.Package;
import ns.javaschool.designpatterns.shipment.DeliveryTimeEnum;
import ns.javaschool.designpatterns.shipment.Shipping;
import ns.javaschool.designpatterns.shipment.ShippingModeFactory;

public class AirShippingFactory implements ShippingModeFactory {

    private static AirShippingFactory uniqueInstance = null;

    private AirShippingFactory() {
    }

    public static AirShippingFactory getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new AirShippingFactory();
        }
        return uniqueInstance;
    }

    @Override
    public Shipping create(DeliveryTimeEnum deliveryTimeEnum, Package newPackage) {
        Shipping shipping = null;

        if (deliveryTimeEnum.equals(DeliveryTimeEnum.EXPRESS)) {
            shipping = new ExpressAirShipping(newPackage);
        } else if (deliveryTimeEnum.equals(DeliveryTimeEnum.REGULAR)) {
            shipping = new RegularAirShipping(newPackage);
        } else if (deliveryTimeEnum.equals(DeliveryTimeEnum.SLOW)) {
            shipping = new SlowAirShipping(newPackage);
        }

        return shipping;
    }
}
