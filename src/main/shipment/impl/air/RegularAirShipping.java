package main.shipment.impl.air;

import main.shipment.air.AirShipping;

public class RegularAirShipping extends AirShipping {

    @Override
    public String getMode() {
        return "Regular air shipping";
    }

    @Override
    public String getDeliveryTime() {
        return "Two to three days";
    }
}