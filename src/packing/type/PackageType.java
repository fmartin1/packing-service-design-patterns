package packing.type;

import packing.size.PackageSize;
import util.SingleStringPrinter;

public abstract class PackageType {

    private PackageSize packageSize;

    protected PackageType(PackageSize packageSize) {
        this.packageSize = packageSize;
    }

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
