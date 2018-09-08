package ns.javaschool.designpatterns.packing.size.impl.box;

import ns.javaschool.designpatterns.packing.size.box.BoxSize;

public class LargeBox extends BoxSize {

    @Override
    public String getDescription() {
        return "Large";
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
        return "300cm";
    }

    @Override
    public double getPrice() {
        return 50.5;
    }
}