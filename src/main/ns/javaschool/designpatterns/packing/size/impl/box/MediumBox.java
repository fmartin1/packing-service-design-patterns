package ns.javaschool.designpatterns.packing.size.impl.box;

import ns.javaschool.designpatterns.packing.size.box.BoxSize;

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

    @Override
    public double getPrice() {
        return 30.8;
    }
}