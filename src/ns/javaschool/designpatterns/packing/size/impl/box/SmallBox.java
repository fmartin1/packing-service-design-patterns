package ns.javaschool.designpatterns.packing.size.impl.box;

import ns.javaschool.designpatterns.packing.size.box.BoxSize;

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