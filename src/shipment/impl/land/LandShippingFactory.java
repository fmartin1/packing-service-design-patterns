package shipment.impl.land;

import shipment.DeliveryTimeEnum;
import shipment.Shipping;
import shipment.ShippingModeFactory;

public class LandShippingFactory implements ShippingModeFactory {

    @Override
    public Shipping create(DeliveryTimeEnum deliveryTimeEnum) {
        Shipping shipping = null;

        if (deliveryTimeEnum.equals(DeliveryTimeEnum.EXPRESS)) {
            shipping = new ExpressLandShipping();
        } else if (deliveryTimeEnum.equals(DeliveryTimeEnum.REGULAR)) {
            shipping = new RegularLandShipping();
        } else if (deliveryTimeEnum.equals(DeliveryTimeEnum.SLOW)) {
            shipping = new SlowLandShipping();
        }

        return shipping;
    }
}
