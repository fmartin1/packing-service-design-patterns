package packing.type.impl;

import packing.size.box.BoxSize;
import packing.type.PackageType;

public class Box extends PackageType {

    public Box(BoxSize boxSize) {
        super(boxSize);
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
