package packing.size.impl.box;

import packing.size.PackageSize;
import packing.size.PackageSizeEnum;
import packing.size.PackageSizeFactory;
import packing.size.box.BoxSize;

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
