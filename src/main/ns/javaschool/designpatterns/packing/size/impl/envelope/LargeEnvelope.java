package ns.javaschool.designpatterns.packing.size.impl.envelope;

import ns.javaschool.designpatterns.packing.size.envelope.EnvelopeSize;

public class LargeEnvelope extends EnvelopeSize {

    @Override
    public String getDescription() {
        return "large";
    }

    @Override
    public String getLength() {
        return "60cm";
    }

    @Override
    public String getWidth() {
        return "45cm";
    }

    @Override
    public double getPrice() {
        return 10.85;
    }
}