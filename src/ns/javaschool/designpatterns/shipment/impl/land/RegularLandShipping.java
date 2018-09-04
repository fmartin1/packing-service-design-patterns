package ns.javaschool.designpatterns.shipment.impl.land;

import ns.javaschool.designpatterns.shipment.land.LandShipping;

public class RegularLandShipping implements LandShipping {

    @Override
    public String getMode() {
        return "Regular land shipping";
    }

    @Override
    public String getDeliveryTime() {
        return "Four to six days";
    }
}
