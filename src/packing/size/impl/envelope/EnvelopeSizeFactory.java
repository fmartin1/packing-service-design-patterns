package packing.size.impl.envelope;

import packing.size.PackageSize;
import packing.size.PackageSizeEnum;
import packing.size.PackageSizeFactory;
import packing.size.envelope.EnvelopeSize;

public class EnvelopeSizeFactory implements PackageSizeFactory {

    @Override
    public PackageSize create(PackageSizeEnum sizeEnum) {
        EnvelopeSize envelopeSize = null;

        if (sizeEnum.equals(PackageSizeEnum.SMALL)) {
            envelopeSize = new SmallEnvelope();
        } else if (sizeEnum.equals(PackageSizeEnum.MEDIUM)) {
            envelopeSize = new MediumEnvelope();
        } else if (sizeEnum.equals(PackageSizeEnum.LARGE)) {
            envelopeSize = new LargeEnvelope();
        }

        return envelopeSize;
    }
}
