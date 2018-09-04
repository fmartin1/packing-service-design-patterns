package ns.javaschool.designpatterns.packing.type;

import ns.javaschool.designpatterns.packing.size.PackageSize;
import ns.javaschool.designpatterns.util.SingleStringPrinter;

public abstract class PackageType {

    private PackageSize packageSize;

    public abstract String getName();

    public abstract String getDescription();

    public void setPackageSize(PackageSize packageSize) {
        this.packageSize = packageSize;
    }

    public void print() {
        printer.print("Type: " + getName() + " (" + getDescription() + ")");
        printer.print("Size: " + packageSize.getDescription() + " (" + packageSize.getDimensions() + ")");
    }

    private SingleStringPrinter printer = System.out::println;
}
