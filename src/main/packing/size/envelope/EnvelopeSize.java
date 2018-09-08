package main.packing.size.envelope;

import main.packing.size.PackageSize;

public abstract class EnvelopeSize implements PackageSize {

    @Override
    public final String getDimensions() {
        return "Width: " + getWidth() +
                ", Length: " + getLength();
    }

    public abstract String getLength();

    public abstract String getWidth();
}
