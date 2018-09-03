package packing.size.impl.box;

import packing.size.box.BoxSize;

public class SmallBox extends BoxSize {

    @Override
    public String getDescription() {
        return "Small";
    }

    @Override
    public String getLength() {
        return "40cm";
    }

    @Override
    public String getWidth() {
        return "30cm";
    }

    @Override
    public String getHeight() {
        return "30cm";
    }
}