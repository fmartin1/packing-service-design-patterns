package main.shipment.impl.land;

import main.shipment.land.LandShipping;

public class SlowLandShipping extends LandShipping {

    @Override
    public String getMode() {
        return "Slow land shipping";
    }

    @Override
    public String getDeliveryTime() {
        return "Two weeks";
    }
}
