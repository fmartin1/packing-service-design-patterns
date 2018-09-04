package ns.javaschool.designpatterns.shipment.impl.land;

import ns.javaschool.designpatterns.shipment.land.LandShipping;

public class SlowLandShipping implements LandShipping {

    @Override
    public String getMode() {
        return "Slow land shipping";
    }

    @Override
    public String getDeliveryTime() {
        return "Two weeks";
    }
}
