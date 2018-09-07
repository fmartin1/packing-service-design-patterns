package ns.javaschool.designpatterns.packing.type.impl;

import ns.javaschool.designpatterns.packing.size.PackageSizeEnum;
import ns.javaschool.designpatterns.packing.size.impl.box.BoxSizeFactory;
import ns.javaschool.designpatterns.packing.type.Package;

public class Box extends Package {

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

    @Override
    public double getPrice() {
        return 2.5 + packageSize.getPrice();
    }
}
