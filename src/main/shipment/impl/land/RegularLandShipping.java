package main.shipment.impl.land;

import main.shipment.land.LandShipping;

public class RegularLandShipping extends LandShipping {

    @Override
    public String getMode() {
        return "Regular land shipping";
    }

    @Override
    public String getDeliveryTime() {
        return "Four to six days";
    }
}
