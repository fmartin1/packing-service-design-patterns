package main;

import main.mailing.MailInfo;
import main.packing.content.PackageContent;
import main.packing.size.PackageSizeEnum;

import main.packing.type.PackageType;
import main.packing.type.PackageTypeEnum;
import main.packing.type.impl.PackageTypeFactory;
import main.shipment.Shipping;
import main.shipment.ShippingFactory;
import main.shipment.ShipmentModeEnum;
import main.shipment.DeliveryTimeEnum;
import main.util.SingleStringPrinter;

class Package {

    private MailInfo mailInfo;
    private PackageContent packageContent;
    private PackageType packageType;
    private Shipping shipping;

    private SingleStringPrinter singleStringPrinter = System.out::println;

    Package(MailInfo mailInfo, PackageContent packageContent) {
        this.mailInfo = mailInfo;
        this.packageContent = packageContent;
    }

    void setPackageType(PackageTypeEnum packageTypeEnum, PackageSizeEnum packageSizeEnum) {
        this.packageType = PackageTypeFactory.create(packageTypeEnum, packageSizeEnum);
    }

    void setShippingMode(ShipmentModeEnum shippingModeEnum, DeliveryTimeEnum deliveryTimeEnum) {
        this.shipping = ShippingFactory.create(shippingModeEnum, deliveryTimeEnum);
    }

    void shipAndPrintTicket() {
        printMailingInformation();
        printPackageInformation();
        printShippingInformation();

        singleStringPrinter.print("**********************************************");
        singleStringPrinter.print("\n");
    }

    private void printMailingInformation() {
        singleStringPrinter.print("MAIL INFORMATION");
        singleStringPrinter.print("--------------");
        singleStringPrinter.print("- Sender's name" + mailInfo.getSenderName());
        singleStringPrinter.print("- Sender's address" + mailInfo.getSenderAddress());
        singleStringPrinter.print("- Receiver's name" + mailInfo.getReceiverName());
        singleStringPrinter.print("- Receiver's address" + mailInfo.getReceiverAddress());
        singleStringPrinter.print("\n");
    }

    private void printPackageInformation() {
        singleStringPrinter.print("PACKAGE INFORMATION");
        singleStringPrinter.print("--------------");
        printPackageTypeDescription();
        printPackageContent();
        singleStringPrinter.print("\n");
    }

    private void printPackageTypeDescription() {
        packageType.print();
    }

    private void printPackageContent() {
        singleStringPrinter.print("- Content: " + packageContent.getDescription());

        if (packageContent.isFragile()) {
            singleStringPrinter.print(" - (F) Fragile");
        }

        if (packageContent.isLiquid()) {
            singleStringPrinter.print(" - (L) Liquid");
        }

        if (packageContent.isDangerous()) {
            singleStringPrinter.print(" - (D) Dangerous");
        }
    }

    private void printShippingInformation() {
        singleStringPrinter.print("SHIPPING INFORMATION");
        singleStringPrinter.print("--------------");
        shipping.print();
    }
}
