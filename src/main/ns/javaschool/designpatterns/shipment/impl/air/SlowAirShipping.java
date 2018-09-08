package ns.javaschool.designpatterns.shipment.impl.air;

import ns.javaschool.designpatterns.packing.type.Package;
import ns.javaschool.designpatterns.shipment.air.AirShipping;

public class SlowAirShipping extends AirShipping {

    public SlowAirShipping(Package packageToDeliver) {
        super(packageToDeliver);
    }

    @Override
    public String getMode() {
        return "Slow air shipping";
    }

    @Override
    public String getDeliveryTime() {
        return "One week";
    }

    @Override
    public double getPrice() {
        return 5;
    }
}