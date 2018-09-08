package ns.javaschool.designpatterns.shipment.air;

import ns.javaschool.designpatterns.packing.type.Package;
import ns.javaschool.designpatterns.shipment.Shipping;

public abstract class AirShipping extends Shipping {

    public AirShipping(Package newPackage) {
        super(newPackage);
    }

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
