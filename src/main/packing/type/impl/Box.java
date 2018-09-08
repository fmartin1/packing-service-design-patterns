package main.packing.type.impl;

import main.packing.size.PackageSizeEnum;
import main.packing.size.impl.box.BoxSizeFactory;
import main.packing.type.PackageType;

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
