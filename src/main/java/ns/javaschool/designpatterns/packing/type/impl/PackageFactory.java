package ns.javaschool.designpatterns.packing.type.impl;

import ns.javaschool.designpatterns.packing.size.PackageSizeEnum;
import ns.javaschool.designpatterns.packing.type.Package;
import ns.javaschool.designpatterns.packing.type.PackageTypeEnum;

public class PackageFactory {

    public static Package create(PackageTypeEnum packageTypeEnum, PackageSizeEnum packageSizeEnum) {
        Package packageType = null;

        if (packageTypeEnum.equals(PackageTypeEnum.BOX)) {
            packageType = new Box(packageSizeEnum);
        } else if (packageTypeEnum.equals(PackageTypeEnum.ENVELOPE)){
            packageType = new Envelope(packageSizeEnum);
        }

        return packageType;
    }
}
