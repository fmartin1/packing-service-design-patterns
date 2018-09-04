package ns.javaschool.designpatterns.packing.size.envelope;

import ns.javaschool.designpatterns.packing.size.PackageSize;

public abstract class EnvelopeSize implements PackageSize {

    @Override
    public final String getDimensions() {
        return "Width: " + getWidth() +
                ", Length: " + getLength();
    }

    public abstract String getLength();

    public abstract String getWidth();
}
