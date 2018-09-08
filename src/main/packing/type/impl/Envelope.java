package main.packing.type.impl;

import main.packing.size.PackageSizeEnum;
import main.packing.size.impl.envelope.EnvelopeSizeFactory;
import main.packing.type.PackageType;

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
