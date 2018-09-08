package main.shipment.impl.air;

import main.shipment.air.AirShipping;

public class ExpressAirShipping extends AirShipping {

    @Override
    public String getMode() {
        return "Express air shipping";
    }

    @Override
    public String getDeliveryTime() {
        return "Next day";
    }
}