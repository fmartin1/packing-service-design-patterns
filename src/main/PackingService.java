package main;

import main.mailing.MailInfo;
import main.packing.content.PackageContent;
import main.packing.size.PackageSizeEnum;
import main.packing.type.PackageTypeEnum;
import main.shipment.ShipmentModeEnum;
import main.shipment.DeliveryTimeEnum;

public class PackingService {

    public static void main(String[] args) {
        sendPackageOne();
        sendPackageTwo();
        sendPackageThree();
        sendPackageFour();
    }

    private static void sendPackageOne() {
        MailInfo mailInfo = new MailInfo();
        mailInfo.setSenderName("Victor Anchondo").setSenderAddress("Cuauhtemoc, Chih")
                .setReceiverName("Fer Calderon").setReceiverAddress("Meoqui, Chih");

        PackageContent packageContent = new PackageContent("Glass trophy to the java dev of the year", true, false, false);
        Package pack = new Package(mailInfo, packageContent);
        pack.setPackageType(PackageTypeEnum.BOX, PackageSizeEnum.SMALL);
        pack.setShippingMode(ShipmentModeEnum.LAND, DeliveryTimeEnum.REGULAR);
        pack.shipAndPrintTicket();
    }

    private static void sendPackageTwo() {
        MailInfo mailInfo = new MailInfo();
        mailInfo.setSenderName("Carlos Marin").setSenderAddress("Cd. Juarez, Chih")
                .setReceiverName("Crys Castillo").setReceiverAddress("Chihuahua, Chih");

        PackageContent packageContent = new PackageContent("12-bottle box of rum", true, true, false);
        Package pack = new Package(mailInfo, packageContent);
        pack.setPackageType(PackageTypeEnum.BOX, PackageSizeEnum.MEDIUM);
        pack.setShippingMode(ShipmentModeEnum.AIR, DeliveryTimeEnum.REGULAR);
        pack.shipAndPrintTicket();
    }

    private static void sendPackageThree() {
        MailInfo mailInfo = new MailInfo();
        mailInfo.setSenderName("Juan Melo").setSenderAddress("Cuauhtemoc, Chih")
                .setReceiverName("Fer Martinez").setReceiverAddress("Chihuahua, Chih");

        PackageContent packageContent = new PackageContent("Javaschool member card", false, false, false);
        Package pack = new Package(mailInfo, packageContent);
        pack.setPackageType(PackageTypeEnum.ENVELOPE, PackageSizeEnum.SMALL);
        pack.setShippingMode(ShipmentModeEnum.LAND, DeliveryTimeEnum.EXPRESS);
        pack.shipAndPrintTicket();
    }

    private static void sendPackageFour() {
        MailInfo mailInfo = new MailInfo();
        mailInfo.setSenderName("Pau Quezada").setSenderAddress("Casas grandes, Chih")
                .setReceiverName("Rafa Manrique").setReceiverAddress("Colima, Col");

        PackageContent packageContent = new PackageContent("Anthrax", false, false, true);
        Package pack = new Package(mailInfo, packageContent);
        pack.setPackageType(PackageTypeEnum.ENVELOPE, PackageSizeEnum.MEDIUM);
        pack.setShippingMode(ShipmentModeEnum.AIR, DeliveryTimeEnum.EXPRESS);
        pack.shipAndPrintTicket();
    }
}
