package packing.size.box;

import packing.size.PackageSize;

public abstract class BoxSize implements PackageSize {

    @Override
    public String getDimensions() {
        return "Length: " + getLength() +
                ", Width: " + getWidth() +
                ", Height: " + getHeight();
    }

    public abstract String getLength();

    public abstract String getWidth();

    public abstract String getHeight();
}
