package ns.javaschool.designpatterns.shipment.impl.land;

import ns.javaschool.designpatterns.packing.type.Package;
import ns.javaschool.designpatterns.shipment.land.LandShipping;

public class RegularLandShipping extends LandShipping {

    public RegularLandShipping(Package newPackage) {
        super(newPackage);
    }

    @Override
    public String getMode() {
        return "Regular land shipping";
    }

    @Override
    public String getDeliveryTime() {
        return "Four to six days";
    }
}