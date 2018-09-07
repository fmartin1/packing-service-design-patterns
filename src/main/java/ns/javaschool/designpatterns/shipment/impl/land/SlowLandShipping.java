package ns.javaschool.designpatterns.shipment.impl.land;

import ns.javaschool.designpatterns.packing.type.Package;
import ns.javaschool.designpatterns.shipment.land.LandShipping;

public class SlowLandShipping extends LandShipping {

    public SlowLandShipping(Package newPackage) {
        super(newPackage);
    }

    @Override
    public String getMode() {
        return "Slow land shipping";
    }

    @Override
    public String getDeliveryTime() {
        return "Two weeks";
    }
}
