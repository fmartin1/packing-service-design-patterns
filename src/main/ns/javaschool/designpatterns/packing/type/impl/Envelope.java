package ns.javaschool.designpatterns.packing.type.impl;

import ns.javaschool.designpatterns.packing.size.PackageSizeEnum;
import ns.javaschool.designpatterns.packing.size.impl.envelope.EnvelopeSizeFactory;
import ns.javaschool.designpatterns.packing.type.Package;

public class Envelope extends Package {

    Envelope(PackageSizeEnum sizeEnum) {
        setPackageSize(EnvelopeSizeFactory.getInstance().create(sizeEnum));
    }

    @Override
    public String getName() {
        return "Envelope";
    }

    @Override
    public String getDescription() {
        return "For posting documents, photos and stuff like that";
    }

    @Override
    public double getPrice() {
        return 0.5 + this.packageSize.getPrice();
    }
}
