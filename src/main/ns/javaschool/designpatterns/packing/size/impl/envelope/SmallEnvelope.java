package ns.javaschool.designpatterns.packing.size.impl.envelope;

import ns.javaschool.designpatterns.packing.size.envelope.EnvelopeSize;

public class SmallEnvelope extends EnvelopeSize {

    @Override
    public String getDescription() {
        return "Small";
    }

    @Override
    public String getLength() {
        return "30cm";
    }

    @Override
    public String getWidth() {
        return "10cm";
    }

    @Override
    public double getPrice() {
        return 2.35;
    }
}