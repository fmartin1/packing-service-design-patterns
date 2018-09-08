package ns.javaschool.designpatterns.shipment.impl.land;

import ns.javaschool.designpatterns.packing.type.Package;
import ns.javaschool.designpatterns.shipment.land.LandShipping;

public class ExpressLandShipping extends LandShipping {

    public ExpressLandShipping(Package packageToDeliver) {
        super(packageToDeliver);
    }

    @Override
    public String getMode() {
        return "Express land shipping";
    }

    @Override
    public String getDeliveryTime() {
        return "Two to three days";
    }

    @Override
    public double getPrice() {
        return 8;
    }
}
