package ns.javaschool.designpatterns.shipment.impl.air;

import ns.javaschool.designpatterns.shipment.air.AirShipping;

public class ExpressAirShipping implements AirShipping {

    @Override
    public String getMode() {
        return "Express air shipping";
    }

    @Override
    public String getDeliveryTime() {
        return "Next day";
    }
}