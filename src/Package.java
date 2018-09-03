import javafx.util.Pair;
import mailing.MailInfo;
import packing.content.PackageContent;
import packing.size.PackageSizeEnum;

import packing.type.PackageType;
import packing.type.PackageTypeEnum;
import packing.type.impl.PackageTypeFactory;
import shipment.Shipping;
import shipment.ShippingFactory;
import shipment.ShipmentModeEnum;
import shipment.DeliveryTimeEnum;
import util.SingleStringPrinter;

import java.util.LinkedHashMap;
import java.util.Map;

class Package {

    private MailInfo mailInfo;
    private PackageContent packageContent;

    private MapPrinter mapPrinter = new MapPrinterImpl();
    private SingleStringPrinter singleStringPrinter = System.out::println;

    Package(MailInfo mailInfo, PackageContent packageContent) {
        this.mailInfo = mailInfo;
        this.packageContent = packageContent;
    }

    void shipAndPrintTicket(PackageTypeEnum packageTypeEnum,
                                   PackageSizeEnum packageSizeEnum,
                                   ShipmentModeEnum shippingModeEnum,
                                   DeliveryTimeEnum deliveryTimeEnum) {

        mapPrinter.print(getMailingInformation());
        singleStringPrinter.print("\n");

        printPackageInformation(packageTypeEnum, packageSizeEnum);
        printShippingInformation(shippingModeEnum, deliveryTimeEnum);

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

    private void printPackageInformation(PackageTypeEnum packageTypeEnum, PackageSizeEnum packageSizeEnum) {
        singleStringPrinter.print("PACKAGE INFORMATION");
        singleStringPrinter.print("--------------");
        printPackageTypeDescription(packageSizeEnum, packageTypeEnum);
        printPackageContent();
    }

    private void printPackageTypeDescription(PackageSizeEnum packageSizeEnum, PackageTypeEnum packageTypeEnum) {
        PackageType packageType = PackageTypeFactory.create(packageTypeEnum, packageSizeEnum);
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

    private void printShippingInformation(ShipmentModeEnum shippingModeEnum, DeliveryTimeEnum deliveryTimeEnum) {
        singleStringPrinter.print("SHIPPING INFORMATION");
        singleStringPrinter.print("--------------");
        Shipping shipping = ShippingFactory.create(shippingModeEnum, deliveryTimeEnum);
        printShippingInformation(shipping);
    }

    private void printShippingInformation(Shipping shipping) {
        singleStringPrinter.print("- Mode: " + shipping.getMode());
        singleStringPrinter.print("- Delivery time: " + shipping.getDeliveryTime());
        shipping.printFolio();
        shipping.printStages();
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
