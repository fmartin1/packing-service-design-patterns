package ns.javaschool.designpatterns.packing.type.impl;

import ns.javaschool.designpatterns.packing.size.PackageSizeEnum;
import ns.javaschool.designpatterns.packing.size.impl.envelope.EnvelopeSizeFactory;
import ns.javaschool.designpatterns.packing.type.PackageType;

public class Envelope extends PackageType {

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
}
