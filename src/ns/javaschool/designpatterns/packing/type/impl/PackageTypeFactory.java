package ns.javaschool.designpatterns.packing.type.impl;

import ns.javaschool.designpatterns.packing.size.PackageSizeEnum;
import ns.javaschool.designpatterns.packing.type.PackageType;
import ns.javaschool.designpatterns.packing.type.PackageTypeEnum;

public class PackageTypeFactory {

    public static PackageType create(PackageTypeEnum packageTypeEnum, PackageSizeEnum packageSizeEnum) {
        PackageType packageType = null;

        if (packageTypeEnum.equals(PackageTypeEnum.BOX)) {
            packageType = new Box(packageSizeEnum);
        } else if (packageTypeEnum.equals(PackageTypeEnum.ENVELOPE)){
            packageType = new Envelope(packageSizeEnum);
        }

        return packageType;
    }
}
