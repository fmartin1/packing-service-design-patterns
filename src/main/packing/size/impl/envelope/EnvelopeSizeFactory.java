package main.packing.size.impl.envelope;

import main.packing.size.PackageSize;
import main.packing.size.PackageSizeEnum;
import main.packing.size.PackageSizeFactory;
import main.packing.size.envelope.EnvelopeSize;

public class EnvelopeSizeFactory implements PackageSizeFactory {

    private static EnvelopeSizeFactory uniqueInstance = null;

    private EnvelopeSizeFactory() {
    }

    public static EnvelopeSizeFactory getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new EnvelopeSizeFactory();
        }
        return uniqueInstance;
    }

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
