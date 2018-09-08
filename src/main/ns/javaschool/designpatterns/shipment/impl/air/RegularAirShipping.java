package ns.javaschool.designpatterns.shipment.impl.air;

import ns.javaschool.designpatterns.packing.type.Package;
import ns.javaschool.designpatterns.shipment.air.AirShipping;

public class RegularAirShipping extends AirShipping {

    public RegularAirShipping(Package packageToDeliver) {
        super(packageToDeliver);
    }

    @Override
    public String getMode() {
        return "Regular air shipping";
    }

    @Override
    public String getDeliveryTime() {
        return "Two to three days";
    }
}