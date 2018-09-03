package packing.type.impl;

import packing.size.PackageSizeEnum;
import packing.size.impl.envelope.EnvelopeSizeFactory;
import packing.type.PackageType;

public class Envelope extends PackageType {

    public Envelope(PackageSizeEnum sizeEnum) {
        setPackageSize(new EnvelopeSizeFactory().create(sizeEnum));
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
