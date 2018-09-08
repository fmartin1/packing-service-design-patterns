package main.shipment.land;

import main.shipment.Shipping;

public abstract class LandShipping extends Shipping {

    @Override
    public String getFolioPrefix() {
        return "L-";
    }

    @Override
    public void printOtherStages() {
        singleStringPrinter.print("- Putting package in a delivery truck");
        singleStringPrinter.print("- Driving to destination");
        singleStringPrinter.print("- Arriving to the destination office");
    }
}
