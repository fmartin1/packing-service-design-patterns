package main;import javafx.util.Pair;
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

import java.util.LinkedHashMap;
import java.util.Map;

class Package {

    private MailInfo mailInfo;
    private PackageContent packageContent;
    private PackageType packageType;
    private Shipping shipping;

    private MapPrinter mapPrinter = new MapPrinterImpl();
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
        mapPrinter.print(getMailingInformation());
        singleStringPrinter.print("\n");

        printPackageInformation();
        printShippingInformation();

        singleStringPrinter.print("**********************************************");
        singleStringPrinter.print("\n");
    }

    private Pair<String, Map<String, String>> getMailingInformation() {
        Map<String, String> mailInfoMap = new LinkedHashMap<>();
        Pair<String, Map<String, String>> section = new Pair<>("MAIL INFORMATION", mailInfoMap);
        mailInfoMap.put("Sender's name", mailInfo.getSenderName());
        mailInfoMap.put("Sender's address", mailInfo.getSenderAddress());
        mailInfoMap.put("Receiver's name", mailInfo.getReceiverName());
        mailInfoMap.put("Receiver's address", mailInfo.getReceiverAddress());
        return section;
    }

    private void printPackageInformation() {
        singleStringPrinter.print("PACKAGE INFORMATION");
        singleStringPrinter.print("--------------");
        printPackageTypeDescription();
        printPackageContent();
    }

    private void printPackageTypeDescription() {
        packageType.print();
    }

    private void printPackageContent() {
        singleStringPrinter.print("Content: " + packageContent.getDescription());

        if (packageContent.isFragile()) {
            singleStringPrinter.print("(F) Fragile");
        }

        if (packageContent.isLiquid()) {
            singleStringPrinter.print("(L) Liquid");
        }

        if (packageContent.isDangerous()) {
            singleStringPrinter.print("(D) Dangerous");
        }

        singleStringPrinter.print("\n");
    }

    private void printShippingInformation() {
        singleStringPrinter.print("SHIPPING INFORMATION");
        singleStringPrinter.print("--------------");
        shipping.print();
    }

    interface MapPrinter {
        void print(Pair<String, Map<String, String>> information);
    }

    class MapPrinterImpl implements MapPrinter {
        public void print(Pair<String, Map<String, String>> information) {
            singleStringPrinter.print(information.getKey());
            singleStringPrinter.print("--------------");
            for (Map.Entry<String, String> e : information.getValue().entrySet()) {
                String key = e.getKey();
                String value = e.getValue();
                singleStringPrinter.print("- " + key + ": " + value);
            }
        }
    }
}
