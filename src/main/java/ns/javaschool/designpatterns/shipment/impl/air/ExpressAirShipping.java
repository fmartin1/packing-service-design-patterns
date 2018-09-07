package ns.javaschool.designpatterns.shipment.impl.air;

import ns.javaschool.designpatterns.packing.type.Package;
import ns.javaschool.designpatterns.shipment.air.AirShipping;

public class ExpressAirShipping extends AirShipping {

    public ExpressAirShipping(Package newPackage) {
        super(newPackage);
    }

    @Override
    public String getMode() {
        return "Express air shipping";
    }

    @Override
    public String getDeliveryTime() {
        return "Next day";
    }
}