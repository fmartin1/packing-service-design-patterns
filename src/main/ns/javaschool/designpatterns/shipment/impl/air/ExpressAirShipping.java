package ns.javaschool.designpatterns.shipment.impl.air;

import ns.javaschool.designpatterns.packing.type.Package;
import ns.javaschool.designpatterns.shipment.air.AirShipping;

public class ExpressAirShipping extends AirShipping {

    public ExpressAirShipping(Package packageToDeliver) {
        super(packageToDeliver);
    }

    @Override
    public String getMode() {
        return "Express air shipping";
    }

    @Override
    public String getDeliveryTime() {
        return "Next day";
    }

    @Override
    public double getPrice() {
        return packageToDeliver.getPrice() + 20;
    }
}