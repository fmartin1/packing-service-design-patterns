package ns.javaschool.designpatterns.shipment.impl.land;

import ns.javaschool.designpatterns.packing.type.Package;
import ns.javaschool.designpatterns.shipment.DeliveryTimeEnum;
import ns.javaschool.designpatterns.shipment.Shipping;
import ns.javaschool.designpatterns.shipment.ShippingModeFactory;

public class LandShippingFactory implements ShippingModeFactory {

    private static LandShippingFactory uniqueInstance = null;

    private LandShippingFactory() {
    }

    public static LandShippingFactory getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LandShippingFactory();
        }
        return uniqueInstance;
    }

    @Override
    public Shipping create(DeliveryTimeEnum deliveryTimeEnum, Package newPackage) {
        Shipping shipping = null;

        if (deliveryTimeEnum.equals(DeliveryTimeEnum.EXPRESS)) {
            shipping = new ExpressLandShipping(newPackage);
        } else if (deliveryTimeEnum.equals(DeliveryTimeEnum.REGULAR)) {
            shipping = new RegularLandShipping(newPackage);
        } else if (deliveryTimeEnum.equals(DeliveryTimeEnum.SLOW)) {
            shipping = new SlowLandShipping(newPackage);
        }

        return shipping;
    }
}
