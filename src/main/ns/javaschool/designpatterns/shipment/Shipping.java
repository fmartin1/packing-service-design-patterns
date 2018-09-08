package ns.javaschool.designpatterns.shipment;

import ns.javaschool.designpatterns.decorator.Priceable;
import ns.javaschool.designpatterns.packing.type.Package;
import ns.javaschool.designpatterns.util.SingleStringPrinter;

import java.util.Random;

public abstract class Shipping implements Priceable {

    public Shipping(Package packageToDeliver) {
        this.packageToDeliver = packageToDeliver;
    }

    public Package packageToDeliver;

    protected abstract String getMode();

    protected abstract String getDeliveryTime();

    protected abstract String getFolioPrefix();

    protected abstract void printOtherStages();

    public void print() {
        printDescription();
        printTotalPrice();
        printFolio();
        printStages();
    }


    void printDescription() {
        singleStringPrinter.print("- Mode: " + getMode());
        singleStringPrinter.print("- Delivery time: " + getDeliveryTime());
    }

    private void printTotalPrice() {
        singleStringPrinter.print("- Total shipping price: $" + getPrice() + " dollars");
    }

    void printFolio() {
        singleStringPrinter.print("- Folio number: " + getFolioPrefix() + new Random().nextInt(1000000));
        singleStringPrinter.print("\n");
    }


    void printStages() {
        printInitialStages();
        printOtherStages();
        printFinalStages();
    }

    void printInitialStages() {
        singleStringPrinter.print("- Receiving package at the origin office");
        singleStringPrinter.print("- Labeling package for shipping");
    }

    void printFinalStages() {
        singleStringPrinter.print("- Receiving package at destination office");
    }

    protected SingleStringPrinter singleStringPrinter = System.out::println;
}
