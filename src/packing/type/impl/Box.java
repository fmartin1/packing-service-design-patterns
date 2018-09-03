package packing.type.impl;

import packing.size.PackageSizeEnum;
import packing.size.impl.box.BoxSizeFactory;
import packing.type.PackageType;

public class Box extends PackageType {

    Box(PackageSizeEnum sizeEnum) {
        setPackageSize(BoxSizeFactory.getInstance().create(sizeEnum));
    }

    @Override
    public String getName() {
        return "Box";
    }

    @Override
    public String getDescription() {
        return "Multi-purpose box-type package";
    }
}
