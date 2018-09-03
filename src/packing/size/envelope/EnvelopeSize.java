package packing.size.envelope;

import packing.size.PackageSize;

public abstract class EnvelopeSize implements PackageSize {

    @Override
    public final String getDimensions() {
        return "Width: " + getWidth() +
                ", Length: " + getLength();
    }

    public abstract String getLength();

    public abstract String getWidth();
}
