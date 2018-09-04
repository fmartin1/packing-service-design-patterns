package ns.javaschool.designpatterns.packing.size.impl.box;

import ns.javaschool.designpatterns.packing.size.PackageSize;
import ns.javaschool.designpatterns.packing.size.PackageSizeEnum;
import ns.javaschool.designpatterns.packing.size.PackageSizeFactory;
import ns.javaschool.designpatterns.packing.size.box.BoxSize;

public class BoxSizeFactory implements PackageSizeFactory {

    private static BoxSizeFactory uniqueInstance = null;

    private BoxSizeFactory() {
    }

    public static BoxSizeFactory getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new BoxSizeFactory();
        }
        return uniqueInstance;
    }

    @Override
    public PackageSize create(PackageSizeEnum sizeEnum) {
        BoxSize boxSize = null;

        if (sizeEnum.equals(PackageSizeEnum.SMALL)) {
            boxSize = new SmallBox();
        } else if (sizeEnum.equals(PackageSizeEnum.MEDIUM)) {
            boxSize = new MediumBox();
        } else if (sizeEnum.equals(PackageSizeEnum.LARGE)) {
            boxSize = new LargeBox();
        }

        return boxSize;
    }
}
