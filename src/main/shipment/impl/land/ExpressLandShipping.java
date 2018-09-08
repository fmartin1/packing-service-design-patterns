package main.shipment.impl.land;

import main.shipment.land.LandShipping;

public class ExpressLandShipping extends LandShipping {

    @Override
    public String getMode() {
        return "Express land shipping";
    }

    @Override
    public String getDeliveryTime() {
        return "Two to three days";
    }
}
