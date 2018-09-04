package ns.javaschool.designpatterns.shipment.impl.land;

import ns.javaschool.designpatterns.shipment.land.LandShipping;

public class ExpressLandShipping implements LandShipping {

    @Override
    public String getMode() {
        return "Express land shipping";
    }

    @Override
    public String getDeliveryTime() {
        return "Two to three days";
    }
}
