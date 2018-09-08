package main.shipment.air;

import main.shipment.Shipping;

public abstract class AirShipping extends Shipping {

    @Override
    public String getFolioPrefix() {
        return "A-";
    }

    @Override
    public void printOtherStages() {
        singleStringPrinter.print("- Putting package in a plane");
        singleStringPrinter.print("- Flying to destination");
        singleStringPrinter.print("- Delivering to the destination office");
    }
}
