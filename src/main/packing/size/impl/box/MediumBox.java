package main.packing.size.impl.box;

import main.packing.size.box.BoxSize;

public class MediumBox extends BoxSize {

    @Override
    public String getDescription() {
        return "Medium";
    }

    @Override
    public String getLength() {
        return "100cm";
    }

    @Override
    public String getWidth() {
        return "100cm";
    }

    @Override
    public String getHeight() {
        return "100cm";
    }
}