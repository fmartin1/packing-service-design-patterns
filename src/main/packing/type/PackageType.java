package main.packing.type;

import main.packing.size.PackageSize;
import main.util.SingleStringPrinter;

public abstract class PackageType {

    private PackageSize packageSize;

    public abstract String getName();

    public abstract String getDescription();

    protected void setPackageSize(PackageSize packageSize) {
        this.packageSize = packageSize;
    }

    public final void print() {
        printType();
        printSize();
    }

    private void printType() {
        printer.print("Type: " + getName() + " (" + getDescription() + ")");
    }

    private void printSize() {
        printer.print("Size: " + packageSize.getDescription() + " (" + packageSize.getDimensions() + ")");
    }

    private SingleStringPrinter printer = System.out::println;
}
