package main.packing.type.impl;

import main.packing.size.PackageSizeEnum;
import main.packing.type.PackageType;
import main.packing.type.PackageTypeEnum;

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
