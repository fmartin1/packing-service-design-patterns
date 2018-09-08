package ns.javaschool.designpatterns.packing.type;

import ns.javaschool.designpatterns.decorator.Priceable;
import ns.javaschool.designpatterns.packing.size.PackageSize;
import ns.javaschool.designpatterns.util.SingleStringPrinter;

public abstract class Package implements Priceable {

    public PackageSize packageSize;

    public abstract String getName();

    public abstract String getDescription();

    public void setPackageSize(PackageSize packageSize) {
        this.packageSize = packageSize;
    }
}
