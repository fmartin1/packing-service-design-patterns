package ns.javaschool.designpatterns;

import javafx.util.Pair;
import ns.javaschool.designpatterns.packing.content.PackageContent;
import ns.javaschool.designpatterns.packing.size.PackageSizeEnum;

import ns.javaschool.designpatterns.packing.type.Package;
import ns.javaschool.designpatterns.packing.type.PackageTypeEnum;
import ns.javaschool.designpatterns.packing.type.impl.PackageFactory;
import ns.javaschool.designpatterns.shipment.Shipping;
import ns.javaschool.designpatterns.shipment.ShippingFactory;
import ns.javaschool.designpatterns.shipment.ShipmentModeEnum;
import ns.javaschool.designpatterns.shipment.DeliveryTimeEnum;
import ns.javaschool.designpatterns.util.SingleStringPrinter;

import java.util.LinkedHashMap;
import java.util.Map;

class PackageService {

    private MailInfo mailInfo;
    private PackageContent packageContent;

    private MapPrinter mapPrinter = new MapPrinterImpl();
    private SingleStringPrinter singleStringPrinter = System.out::println;

    PackageService(MailInfo mailInfo, PackageContent packageContent) {
        this.mailInfo = mailInfo;
        this.packageContent = packageContent;
    }

    Package shipAndPrintTicket(PackageTypeEnum packageTypeEnum,
                                   PackageSizeEnum packageSizeEnum,
                                   ShipmentModeEnum shippingModeEnum,
                                   DeliveryTimeEnum deliveryTimeEnum) {

        mapPrinter.print(getMailingInformation());
        singleStringPrinter.print("\n");

        Package newPackage = PackageFactory.create(packageTypeEnum, packageSizeEnum);
        printPackageInformation(newPackage);

        //TODO: Implement decorator to get the shipping price
        Shipping shipping = ShippingFactory.create(shippingModeEnum, deliveryTimeEnum, newPackage);
        printShippingInformation(shipping);

        singleStringPrinter.print("**********************************************");
        singleStringPrinter.print("\n");

        //TODO: Print total price
        singleStringPrinter.print("TOTAL PACKAGE PRICE + SHIPPING: ");
        singleStringPrinter.print("????");

        return newPackage;
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

    private void printPackageInformation(Package newPackage) {
        singleStringPrinter.print("PACKAGE INFORMATION");
        singleStringPrinter.print("--------------");
        singleStringPrinter.print("Type: " + newPackage.getName() + " (" + newPackage.getDescription() + ")");
        singleStringPrinter.print("Size: " + newPackage.packageSize.getDescription() + " (" + newPackage.packageSize.getDimensions() + ")");
        singleStringPrinter.print(String.format("Cost: %d dollars", newPackage.getPrice()));
        printPackageContent();
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

    private void printShippingInformation(Shipping shipping) {
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
