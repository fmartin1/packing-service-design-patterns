package packing.type.impl;

import packing.size.PackageSizeEnum;
import packing.type.PackageType;
import packing.type.PackageTypeEnum;

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
