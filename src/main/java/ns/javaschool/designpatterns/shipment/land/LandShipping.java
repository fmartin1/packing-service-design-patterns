package ns.javaschool.designpatterns.shipment.land;

import ns.javaschool.designpatterns.packing.type.Package;
import ns.javaschool.designpatterns.shipment.Shipping;

public abstract class LandShipping extends Shipping {

    public LandShipping(Package newPackage) {
        super(newPackage);
    }

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
